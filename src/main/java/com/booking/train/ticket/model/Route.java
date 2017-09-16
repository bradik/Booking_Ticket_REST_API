package com.booking.train.ticket.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Brad on 16.09.2017.
 */
@Entity
@Table(name = "ROUTE")
public class Route extends AbstractBaseEntity {

    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @Column(name = "TRAIN_ID")
    private Train train;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @Column(name = "FROM_STATION_ID")
    private Station from;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @Column(name = "TO_STATION_ID")
    private Station to;

    @Column(name = "departure_Date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;

    @Column(name = "arrival_Date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalDate;

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getFrom() {
        return from;
    }

    public void setFrom(Station from) {
        this.from = from;
    }

    public Station getTo() {
        return to;
    }

    public void setTo(Station to) {
        this.to = to;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
