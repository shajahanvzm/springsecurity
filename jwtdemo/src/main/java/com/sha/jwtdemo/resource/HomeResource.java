package com.sha.jwtdemo.resource;

import com.sha.jwtdemo.model.AuthenticateRequest;
import com.sha.jwtdemo.model.AuthenticateResponse;
import com.sha.jwtdemo.service.MyUserDetailsService;
import com.sha.jwtdemo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {



    @Autowired
    private  AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;


    @GetMapping("/")
    public String index(){
        return "<h2>Home Index Page</h2>";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createJWTToken(@RequestBody AuthenticateRequest request) throws Exception {
        try {
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword())
            );

        } catch (BadCredentialsException e) {
            throw new Exception("Incorret User name and Password ",e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUserName());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticateResponse(jwt));
    }
}

