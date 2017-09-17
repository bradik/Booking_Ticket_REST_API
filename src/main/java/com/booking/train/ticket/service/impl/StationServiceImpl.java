package com.booking.train.ticket.service.impl;

import com.booking.train.ticket.repository.StationRepository;
import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationRepository dao;

    @Override
    public List<Station> findByNameLike(String name) {
        return dao.findByNameContainingOrderByNameAsc(name);
    }

    @Override
    public Station getByName(String name) {
        return dao.getByName(name);
    }

    @Override
    public Station getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(Station station) {
        dao.save(station);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

}
