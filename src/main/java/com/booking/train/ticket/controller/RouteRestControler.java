package com.booking.train.ticket.controller;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.service.RouteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@RestController
@RequestMapping(value = RouteRestControler.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class RouteRestControler {
    static final String REST_URL = "/rest/routes";
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private RouteService routeService;

    private static final Logger logger = LoggerFactory.getLogger(RouteRestControler.class);

    @GetMapping(value = "/filter")
    public List<Route> getRouteFilter(
            @RequestParam(value = "fromStationId", required = false) Integer fromStationId,
            @RequestParam(value = "toStationId", required = false) Integer toStationId,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
            @RequestParam(value = "departureDate", required = false) Date departureDate,
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
            @RequestParam(value = "arrivalDate", required = false) Date arrivalDate) {
        logger.info("getRouteFilter() request received");


        List<Route> result = routeService.findAll(fromStationId, toStationId, departureDate, arrivalDate);
        return result;
    }
}
