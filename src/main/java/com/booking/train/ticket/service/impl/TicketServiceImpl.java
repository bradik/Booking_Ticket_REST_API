package com.booking.train.ticket.service.impl;

import com.booking.train.ticket.model.Ticket;
import com.booking.train.ticket.repository.TicketRepository;
import com.booking.train.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Brad on 16.09.2017.
 */

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository dao;

    @Override
    public Ticket getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(Ticket ticket) {
        dao.save(ticket);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }
}
