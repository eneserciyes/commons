package tr.com.ogedik.commons.rest.request.model;

import lombok.*;
import tr.com.ogedik.commons.model.BusinessObject;

import java.util.Date;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUpdateWorklogRequest implements BusinessObject {
  private long id;
  private String issueKey;
  private String comment;
  private Date started;
  private int timeSpentSeconds;
}
