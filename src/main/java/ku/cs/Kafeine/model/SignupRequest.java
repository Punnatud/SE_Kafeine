package ku.cs.Kafeine.model;

import lombok.Data;

@Data
public class SignupRequest {
    private String name;
    private String username;
    private String password;
}
