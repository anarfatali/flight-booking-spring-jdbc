package org.spring.springbootstarterjdbctemplate.mapper;

import org.spring.springbootstarterjdbctemplate.entities.FlightEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightRowMapper implements RowMapper<FlightEntity> {

    @Override
    public FlightEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        FlightEntity flightEntity = new FlightEntity();
        flightEntity.setFlightId(rs.getLong("flight_id"));
        flightEntity.setDestination(rs.getString("destination"));
        flightEntity.setFromm(rs.getString("fromm"));
        return flightEntity;
    }

}
