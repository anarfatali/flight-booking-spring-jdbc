package org.spring.springbootstarterjdbctemplate.repository;

import org.spring.springbootstarterjdbctemplate.entities.BookingEntity;
import org.spring.springbootstarterjdbctemplate.mapper.BookingRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //create
    public int save(BookingEntity bookingEntity) {
        String sql = "INSERT INTO bookingss (booker_name, booker_surname) VALUES (?, ?)";
        return jdbcTemplate.update(sql, bookingEntity.getBookerName(), bookingEntity.getBookerSurname());
    }

    // READ
    public BookingEntity findById(int id) {
        String sql = "SELECT * FROM bookingss WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BookingRowMapper());
    }

    public List<BookingEntity> findAll() {
        String sql = "SELECT * FROM bookingss";
        return jdbcTemplate.query(sql, new BookingRowMapper());
    }

    // UPDATE
    public int update(BookingEntity bookingEntity) {
        String sql = "UPDATE bookingss SET booker_name = ?, booker_surname = ? WHERE id = ?";
        return jdbcTemplate.update(sql, bookingEntity.getBookerName(), bookingEntity.getBookerSurname(), bookingEntity.getId());
    }


    // DELETE
    public int delete(int id) {
        String sql = "DELETE FROM bookingss WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }


}

