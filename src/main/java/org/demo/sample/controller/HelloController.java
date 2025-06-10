package org.demo.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/login")
  public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
    return ResponseEntity.ok("User " + username + " logged in successfully with password " + password);
  }

  @PostMapping("/login2")
  public ResponseEntity<String> login2(@RequestParam String username, @RequestParam String password) {
    return ResponseEntity.ok("User " + username + " logged in successfully with password " + password);
  }
}
