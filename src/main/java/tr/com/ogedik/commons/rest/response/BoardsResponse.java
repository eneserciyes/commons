package tr.com.ogedik.commons.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.commons.model.BusinessObject;
import tr.com.ogedik.commons.rest.response.model.Board;

import java.util.List;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardsResponse implements BusinessObject {
    private List<Board> values;
    private int maxResults;
    private int startAt;
    private int total;
    private boolean isLast;
}
