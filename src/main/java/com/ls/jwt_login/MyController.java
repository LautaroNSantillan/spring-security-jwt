package com.ls.jwt_login;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MyController {
    @PostMapping(value="my")
    public String welcome(){
        return "welcome to this secure endpoint";
    }
}
