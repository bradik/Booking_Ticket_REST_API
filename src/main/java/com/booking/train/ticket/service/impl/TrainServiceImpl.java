package com.booking.train.ticket.service.impl;

import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.model.Train;
import com.booking.train.ticket.repository.StationRepository;
import com.booking.train.ticket.repository.TrainRepository;
import com.booking.train.ticket.service.StationService;
import com.booking.train.ticket.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainRepository dao;

    @Override
    public List<Train> findByNumberLike(String name) {
        return dao.findByTrainNumberContainingOrderByTrainNumberAsc(name);
    }

    @Override
    public Train getByNumber(String name) {
        return dao.getByTrainNumber(name);
    }

    @Override
    public Train getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(Train train) {
        dao.save(train);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

}
