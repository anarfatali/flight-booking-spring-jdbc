package org.spring.springbootstarterjdbctemplate.controller;

import org.spring.springbootstarterjdbctemplate.entities.FlightEntity;
import org.spring.springbootstarterjdbctemplate.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flight/v2")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping("/add")
    public String addFlight(@RequestBody FlightEntity flightEntity) {
        flightService.addFlights(flightEntity);
        return "Flight added successfully!";
    }

    @GetMapping("/{id}")
    public FlightEntity getFlightById(@PathVariable int id) {
        return flightService.getFlightById(id);
    }

    @GetMapping("/list")
    public List<FlightEntity> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PutMapping("/{id}")
    public String updateFlight(@PathVariable Long id, @RequestBody FlightEntity flightEntity) {
        flightEntity.setFlightId(id);
        flightService.updateFlight(flightEntity);
        return "Booking updated successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable int id) {
        flightService.deleteBooking(id);
        return "Flight deleted successfully!";
    }

}