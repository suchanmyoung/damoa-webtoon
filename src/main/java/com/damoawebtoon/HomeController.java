package com.damoawebtoon;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/binding")
    public String binding(@RequestBody String title){
        System.out.println(title);
        System.out.println("들오긴함");
        return "ok";
    }
}
