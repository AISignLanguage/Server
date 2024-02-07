package TestMomentOfGestures.example.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CallListResponse {

    public CallListResponse() {}

    public CallListResponse(String uri, Boolean installCheck) {
        this.uri = uri;
        this.installCheck = installCheck;
    }

    private String uri;
    private Boolean installCheck;
}
@Getter
@Setter
class CallList {
    private String uri;
    private Boolean installCheck;
}


