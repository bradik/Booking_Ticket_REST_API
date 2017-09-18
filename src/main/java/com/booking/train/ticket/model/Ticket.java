package com.booking.train.ticket.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Brad on 16.09.2017.
 */

@Entity
@Table(name = "ticket")
public class Ticket extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROUTE_ID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Route route;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE")
    private TicketType type;

    @Column(name = "SET_NUMBER")
    private Integer setNumber;

    @Column(name = "PRICE")
    private Long price;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATE")
    private TicketState state;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public Integer getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(Integer setNumber) {
        this.setNumber = setNumber;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public TicketState getState() {
        return state;
    }

    public void setState(TicketState state) {
        this.state = state;
    }
}
