package com.damian.sga.controller;

import com.damian.sga.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/test")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<Response> hello() {
        return new ResponseEntity<>(new Response(200, "Hello World!", null), HttpStatus.OK);
    }
    @GetMapping("/yo")
    public ResponseEntity<Response> yoo() {
        return new ResponseEntity<>(new Response(200, "yoooo!", null), HttpStatus.OK);
    }

}
