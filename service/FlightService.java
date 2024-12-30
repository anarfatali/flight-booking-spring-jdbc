package org.spring.springbootstarterjdbctemplate.service;

import org.spring.springbootstarterjdbctemplate.entities.FlightEntity;
import org.spring.springbootstarterjdbctemplate.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;


    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public int addFlights(FlightEntity flightEntity) {
        return flightRepository.save(flightEntity);
    }

    public FlightEntity getFlightById(int id) {
        return flightRepository.findById(id);
    }

    public List<FlightEntity> getAllFlights() {
        return flightRepository.findAll();
    }

    public int updateFlight(FlightEntity flightEntity) {
        return flightRepository.update(flightEntity);
    }

    public int deleteBooking(int id) {
        return flightRepository.delete(id);
    }

}
