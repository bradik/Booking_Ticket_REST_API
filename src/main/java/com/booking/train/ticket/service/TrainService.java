package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.model.Train;

import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */
public interface TrainService {

    Train getByNumber(String trainNumber);
    List<Train> findByNumberLike(String name);
    Train getById(Integer id);
    void save(Train train);
    void delete(Integer id);

}
