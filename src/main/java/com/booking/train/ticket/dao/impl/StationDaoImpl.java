package com.booking.train.ticket.dao.impl;

import com.booking.train.ticket.dao.StationDao;
import com.booking.train.ticket.model.Station;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Brad on 16.09.2017.
 */

@Repository
public class StationDaoImpl implements StationDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void create(Station station) {
        entityManager.persist(station);
    }

    @Override
    public void update(Station station) {
        entityManager.merge(station);
    }

    @Override
    public Station getStationById(long id) {
        return entityManager.find(Station.class, id);
    }

    @Override
    public void delete(long id) {
        Station station = getStationById(id);
        if (station != null) {
            entityManager.remove(station);
        }
    }
}
