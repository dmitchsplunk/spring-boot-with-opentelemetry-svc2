package org.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class MyApplication {

    @RequestMapping("/pong")
    String home() {
        return "pong";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}