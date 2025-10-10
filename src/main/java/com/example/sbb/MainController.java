package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //이 클래스를 스프링 부트의 컨트롤러로 지정
public class MainController {
	@GetMapping("/sbb") //404오류없앰
	@ResponseBody
	public String index() {
		return "안녕하세요 sbb에 오신 것을 환영합니다.";
	}
}
