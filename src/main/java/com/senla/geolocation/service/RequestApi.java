package com.senla.geolocation.service;

import org.json.JSONObject;
import java.io.IOException;
import java.net.URLEncoder;

public class RequestApi {

    public static String requestApi(String requestAdress) throws IOException {

        String url = "https://geocode-maps.yandex.ru/1.x/?format=json&apikey=3f84dcb2-105a-4fc9-8f8b-769b40ab985e&lang=ru_RU&geocode=" + URLEncoder.encode(requestAdress, java.nio.charset.StandardCharsets.UTF_8.toString());
        JSONObject json = JsonReader.readJsonFromUrl(url);

        String coordinate = "";

        try {
            if (requestAdress.matches("[^a-zA-Zа-яА-Я]+")) {
                coordinate = json.toString().split("\"text\":\"")[1].split("\"}}")[0];
            } else {
                coordinate = json.toString().split("\"pos\":\"")[1].split("\"}")[0];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            coordinate = "Введите более точные вводные данные!";
        }

        return coordinate;
    }
}
