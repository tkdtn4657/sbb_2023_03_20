package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody // 타임리프
    public String index(){
        return "안녕하세요 sbb에 오신것을 환영합니다!!!"; // src/main/resources/templates/index.html 실행하겠다 의미.
    }

}
