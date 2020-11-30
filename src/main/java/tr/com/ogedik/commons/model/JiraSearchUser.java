package tr.com.ogedik.commons.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JiraSearchUser {
    private String key;

    private String name;

    private String emailAddress;

    private String displayName;

    private String active;

    private String timeZone;

    private String locale;

    private Map<String, String> avatarUrls;
}
