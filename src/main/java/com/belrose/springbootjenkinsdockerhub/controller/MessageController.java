package com.belrose.springbootjenkinsdockerhub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class MessageController {
    @GetMapping("/message")
    public ResponseEntity<String> displayMessage(){
        log.info("Demo to push and pull images to docker hub using GitHub and Jenkins...");
        return ResponseEntity.ok("Demo to push and pull images to docker hub using GitHub and Jenkins...");
    }
}
