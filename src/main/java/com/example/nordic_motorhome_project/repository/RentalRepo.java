package com.example.nordic_motorhome_project.repository;

        import com.example.nordic_motorhome_project.model.Rental;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.jdbc.core.BeanPropertyRowMapper;
        import org.springframework.jdbc.core.JdbcTemplate;
        import org.springframework.jdbc.core.RowMapper;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public class RentalRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Rental> fetchAll() {
        String sql ="SELECT* FROM rentals";
        /*String sql = "VALUE= SELECT rental_id motorho_name price location_name
        FROM rentals JOIN motorhomes ON rentals.motorho_id = motorhomes.motorho_id JOIN season_prices
        ON rentals.price_id = season_prices.price_id JOIN locations
        ON rental.location_id = locations.location_id";*/
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        return jdbcTemplate.query(sql, rowMapper);
    }
}


    /*package com.example.nordic_motorhome_project.repository;


import com.example.nordic_motorhome_project.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface RentalRepo extends JpaRepository<Rental, Integer> {

        @Query(value = "SELECT rentals.rental_id, motorhomes.motorho_name, season_prices.price, locations.location_name " +
                "FROM rentals JOIN motorhomes ON rentals.motorho_id = motorhomes.motorho_id JOIN season_prices ON rentals.price_id = season_prices.price_id JOIN locations ON rental.location_id = locations.location_id")
        public List<Rental>getAllRental();
    }*/