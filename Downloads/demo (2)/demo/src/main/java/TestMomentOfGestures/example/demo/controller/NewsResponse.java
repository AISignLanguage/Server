package TestMomentOfGestures.example.demo.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsResponse {

    public NewsResponse() {}

    public NewsResponse(String title, String image, String content){
       this.title = title;
       this.image = image;
       this.content = content;
    }

    private String title;
    private String image;
    private String content;

}

@Getter
@Setter
class NewsList {
    private String title;
    private String image;
    private String content;

}

