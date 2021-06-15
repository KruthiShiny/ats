package com.ats.ats.controller;

import com.ats.ats.model.Ticket;
import com.ats.ats.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    TicketService ts;

    @PostMapping("/create")
    public String createTicket(@RequestBody Ticket ticket){
        boolean res = ts.createTicket(ticket);
        if (res) {
            return "Created Ticker";
        } else{
            return "Unbale to Create Ticket ";
        }
    }
}
