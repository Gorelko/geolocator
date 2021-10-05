package com.senla.geolocation.service;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class RequestApiTest {

    @Test
    public void requestApi() throws IOException {
        String actual1 = RequestApi.requestApi("37.587874, 55.73367");
        String expected1 = "Россия, Москва, улица Льва Толстого, 16";
        assertEquals(expected1, actual1);

        String actual2 = RequestApi.requestApi("Россия, Москва, улица Льва Толстого, 16");
        String expected2 = "37.587093 55.733974";
        assertEquals(expected2, actual2);
    }
}