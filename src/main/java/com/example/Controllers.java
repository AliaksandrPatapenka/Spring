package com.example;


import org.springframework.web.bind.annotation.*;


@RestController
public class Controllers {

    @GetMapping("/user/{id}")
    public String getTest(@PathVariable String id) {
        return "userId: " + id;
    }

    @PostMapping ("/api")
    public  String postTest(@RequestBody PostRequestDTO userRequest) {
        return  "userId: " + userRequest.getId() +
                ", userName: " + userRequest.getName() +
                ", userEmail: " + userRequest.getEmail();
    }
}
