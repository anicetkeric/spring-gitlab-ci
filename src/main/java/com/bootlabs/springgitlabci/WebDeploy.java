package com.bootlabs.springgitlabci;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class WebDeploy {

    @GetMapping("/deploy")
    public String index() {
        return MessageFormat.format("Web deploy ok: {0}", LocalDateTime.now());
    }

}
