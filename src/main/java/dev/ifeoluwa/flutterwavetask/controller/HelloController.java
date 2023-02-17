package dev.ifeoluwa.flutterwavetask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author on 17/02/2023
 * @project
 */
@RestController
public class HelloController {


    @GetMapping("/greet/{name}")
    public String greetings(@PathVariable("name") String name) {
        return "Hello World! This is " + name + "'s world!";
    }

}
