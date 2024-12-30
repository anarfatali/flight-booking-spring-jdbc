package org.spring.springbootstarterjdbctemplate.service;

import org.spring.springbootstarterjdbctemplate.entities.BookingEntity;
import org.spring.springbootstarterjdbctemplate.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;


    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public int addBookings(BookingEntity bookingEntity) {
        return bookingRepository.save(bookingEntity);
    }

    public BookingEntity getBookingById(int id) {
        return bookingRepository.findById(id);
    }

    public List<BookingEntity> getAllBookings() {
        return bookingRepository.findAll();
    }

    public int updateBooking(BookingEntity bookingEntity) {
        return bookingRepository.update(bookingEntity);
    }

    public int deleteBooking(int id) {
        return bookingRepository.delete(id);
    }
}
