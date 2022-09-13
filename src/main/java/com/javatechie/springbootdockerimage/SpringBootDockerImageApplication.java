package com.javatechie.springbootdockerimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {

    @GetMapping("/")
     public String initializeImage(){
        return "Docker image has started";
    }



    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerImageApplication.class, args);
    }

}
