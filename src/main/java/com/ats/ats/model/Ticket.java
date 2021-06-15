package com.ats.ats.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "customer")
public class Ticket extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ticketID;

    @Column(name = "flightname")
    private String flightname;

    @Column(name = "source")
    private String source;

    @Column(name = "destination")
    private String destination;


    @Column(name = "customerid")
    private Long customerid;

    @Column(name = "arrivaltime" )
    private Date arrivaltime;

    @Column(name = "departuretime")
    private Date departuretime;
}
