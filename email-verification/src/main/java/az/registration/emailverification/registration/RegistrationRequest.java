package az.registration.emailverification.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName; //if it is final we have to add allConstructor
    private final String lastName;
    private final String email;
    private final String password;
}
