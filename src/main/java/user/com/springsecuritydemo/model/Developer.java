package user.com.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //To get getters and setters
@AllArgsConstructor //To get constructor?
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}
