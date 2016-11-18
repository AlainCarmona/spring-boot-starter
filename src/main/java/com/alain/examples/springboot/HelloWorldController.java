
package com.alain.examples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Z841158
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
    
    @RequestMapping("/")
    @ResponseBody
    String getMessage() {
        return "<h1>Hello World!</h1>";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldController.class, args);
    }
    
}
