package io.reflectoring.booking.controller;

import io.reflectoring.booking.BookingModuleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping(path = "/public/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    public TestController(){
           logger.info("TestController constructor called");
    }

    @RolesAllowed("ADMIN")
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello... where is my admin ? :'(");
    }
}
