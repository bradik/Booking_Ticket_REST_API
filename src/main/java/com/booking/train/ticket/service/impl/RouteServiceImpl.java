package com.booking.train.ticket.service.impl;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.repository.RouteRepository;
import com.booking.train.ticket.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Brad on 17.09.2017.
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository dao;

    @Override
    public Route getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(Route route) {
        dao.save(route);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    public List<Route> findAll() {
        List<Route> result = new ArrayList<>();
        result = dao.findAll();
        return result;
    }

    @Override
    public List<Route> findAll(Integer fromeStationId, Integer toStationId, Date departureDate, Date arrivalDate) {

        List<Route> result = dao.findAll(fromeStationId, toStationId, departureDate, arrivalDate);

        return result;
    }

}
