package com.bootlabs.springgitlabci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class WebDeploy {

    @GetMapping("/deploy")
    public String index() {
        return "Web deploy ok: " + LocalDateTime.now();
    }

}
