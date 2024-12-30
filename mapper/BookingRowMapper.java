package org.spring.springbootstarterjdbctemplate.mapper;

import org.spring.springbootstarterjdbctemplate.entities.BookingEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingRowMapper implements RowMapper<BookingEntity> {

    @Override
    public BookingEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setId(rs.getInt("id"));
        bookingEntity.setBookerName(rs.getString("name"));
        bookingEntity.setBookerSurname(rs.getString("surname"));
        return bookingEntity;
    }
}
