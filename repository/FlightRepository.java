package org.spring.springbootstarterjdbctemplate.repository;

import org.spring.springbootstarterjdbctemplate.entities.FlightEntity;
import org.spring.springbootstarterjdbctemplate.mapper.FlightRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightRepository {

    private final JdbcTemplate jdbcTemplate;

    public FlightRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //create
    public int save(FlightEntity flightEntity) {
        String sql = "INSERT INTO flights (destination, fromm) VALUES (?, ?)";
        return jdbcTemplate.update(sql, flightEntity.getDestination(), flightEntity.getFromm());
    }

    // READ
    public FlightEntity findById(int id) {
        String sql = "SELECT * FROM flights WHERE flight_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new FlightRowMapper());
    }

    public List<FlightEntity> findAll() {
        String sql = "SELECT * FROM flights";
        return jdbcTemplate.query(sql, new FlightRowMapper());
    }

    // UPDATE
    public int update(FlightEntity flightEntity) {
        String sql = "UPDATE flights SET destination = ?, fromm = ? WHERE flight_id = ?";
        return jdbcTemplate.update(sql, flightEntity.getDestination(), flightEntity.getFromm(), flightEntity.getFlightId());
    }


    // DELETE
    public int delete(int id) {
        String sql = "DELETE FROM flights WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
