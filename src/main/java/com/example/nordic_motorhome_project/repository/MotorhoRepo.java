package com.example.nordic_motorhome_project.repository;

import com.example.nordic_motorhome_project.model.Motorhome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorhoRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Motorhome> fetchAll() {
        String sql="SELECT motorho_id, motorho_name, size, availability " +
                "FROM nordic_motorhome_project.motorhomes";
        RowMapper<Motorhome> rowMapper = new BeanPropertyRowMapper<>(Motorhome.class);
        return jdbcTemplate.query(sql,rowMapper);
    }

       public Motorhome addMotorho(Motorhome motorho) {
           String sql ="INSERT INTO nordic_motorhome_project.motorhomes " +
                   "(motorho_name, brand_name, size, year, season_id, availability) values(?, ?, ?, ?, ?, ?)";
           jdbcTemplate.update(sql,motorho.getMotorho_name(), motorho.getBrand_name(), motorho.getSize(),
                   motorho.getYear(), motorho.getSeason_id(), motorho.getAvailability());
        return null;
    }
public Motorhome findMotorhoById(int id) {
    String sql ="SELECT motorho_id, motorho_name, brand_name, size, year, " +
            "s.season_id, s.price * 1.6 as price_peak, s.price * 1.3 as price_middle, s.price as price_low, availability " +
            "FROM nordic_motorhome_project.motorhomes m JOIN nordic_motorhome_project.season_prices s " +
            "ON m.season_id = s.season_id WHERE motorho_id =?";
    RowMapper<Motorhome> rowMapper = new BeanPropertyRowMapper<>(Motorhome.class);
        Motorhome motorho = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return motorho;
        }


public Boolean deleteMotorho (int id) {
        String sql="DELETE FROM nordic_motorhome_project.motorhomes WHERE motorho_id =?";
        return jdbcTemplate.update(sql, id)>0;
}

    public Motorhome updateMotorho(int id, Motorhome motorho) {
        String sql ="UPDATE nordic_motorhome_project.motorhomes SET motorho_name =?, " +
                "brand_name=?, size=?, year=?, season_id =?, availability=? WHERE motorho_id =?";
        jdbcTemplate.update(sql, motorho.getMotorho_name(),motorho.getBrand_name(), motorho.getSize(),
                motorho.getYear(),motorho.getSeason_id(),motorho.getAvailability(), motorho.getMotorho_id());
        return null;

}
}

