package com.ats.ats.service;

import com.ats.ats.dao.FlightsRepository;
import com.ats.ats.model.Flights;
import com.ats.ats.model.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightsService {

    @Autowired
    FlightsRepository fr;

    public List<Flights> getAvailableFlights(Search s) {
        List<Flights> fligths = new ArrayList<Flights>();
        fligths = fr.findBySourceAndDestination(s.getSource(), s.getDestination());
        System.out.println("Flights " + fligths);
        return fligths;
    }
}
