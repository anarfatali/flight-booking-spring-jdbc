package org.spring.springbootstarterjdbctemplate.controller;

import org.spring.springbootstarterjdbctemplate.entities.BookingEntity;
import org.spring.springbootstarterjdbctemplate.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking/v1")
public class BookingController {

    private final BookingService bookingService;


    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/add")
    public String addBooking(@RequestBody BookingEntity bookingEntity) {
        bookingService.addBookings(bookingEntity);
        return "Booking added successfully!";
    }

    @GetMapping("/{id}")
    public BookingEntity getBookingById(@PathVariable int id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/list")
    public List<BookingEntity> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PutMapping("/{id}")
    public String updateBooking(@PathVariable int id, @RequestBody BookingEntity bookingEntity) {
        bookingEntity.setId(id);
        bookingService.updateBooking(bookingEntity);
        return "Booking updated successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable int id) {
        bookingService.deleteBooking(id);
        return "Booking deleted successfully!";
    }

}
