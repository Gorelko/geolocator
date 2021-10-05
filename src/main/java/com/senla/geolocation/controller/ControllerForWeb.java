package com.senla.geolocation.controller;

import com.senla.geolocation.service.RequestApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.*;

@Controller
public class ControllerForWeb {

    @GetMapping("/")
    public String mainPage(
            Map<String, Object> model
    ) {
        return "main";
    }

    @PostMapping("/main")
    public String add(
            @RequestParam(name = "enterData") String enterData,
            @RequestParam(name = "artificialCache") StringBuilder artificialCache,
            Map<String, Object> model
    ) throws IOException {

        String arrArtificialCache[] = artificialCache.toString().split("separator");
        if (enterData.replaceAll(" ", "").length() != 0) {
            for (int i = 0; i < arrArtificialCache.length; i++) {
                if (arrArtificialCache[i].trim().equals(enterData.trim())) {
                    enterData = "Такой же запрос уже был! Запрос не отправлен!";
                    break;
                }
            }
        }

        artificialCache.append("separator").append(enterData);

        if (!enterData.equals("Такой же запрос уже был! Запрос не отправлен!") && enterData.replaceAll(" ", "").length() != 0) {
            enterData = RequestApi.requestApi(enterData);
        }

        if (enterData.replaceAll(" ", "").length() == 0) {
            model.put("notice", "Вы не ввели исходные данные!");
        } else {
            model.put("notice", enterData);
        }

        model.put("artificialCache", artificialCache);

        return "main";
    }
}
