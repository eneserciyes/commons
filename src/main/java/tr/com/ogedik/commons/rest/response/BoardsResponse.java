package tr.com.ogedik.commons.rest.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.commons.rest.response.model.Board;

import java.util.List;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardsResponse extends JiraResponse {
  private List<Board> values;
}
