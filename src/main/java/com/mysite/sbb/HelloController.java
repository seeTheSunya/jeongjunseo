package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 클래스가 컨트롤러임을 알려줌
public class HelloController {

    @GetMapping("/hello") // /hello URL 요청 시 이 메서드가 실행됨
    @ResponseBody // 메서드의 리턴값이 문자열 그 자체임을 나타냄
    public String hello() {
    	//return "Hello SBB";
        return "Hello Spring Boot Board";
    }
}