package tr.com.ogedik.commons.util;

import tr.com.ogedik.commons.expection.ErrorException;
import tr.com.ogedik.commons.expection.constants.CommonErrorType;
import tr.com.ogedik.commons.rest.response.model.WorklogRecord;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

  private static final SimpleDateFormat worklogDateFormat =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  private static final SimpleDateFormat calendarDateFormat =
      new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
  private static final SimpleDateFormat timelessDateFormat =
          new SimpleDateFormat("yyyy-MM-dd");

  public static Date convertWorklogDateString(String worklogDate) {
    try {
      return worklogDateFormat.parse(worklogDate);
    } catch (ParseException e) {
      throw new ErrorException(
          CommonErrorType.INTERNAL_ERROR, "Date string cannot be parsed to Date object");
    }
  }

  public static Date convertTimelessDateString(String date){
    try {
      return timelessDateFormat.parse(date);
    } catch (ParseException e) {
      throw new ErrorException(
              CommonErrorType.INTERNAL_ERROR, "Date string cannot be parsed to Date object");
    }
  }

  public static Date convertCalendarDateString(String calendarDate) {
    try {
      return calendarDateFormat.parse(calendarDate);
    } catch (ParseException e) {
      throw new ErrorException(
          CommonErrorType.INTERNAL_ERROR, "Date string cannot be parsed to Date object");
    }
  }

  public static boolean isBetween(WorklogRecord worklogRecord, String startDate, String endDate) {
    Date min = convertCalendarDateString(startDate + "T00:00:00");
    Date max = convertCalendarDateString(endDate + "T23:59:59");
    Date started = convertWorklogDateString(worklogRecord.getStarted());

    return (started.after(min) | started.equals(min))
        && (started.before(max) | started.equals(max));
  }

  public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate) {
    Calendar startCal = Calendar.getInstance();
    startCal.setTime(startDate);

    Calendar endCal = Calendar.getInstance();
    endCal.setTime(endDate);

    int workDays = 0;

    //Return 0 if start and end are the same
    if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
      if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)
        return 1;
      return 0;
    }

    if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
      startCal.setTime(endDate);
      endCal.setTime(startDate);
    }

    do {
      if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
        ++workDays;
      }
      startCal.add(Calendar.DAY_OF_MONTH, 1);
    } while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());

    return workDays;
  }
}
