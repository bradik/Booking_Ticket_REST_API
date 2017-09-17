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
    @ManyToOne(fetch = FetchType.EAGER, optional=true)
    private Train train;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional=true)
    @JoinColumn(name="FROM_STATION_ID")
    private Station fromStation;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional=true)
    @JoinColumn(name="TO_STATION_ID")
    private Station toStation;

    @Column(name = "departure_Date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date departureDate;

    @Column(name = "arrival_Date")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalDate;

    public Route() {
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getFromStation() {
        return fromStation;
    }

    public void setFromStation(Station fromStation) {
        this.fromStation = fromStation;
    }

    public Station getToStation() {
        return toStation;
    }

    public void setToStation(Station toStation) {
        this.toStation = toStation;
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
