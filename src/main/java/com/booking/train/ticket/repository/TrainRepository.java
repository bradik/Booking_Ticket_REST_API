package com.booking.train.ticket.repository;

import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@Transactional(readOnly = true)
public interface TrainRepository extends JpaRepository<Train, Integer> {

    Train getById(Integer id);

    Train getByTrainNumber(String trainNumber);

    List<Train> findByTrainNumberContainingOrderByTrainNumberAsc(String trainNumber);

    @Transactional
    @Override
    Train save(Train train);

    @Transactional
    @Override
    void delete(Integer id);

}
