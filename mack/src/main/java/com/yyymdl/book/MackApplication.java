package com.yyymdl.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MackApplication {

    @RequestMapping(value = "/go")
    public String available() {
        return "mack in action";
    }

    @RequestMapping(value = "/out")
    public String checkedOut() {
        return "mack out";
    }
    public static void main(String[] args) {
        SpringApplication.run(MackApplication.class, args);
    }
}