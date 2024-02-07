package TestMomentOfGestures.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class StartController {


    @PostMapping("/send-data")
    public MyResponse sendData(@RequestBody User user) {
        MyResponse response = new MyResponse();
        response.setId_ok(true);
        response.setPwd_ok(true);
        return response;
    }

    @PostMapping("/send-callList")
    public CallListResponse sendCallListData(@RequestBody CallList user) {
        CallListResponse response = new CallListResponse();
        response.setUri("hello");
        response.setInstallCheck(true);
        return response;
    }
}


