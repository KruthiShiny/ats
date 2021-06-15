package com.ats.ats.dao;

import com.ats.ats.model.Flights;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlightsRepository extends CrudRepository<Flights, Long> {

    @Query("SELECT f FROM flights f where f.source=:source and f.destination=:destination")
    List<Flights> findBySourceAndDestination(@Param("source") String source, @Param("destination") String destination);
}
