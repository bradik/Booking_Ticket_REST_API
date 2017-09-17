package com.booking.train.ticket.repository;

import com.booking.train.ticket.model.Station;
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
public interface StationRepository extends JpaRepository<Station, Integer> {

    Station getById(Integer id);

    Station getByName(String name);

    @Query("SELECT s FROM #{#entityName} s WHERE s.name like concat('%', :name, '%') ORDER BY s.name asc")
    List<Station> findByPartName(@Param("name") String name);

    List<Station> findByNameContainingOrderByNameAsc(String name);

    @Transactional
    @Override
    Station save(Station station);

    @Transactional
    @Override
    void delete(Integer id);

}
