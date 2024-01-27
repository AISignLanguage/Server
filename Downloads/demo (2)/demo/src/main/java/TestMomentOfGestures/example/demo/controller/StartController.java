package TestMomentOfGestures.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class StartController {

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User userData(){
        User user = new User("jiwon","jwp0329");
        return user;
    }


    @PostMapping("/save-user")
    @ResponseBody
    public void saveUser(@RequestBody User user) {
        log.info("username={}",user.getUsername());
        log.info("nickname={}",user.getUsernick());
    }


    @PostMapping("/send-data")
    public MyResponse sendData(@RequestBody User user) {
        MyResponse response = new MyResponse();
        response.setLogIn_ok(true);
        return response;
    }
}


