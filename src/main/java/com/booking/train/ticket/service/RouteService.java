package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.model.Station;

import java.util.Date;
import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */
public interface RouteService {

    Route getById(Integer id);

    void save(Route route);

    void delete(Integer id);

    List<Route> findAll();
    List<Route> findAll(Integer fromeStationId, Integer toStationId, Date departureDate, Date arrivalDate);
}
