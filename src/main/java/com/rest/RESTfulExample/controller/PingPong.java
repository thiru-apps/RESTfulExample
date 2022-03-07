package com.rest.RESTfulExample.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPong {

  @GetMapping("/host")
  public ResponseEntity<?> getHost(HttpServletRequest request) {
    return ResponseEntity.ok(request.getHeader("host"));
  }

  @GetMapping("/ping")
  public ResponseEntity<?> ping() {
    return ResponseEntity.ok("pong");
  }

}
