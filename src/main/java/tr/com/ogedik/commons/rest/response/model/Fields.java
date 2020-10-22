package tr.com.ogedik.commons.rest.response.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.commons.model.BusinessObject;
import tr.com.ogedik.commons.model.JiraUser;

/*
 *
 * @author enes.erciyes
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fields implements BusinessObject {
  private String summary;
  private Worklog worklog;
  private Sprint sprint;
  private JiraUser assignee;
}
