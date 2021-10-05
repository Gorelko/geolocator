package com.senla.geolocation.controller;

import com.senla.geolocation.service.RequestApi;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("rest")
public class ControllerForRest {

    Set<String> setCache = new HashSet<>();

    @GetMapping("{adress}")
    public Map<String, String> getOne(@PathVariable String adress) throws IOException {

        Map<String, String> map = new HashMap<>();

        if (!setCache.contains(adress)) {
            map.put("adress", RequestApi.requestApi(adress));
        } else {
            map.put("adress", "Такой же запрос уже был! Запрос не отправлен!");
        }

        setCache.add(adress);

        return map;
    }
}