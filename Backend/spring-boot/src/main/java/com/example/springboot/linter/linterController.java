package com.example.springboot.linter;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/user", produces = MediaType.APPLICATION_JSON_VALUE + "; charset=utf-8")
public class linterController
{

    @Autowired
    private linterRepository userRepository;


    @GetMapping("/{code}")
    public String findUserById(@PathVariable(value = "code") String code) {
        String q = "function%20main%20()%7B%0Avar%20a%20=%205;%20%0Aconst%20pi%20=%203,1415;%20%0Alet%20c,d;%20%0A%0Afor(%20i=20;%20i%3C5;%20i--)%0A%7B%09if(%20i%20%252%20==%200)%20%0A%09%7B%09console.log(%20a);%20%0A%09%7D%0A%09else%7B%09console.log(%20c%20-%20d);%20%0A%09%7D%0A%7D%0A%7D";
        System.out.println(URLDecoder.decode(q, StandardCharsets.UTF_8));
         URLEncoder.encode(q, StandardCharsets.UTF_8);
        return URLDecoder.decode(code, StandardCharsets.UTF_8);

    }
}