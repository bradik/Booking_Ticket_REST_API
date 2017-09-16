package com.booking.train.ticket.dao;

import com.booking.train.ticket.model.Station;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Brad on 16.09.2017.
 */

public interface StationDao {
    void create(Station station);

    void update(Station station);

    Station getStationById(Integer id);

    void delete(Integer id);

}
