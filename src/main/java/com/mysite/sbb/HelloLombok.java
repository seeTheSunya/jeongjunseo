package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;
//import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Getter // 모든 속성에 대한 Getter 메서드를 자동으로 생성
@Setter // 모든 속성에 대한 Setter 메서드를 자동으로 생성
public class HelloLombok {

    private final String hello;
    private final int lombok;
    
    public HelloLombok(String hello, int lombok) {
    	this.hello=hello;
    	this.lombok=lombok;
    }
    /*
    public void sethelloc(String hello) {
    	this.hello=hello;
    }
    public void setLombok(int lombok) {
    	this.lombok=lombok;
    }
    public String getHello() {
    	return this.hello;
    }
    public int getlobok() {
    	return this.lombok;
    }
*/
    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로", 5);
  
        
        // Setter를 직접 작성하지 않았지만 롬복 덕분에 사용 가능
        /*
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);
*/
        // Getter를 직접 작성하지 않았지만 롬복 덕분에 사용 가능
        System.out.println(helloLombok.getHello()); // "헬로" 출력
        System.out.println(helloLombok.getLombok()); // 5 출력
    }
}
