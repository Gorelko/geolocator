package com.senla.geolocation.service;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonReaderTest {

    @Test
    public void readJsonFromUrl() throws IOException {

        String url = "https://geocode-maps.yandex.ru/1.x/?format=json&apikey=3f84dcb2-105a-4fc9-8f8b-769b40ab985e&lang=ru_RU&geocode=37.587874,%55.73367";

        assertNotNull(JsonReader.readJsonFromUrl(url));
    }
}