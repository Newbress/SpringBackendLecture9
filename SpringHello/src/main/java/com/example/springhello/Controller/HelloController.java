package com.example.springhello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController      // HTTP 요청을 처리하는 컨트롤러임을 선언
public class HelloController {

    @GetMapping("/hello")  // GET /hello 요청 매핑
    public Map<String, Object> hello() {
        return Map.of(
                "message", "hello",
                "server", "spring-boot"
        );
    }
}