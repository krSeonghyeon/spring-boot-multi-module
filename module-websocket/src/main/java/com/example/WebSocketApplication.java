package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class WebSocketApplication {

    //의존성 확인을 위한 코드 - 시작
    private final TestBean testBean;

    public WebSocketApplication(TestBean testBean) {
        this.testBean = testBean;
    }

    @PostConstruct
    public void dependencyTest() {
        testBean.dependencyTest();
    }
    //의존성 확인을 위한 코드 - 끝

    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }
}
