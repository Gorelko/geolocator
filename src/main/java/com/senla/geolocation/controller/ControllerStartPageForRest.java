package com.senla.geolocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class ControllerStartPageForRest {

    @GetMapping("/rest")
    public String mainPage1(
            Map<String, Object> model
    ) {
        return "rest";
    }
}

