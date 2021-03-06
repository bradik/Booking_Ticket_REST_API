package com.booking.train.ticket.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Brad on 16.09.2017.
 */

@Entity
@Table(name = "train")
public class Train extends AbstractNamedEntity {

    @NotBlank
    @Column(name = "train_number", nullable = false)
    private String trainNumber;

    public Train() {
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }


}
