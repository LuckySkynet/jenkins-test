package com.skynet.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Skynet
 * @date 2017年05月19日 16:59
 */
@RestController
public class JenkinsController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello " + name;
    }

}
