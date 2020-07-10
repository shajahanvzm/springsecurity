package com.sha.ldap.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String index(){
        return "<h2>Welcome<h2>";
    }

}
