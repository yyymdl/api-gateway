package com.yyymdl.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookApplication {

    @RequestMapping(value = "/go")
    public String available() {
        return "book in Action";
    }

    @RequestMapping(value = "/out")
    public String checkedOut() {
        return "book out";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
    }
}