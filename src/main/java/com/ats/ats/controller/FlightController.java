package com.ats.ats.controller;

import com.ats.ats.model.Flights;
import com.ats.ats.model.Search;
import com.ats.ats.service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    FlightsService fs ;

    @PostMapping("/search")
    public List<Flights> getFlights(@RequestBody Search search){
        List<Flights> searchedFlight = new ArrayList<Flights>();
        searchedFlight = fs.getAvailableFlights(search);
        return searchedFlight;
    }
}
