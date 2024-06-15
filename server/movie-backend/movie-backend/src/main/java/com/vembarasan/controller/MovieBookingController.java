package com.vembarasan.controller;

import com.vembarasan.model.MovieBooking;
import com.vembarasan.service.MovieBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("http://localhost:5173")
@RestController
@RequestMapping("/api/booking")
public class MovieBookingController {


    @Autowired
    private MovieBookingService movieBookingService;

    @PostMapping("/bookTicket")
    public MovieBooking bookTicket(@RequestBody MovieBooking movieBooking){
        System.out.println(movieBooking);
        return  movieBookingService.saveBooking(movieBooking);
    }

    @GetMapping("/getAllBooking")
    public List<MovieBooking> getAllBookings(){
        return movieBookingService.getAllBookings();
    }

}










