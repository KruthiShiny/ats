package com.ats.ats.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@Table(name = "flights")
@EqualsAndHashCode(callSuper = true)
public class Flights extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flightid;

    @Column(name = "flightname")
    private String flightname;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;

    @Column(name = "availableseats")
    private int availableseats;

    @Column(name = "price")
    private int price;

}
