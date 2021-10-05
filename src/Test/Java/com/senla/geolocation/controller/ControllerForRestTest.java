package com.senla.geolocation.controller;

import org.junit.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.*;

public class ControllerForRestTest {

    @Test
    public void getOne() throws IOException {

        ControllerForRest controllerForRest = new ControllerForRest();
        Map <String, String> mapActual = controllerForRest.getOne("37.587874, 55.73367");

        String expected = "{adress=Россия, Москва, улица Льва Толстого, 16}";

        assertNotNull(mapActual);

        assertEquals(expected,mapActual.toString());


    }
}