package br.com.authapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpledController {

    @GetMapping( value = "/open")
    public String getOpen() {
        return "Open Hello World!";
    }

    @GetMapping( value = "/restricted")
    public String getRestricted() {
        return "Restricted Hello World!";
    }

}
