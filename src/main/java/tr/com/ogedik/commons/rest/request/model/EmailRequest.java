package tr.com.ogedik.commons.rest.request.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {
  String to;
  String subject;
  String body;
}
