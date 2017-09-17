package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Station;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StationServiceTest {

    @Autowired
    private StationService service;

    @Test
    public void findByNameLikeTest() throws Exception {

        Station newStation = new Station("Moscow - 3");
        service.save(newStation);

        List<Station> expected = new ArrayList<>();
        expected.add(service.getByName("Moscow - 1"));
        expected.add(service.getByName("Moscow - 2"));
        expected.add(service.getByName("Moscow - 3"));

        List<Station> actual = service.findByNameLike("os");
        assertThat(actual, is(expected));
    }

}
