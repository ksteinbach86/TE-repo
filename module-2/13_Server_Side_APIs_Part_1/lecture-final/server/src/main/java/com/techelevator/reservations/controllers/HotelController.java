package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required=false) String state) {
        if (state == null || state.length() == 0) {
            return hotelDao.list();
        }

        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> hotels = hotelDao.list();

        for (Hotel hotel : hotels) {
            if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                filteredHotels.add(hotel);
            }
        }

        return filteredHotels;
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    /**
     * Return All Reservations
     *
     * @return a list of all reservations in the system
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> findAll(@RequestParam(required=false) String state) {
        if (state == null || state.length() == 0) {
            return reservationDao.findAll();
        }

        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> hotels = hotelDao.list();

        for (Hotel hotel : hotels) {
            if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                filteredHotels.add(hotel);
            }
        }

        List<Reservation> filteredReservations = new ArrayList<>();
        List<Reservation> reservations = reservationDao.findAll();

        for (Reservation reservation : reservations) {
            Hotel hotel = hotelDao.get(reservation.getHotelID());
            if (hotel != null && filteredHotels.contains(hotel)) {
                            filteredReservations.add(reservation);
            }
        }

        return filteredReservations;

    }

    /**
     * Return reservations by id
     *
     * @return a reservation by id
     */
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
        return reservationDao.get(id);
    }

    /**
     * Return All Reservations at a single Hotel
     *
     * @return a list of all reservations at a hotel by id
     */
    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> findByHotel(@PathVariable int id) {
        return reservationDao.findByHotel(id);
    }

    /**
     * Create a reservation at a given hotel
     *
     * @param reservation
     * @return newly created reservation
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationDao.create(reservation, reservation.getHotelID());
    }

}
