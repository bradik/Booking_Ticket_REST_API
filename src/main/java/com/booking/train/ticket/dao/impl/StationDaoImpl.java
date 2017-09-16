package com.booking.train.ticket.dao.impl;

import com.booking.train.ticket.dao.StationDao;
import com.booking.train.ticket.model.Station;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Brad on 16.09.2017.
 */

@Repository
@Transactional(readOnly = true)
public class StationDaoImpl implements StationDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void create(Station station) {
        entityManager.persist(station);
    }

    @Override
    @Transactional
    public void update(Station station) {
        entityManager.merge(station);
    }

    @Override
    public Station getStationById(Integer id) {
        return entityManager.find(Station.class, id);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Station station = getStationById(id);
        if (station != null) {
            entityManager.remove(station);
        }
    }
}
