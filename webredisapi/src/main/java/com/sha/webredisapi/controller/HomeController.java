package com.sha.webredisapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    private String getRoot() {
        return "<h2>Welcome</h2>";
    }

    @GetMapping("/user")
    private String getUser() {
        return "<h2>Welcome User</h2>";
    }

    @GetMapping("/admin")
    private String getAdmin() {
        return "<h2>Welcome Admin</h2>";
    }

}
