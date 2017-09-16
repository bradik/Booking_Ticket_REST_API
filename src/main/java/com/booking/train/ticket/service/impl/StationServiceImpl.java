package com.booking.train.ticket.service.impl;

import com.booking.train.ticket.dao.StationDao;
import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Brad on 16.09.2017.
 */

@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationDao dao;

    @Override
    public void create(Station station) {
        dao.create(station);
    }

    @Override
    public void update(Station station) {
        dao.update(station);
    }

    @Override
    public Station getStationById(Integer id) {
        return dao.getStationById(id);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

}
