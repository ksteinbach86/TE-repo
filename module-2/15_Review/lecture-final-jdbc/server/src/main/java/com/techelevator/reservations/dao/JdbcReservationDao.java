package com.techelevator.reservations.dao;

import com.techelevator.reservations.exception.HotelNotFoundException;
import com.techelevator.reservations.exception.ReservationNotFoundException;
import com.techelevator.reservations.model.Address;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcReservationDao implements ReservationDao {

    // Note to Ben's later self: implement the hotelDao here
    private JdbcTemplate jdbcTemplate;

    public JdbcReservationDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Reservation> findAll() {
        List<Reservation> myReservations = new ArrayList<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT id, hotel_id, full_name, checkin_date, checkout_date, guests FROM reservation;");
        while (results.next()) {
            myReservations.add(mapRowToReservation(results));
        }
        return myReservations;
    }

    @Override
    public List<Reservation> findByHotel(int hotelID) throws HotelNotFoundException {
        Hotel hotel = null;
        String sql = "SELECT id FROM hotel WHERE id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hotelID);
        if (!results.next()) {
            throw new HotelNotFoundException();
        }

        List<Reservation> myReservations = new ArrayList<>();
        results = jdbcTemplate.queryForRowSet("SELECT id, hotel_id, full_name, checkin_date, checkout_date, guests FROM reservation WHERE hotel_id = ?;", hotelID);
        while (results.next()) {
            myReservations.add(mapRowToReservation(results));
        }
        return myReservations;
    }

    @Override
    public Reservation get(int reservationID) throws ReservationNotFoundException {
        Reservation myReservation = null;
        String sql = "SELECT id, hotel_id, full_name, checkin_date, checkout_date, guests FROM reservation WHERE id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, reservationID);
        if (results.next()) {
            myReservation = mapRowToReservation(results);
        }
        else {
            throw new ReservationNotFoundException();
        }
        return myReservation;
    }

    @Override
    public Reservation create(Reservation reservation, int hotelID) throws HotelNotFoundException {
        Hotel hotel = null;
        String sql = "SELECT id FROM hotel WHERE id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, hotelID);
        if (!results.next()) {
            throw new HotelNotFoundException();
        }

        sql = "INSERT INTO reservation (hotel_id, full_name, checkin_date, checkout_date, guests) " +
                "VALUES (?, ?, ?, ?, ?) RETURNING id;";
        int id = jdbcTemplate.queryForObject(sql, Integer.class,
                reservation.getHotelID(), reservation.getFullName(), reservation.getCheckinDate(), reservation.getCheckoutDate(), reservation.getGuests());

       reservation.setId(id);
       return reservation;
    }

    /**
     * Update a reservation for a given hotel
     *
     * @param reservation
     * @param id
     * @throws ReservationNotFoundException
     */
    @Override
    public Reservation update(Reservation reservation, int id) throws ReservationNotFoundException{
        Reservation myReservation = null;
        return myReservation;
    }

    @Override
    public void delete(int id) throws ReservationNotFoundException{
    }

    private Reservation mapRowToReservation(SqlRowSet rowSet) {
        Reservation reservation = new Reservation();

        reservation.setId(rowSet.getInt("id"));
        reservation.setHotelID(rowSet.getInt("hotel_id"));
        reservation.setFullName(rowSet.getString("full_name"));
        reservation.setCheckinDate(rowSet.getString("checkin_date"));
        reservation.setCheckoutDate(rowSet.getString("checkout_date"));
        reservation.setGuests(rowSet.getInt("guests"));

//        private int id;
//        private int hotelID;
//        private String fullName;
//        private String checkinDate;
//        private String checkoutDate;
//        private int guests;



        return reservation;
    }


}
