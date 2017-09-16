package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Station;

/**
 * Created by Brad on 16.09.2017.
 */
public interface StationService {
    void create(Station station);

    void update(Station station);

    Station getStationById(Integer id);

    void delete(Integer id);
}
