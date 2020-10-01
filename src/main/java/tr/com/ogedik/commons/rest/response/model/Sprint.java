package tr.com.ogedik.commons.rest.response.model;

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
public class Sprint {
    private long id;
    private String name;
    private String startDate;
    private String endDate;
}
