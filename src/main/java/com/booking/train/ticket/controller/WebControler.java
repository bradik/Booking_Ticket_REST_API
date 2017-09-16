package com.booking.train.ticket.controller;

import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@RestController
@EnableAutoConfiguration
public class WebControler {

    @Autowired
    private StationService stationService;

    private static final Logger logger = LoggerFactory.getLogger(WebControler.class);

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Station> getStations(){
        logger.info("getStations() request received");
        List<Station> stations = new ArrayList<>();
        stations.add(stationService.getStationById(1L));
        return stations;
    }
}
