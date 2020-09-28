package io.reflectoring.booking.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin/test")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    public AdminController(){
           logger.info("TestController constructor called");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello My Admin :D");
    }
}
