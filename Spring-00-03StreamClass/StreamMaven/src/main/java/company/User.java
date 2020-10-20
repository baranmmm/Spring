package company;

import enums.Gender;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime, long lastUpdateUserId, String firstName, String lastName, Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.gender = gender;
    }
}
