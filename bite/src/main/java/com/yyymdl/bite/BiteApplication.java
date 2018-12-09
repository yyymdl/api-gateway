package com.yyymdl.bite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BiteApplication {

    @RequestMapping(value = "/go")
    public String available() {
        return "appfront1 bite";
    }

    @RequestMapping(value = "/out")
    public String checkedOut() {
        return "book out";
    }

    public static void main(String[] args) {
        SpringApplication.run(BiteApplication.class, args);
    }
}