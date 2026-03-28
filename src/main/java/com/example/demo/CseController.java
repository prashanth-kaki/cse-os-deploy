package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String disp() {
        int number = 5;
        String result = "";

        for(int i = 1; i <= 10; i++) {
            result += number + " x " + i + " = " + (number * i) + "<br>";
        }

        return result;
    }
}
