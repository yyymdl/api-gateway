package com.yyymdl.suke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SukeApplication {

    @RequestMapping(value = "/go")
    public String available() {
        return "appfront2 suke";
    }

    @RequestMapping(value = "/out")
    public String checkedOut() {
        return "book out";
    }

    public static void main(String[] args) {
        SpringApplication.run(SukeApplication.class, args);
    }
}