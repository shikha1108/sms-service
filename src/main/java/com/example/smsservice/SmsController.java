package com.example.smsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @GetMapping("/send/sms")
    public String index() {
        return "Greetings from Bruno!";
    }

}