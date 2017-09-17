package com.booking.train.ticket.repository;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.model.Station;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by Brad on 16.09.2017.
 */

@Transactional(readOnly = true)
public interface RouteRepository extends JpaRepository<Route, Integer>, JpaSpecificationExecutor {

    Route getById(Integer id);

    @Transactional
    @Override
    Route save(Route route);

    @Transactional
    @Override
    void delete(Integer id);

//    List<Route> findByDepartureDate(Date departureDate);
//
//    List<Route> findByArrivalDate(Date arrivalDate);
//
//    List<Route> findByDepartureDateAndArrivalDate(Date departureDate, Date arrivalDate);
//
//    List<Route> findByFromStation(Station station);
//
//    List<Route> findByToStation(Station station);
//
//    List<Route> findByDepartureDateAndFromStation(Date departureDate, Station station);
//

    @Query("SELECT r from #{#entityName} r WHERE "+
            "(r.fromStation.id=?1 OR ?1=null) AND (r.toStation.id=?2 OR ?2=null ) "+
            "AND (r.departureDate >=?3 OR ?3 is null) AND (r.arrivalDate <=?4 OR ?4 is null) ORDER BY r.departureDate")
    List<Route> findAll(Integer fromStationId, Integer toStationId, Date departureDate, Date ArrivalDate);

    List<Route> findAll();

}
