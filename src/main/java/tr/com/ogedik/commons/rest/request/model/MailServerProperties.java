package tr.com.ogedik.commons.rest.request.model;

import lombok.*;
import tr.com.ogedik.commons.annotation.NotNull;

/*
 * @author enes.erciyes
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MailServerProperties {
    @NotNull private String host;
    @NotNull private String port;
    @NotNull private String username;
    @NotNull private String password;
    @NotNull private String enctype;
    @NotNull private String auth;
}
