package com.alipay.spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhch0633 on 18/01/17.
 *
 */
@RestController
public class TestController {
    @RequestMapping("/test")
    public String index() {
        return "Test from Spring Boot!";
    }
}
