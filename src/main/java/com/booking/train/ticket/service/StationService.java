package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Station;

import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */
public interface StationService {

    Station getByName(String name);
    List<Station> findByNameLike(String name);
    Station getById(Integer id);
    void save(Station station);
    void delete(Integer id);

}
