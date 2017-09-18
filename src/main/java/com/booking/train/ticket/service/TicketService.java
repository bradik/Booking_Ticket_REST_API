package com.booking.train.ticket.service;

import com.booking.train.ticket.model.Ticket;

/**
 * Created by Brad on 16.09.2017.
 */
public interface TicketService {

    Ticket getById(Integer id);
    void save(Ticket ticket);
    void delete(Integer id);

}
