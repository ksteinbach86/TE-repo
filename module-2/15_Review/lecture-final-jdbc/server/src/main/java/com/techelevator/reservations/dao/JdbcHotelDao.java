package com.techelevator.reservations.dao;

import com.techelevator.reservations.model.Address;
import com.techelevator.reservations.model.Hotel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcHotelDao implements HotelDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcHotelDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Hotel> list() {
        List<Hotel> hotels = new ArrayList<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT id, name, address, address2, city, state, zip, stars, rooms_available, cost_per_night FROM hotel;");
        while (results.next()) {
            hotels.add(mapRowToHotel(results));
        }
        return hotels;
    }

    @Override
    public Hotel create(Hotel hotel) {
        Hotel returnedhotel = null;
        String sql = "INSERT INTO hotel (name, address, address2, city, state, zip, stars, rooms_available, cost_per_night) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING id;";
        Address address = hotel.getAddress();
        int id = jdbcTemplate.queryForObject(sql, Integer.class,
                hotel.getName(), address.getAddress(), address.getAddress2(), address.getCity(), address.getState(), address.getZip(),
                hotel.getStars(), hotel.getRoomsAvailable(), hotel.getCostPerNight());

        returnedhotel = get(id);
        return returnedhotel;
    }

    @Override
    public Hotel get(int id) {
        Hotel hotel = null;
        String sql = "SELECT id, name, address, address2, city, state, zip, stars, rooms_available, cost_per_night FROM hotel WHERE id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            hotel = mapRowToHotel(results);
        }
        return hotel;
    }

    private Hotel mapRowToHotel(SqlRowSet rowSet) {
        Hotel hotel = new Hotel();
        hotel.setId(rowSet.getInt("id"));
        hotel.setName(rowSet.getString("name"));

        Address address = new Address();
        address.setAddress(rowSet.getString("address"));
        address.setAddress2(rowSet.getString("address2"));
        address.setCity(rowSet.getString("city"));
        address.setState(rowSet.getString("state"));
        address.setZip(rowSet.getString("zip"));
        hotel.setAddress(address);

        hotel.setStars(rowSet.getInt("stars"));
        hotel.setRoomsAvailable(rowSet.getInt("rooms_available"));
        hotel.setCostPerNight(rowSet.getDouble("cost_per_night"));

        return hotel;

    }


}
