package TestMomentOfGestures.example.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String usernick;
    public User() {
    }
    public User(String username, String usernick) {
        this.username = username;
        this.usernick = usernick;
    }
}



@Getter
@Setter
class MyResponse {
    private Boolean logIn_ok;

}