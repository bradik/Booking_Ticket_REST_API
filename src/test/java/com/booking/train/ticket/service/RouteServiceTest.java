package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.model.Station;
import com.booking.train.ticket.model.Train;
import com.booking.train.ticket.util.DateFormater;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Brad on 17.09.2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RouteServiceTest {

    @Autowired
    private RouteService routeService;

    @Autowired
    private TrainService trainService;

    @Autowired
    private StationService stationService;

    @Test
    public void findAllTest() throws Exception {

        List<Route> expected = Arrays.asList(
                getRoute("029А", "St.Peterburg", "Москва Окт", "21.09.2017 05:30:00", "21.09.2017 09:30:00"),
                getRoute("031А", "St.Peterburg", "Москва Курс", "21.09.2017 06:00:00", "21.09.2017 10:00:00"),
                getRoute("037А", "St.Peterburg", "Москва Окт", "21.09.2017 10:00:00", "21.09.2017 18:30:00")
        );

        for (Route route : expected) {
            routeService.save(route);
        }

        List<Route> actual = routeService.findAll(getStation("St.Peterburg").getId(), null, DateFormater.of("21.09.2017 00:00:00"), null);
        assertThat(actual, is(expected));
        //List<Route> routeList = routeService.findAll(getStation("St.Peterburg"), getStation("Moscow - 1"), DateFormater.of("17.09.2017 12:00:00"), DateFormater.of("17.09.2017 18:00:00"));
        //List<Route> routeList = routeService.findAll(getStation("St.Peterburg"), getStation("Moscow - 1"), DateFormater.of("17.09.2017 12:00:00"), null);
        //List<Route> routeList = routeService.findAll(getStation("St.Peterburg"), null, DateFormater.of("17.09.2017 12:00:00"), null);

    }

    private Route getRoute(String train, String fromStation, String toStation, String departureDate, String arrivalDate) {

        Route route = new Route();

        route.setTrain(getTrain(train));
        route.setFromStation(getStation(fromStation));
        route.setToStation(getStation(toStation));
        route.setDepartureDate(DateFormater.of(departureDate));
        route.setArrivalDate(DateFormater.of(arrivalDate));


        return route;
    }

    private Train getTrain(String train) {

        return trainService.getByNumber(train);
    }

    private Station getStation(String station) {

        return stationService.getByName(station);
    }

}
