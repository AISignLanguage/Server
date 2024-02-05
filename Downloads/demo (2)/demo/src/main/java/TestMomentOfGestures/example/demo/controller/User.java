package TestMomentOfGestures.example.demo.controller;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String name;
    private String birthday;
    private String email;
    private String password;
    private String nickName;
    private String phoneNumber;


    public User() {
    }

    public User(String name, String birthday, String email, String password, String nickName, String phoneNumber) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
    }
}



@Getter
@Setter
class MyResponse {
    private Boolean id_ok;
    private Boolean pwd_ok;
}