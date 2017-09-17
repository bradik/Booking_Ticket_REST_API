package com.booking.train.ticket.repository;

import com.booking.train.ticket.model.Route;
import com.booking.train.ticket.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Brad on 16.09.2017.
 */

@Transactional(readOnly = true)
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    Ticket getById(Integer id);

    @Transactional
    @Override
    Ticket save(Ticket ticket);

    @Transactional
    @Override
    void delete(Integer id);

}
