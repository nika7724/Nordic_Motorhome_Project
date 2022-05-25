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
        /*String sql ="SELECT* FROM rentals";*/
        String sql = "SELECT rental_id, c.id, c.first_name, c.last_name, m.motorho_id, m.motorho_name, start_date, end_date, s.season_id, s.price, " +
                "l.location_id, l.location_name, datediff(end_date, start_date) * s.price AS total FROM rentals r JOIN customers c ON r.id = c.id JOIN motorhomes m ON r.motorho_id = m.motorho_id JOIN season_prices s " +
                "ON r.season_id = s.season_id JOIN locations l ON r.location_id = l.location_id";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    public Rental addRental(Rental rental) {
        String sql = "INSERT INTO rentals(id, motorho_id, start_date, end_date, season_id, location_id) values(?, ?, ?, ?,?,?)";
        jdbcTemplate.update(sql, rental.getId(), rental.getMotorho_id(), rental.getStart_date(), rental.getEnd_date(), rental.getSeason_id(),
                rental.getLocation_id());
        return null;
    }

    public Rental findRentalById(int id) {
        String sql = "SELECT rental_id, c.id, c.first_name, c.last_name, m.motorho_id, " +
                "m.motorho_name, start_date, end_date, s.season_id, s.price, l.location_id, " +
                "l.location_name, datediff(end_date, start_date) * s.price AS total " +
                "FROM rentals r JOIN customers c ON r.id = c.id " +
                "JOIN motorhomes m ON r.motorho_id = m.motorho_id " +
                "JOIN season_prices s ON r.season_id = s.season_id " +
                "JOIN locations l ON r.location_id = l.location_id WHERE rental_id =?";
        RowMapper<Rental> rowMapper = new BeanPropertyRowMapper<>(Rental.class);
        Rental rental = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return rental;
    }

    public Boolean deleteRental(int id) {
        String sql = "DELETE FROM rentals WHERE rental_id =?";
        return jdbcTemplate.update(sql, id) > 0;
    }

    public Rental updateRental(int id, Rental rental) {
        String sql = "UPDATE rentals SET motorho_id =?, " +
                "start_date=?, end_date=?, season_id=?, " +
                "location_id=? WHERE rental_id =?";
        jdbcTemplate.update(sql,rental.getMotorho_id(),
                rental.getStart_date(), rental.getEnd_date(),
                rental.getSeason_id(), rental.getLocation_id(), rental.getRental_id());
        return null;
    }



}





