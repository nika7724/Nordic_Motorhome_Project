package com.example.nordic_motorhome_project.repository;
import com.example.nordic_motorhome_project.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
    Long countById(Integer id);
}
