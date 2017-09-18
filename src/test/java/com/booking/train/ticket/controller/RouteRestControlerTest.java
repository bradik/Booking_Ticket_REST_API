package com.booking.train.ticket.controller;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RouteRestControlerTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String REST_URL = RouteRestControler.REST_URL;

    @Test
    public void getRouteFilterTest() throws Exception {
        String actual;
        final String expected =
                "{\"id\":1,\"train\":{\"id\":2,\"name\":\"С-Петер-Гл — Москва Окт\",\"trainNumber\":\"029А\","+
                "\"new\":false},\"fromStation\":{\"id\":3,\"name\":\"St.Peterburg\",\"new\":false},"+
                "\"toStation\":{\"id\":1,\"name\":\"Москва Окт\",\"new\":false},\"departureDate\":1505638800000,"+
                "\"arrivalDate\":1505660400000,\"new\":false}";


        actual =

                mockMvc.perform(get(REST_URL + "/filter")
                        .param("fromStationId", "3"))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                        .andReturn().getResponse().getContentAsString();



        Assert.assertThat(actual, StringContains.containsString(expected));

        actual =

        mockMvc.perform(get(REST_URL+"/filter")
                .param("fromStationId","3")
                .param("toStationId","1")
                .param("departureDate","2017-09-17 10:30:00"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andReturn().getResponse().getContentAsString();



        Assert.assertThat(actual, StringContains.containsString(expected));

    }

}
