package tr.com.ogedik.commons.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.commons.model.BusinessObject;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JiraResponse implements BusinessObject {
    private int maxResults;
    private int startAt;
    private int total;
    private boolean isLast;
}
