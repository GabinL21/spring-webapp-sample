package org.demo.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {

    @GetMapping("/management")
    @ResponseBody
    public String management() {
        return "This is a management endpoint.";
    }
}
