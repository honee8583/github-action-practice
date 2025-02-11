package com.example.githubactionspractice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BasicController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        log.info("HELLO!");
        return ResponseEntity.ok().body("hello2");
    }
}
