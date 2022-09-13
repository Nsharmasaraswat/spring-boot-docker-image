package com.javatechie.springbootdockerimage.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/test-image")
    public String testImage() {
        return "Welcome eto String Image";
    }

    @RequestMapping("/testImage/{name}")
    public String testImageWith(@PathVariable("name") String name) {
        return "Welcome " + name + " in the docker world";
    }


}
