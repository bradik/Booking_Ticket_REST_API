package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Station;

/**
 * Created by Brad on 16.09.2017.
 */
public interface StationService {
    void create(Station station);

    void update(Station station);

    Station getStationById(long id);

    void delete(long id);
}
