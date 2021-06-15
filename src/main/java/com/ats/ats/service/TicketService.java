package com.ats.ats.service;

import com.ats.ats.dao.TicketRepository;
import com.ats.ats.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    TicketRepository tr;
    public boolean createTicket(Ticket t) {
        try{
            tr.save(t);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
