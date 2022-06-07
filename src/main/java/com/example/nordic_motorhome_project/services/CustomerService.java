package com.example.nordic_motorhome_project.services;

import com.example.nordic_motorhome_project.repository.CustomerRepo;
import com.example.nordic_motorhome_project.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired private CustomerRepo repo;

    public List<Customer> listAll(){
        return (List<Customer>) repo.findAll();

    }

    public void save(Customer customer) {
        repo.save(customer);
    }
    public Customer get(Integer id) throws CustomerNotFoundException {
        Optional<Customer> result=repo.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        throw new CustomerNotFoundException("Could not find any customers with ID: " + id);
    }
    public void delete(Integer id) throws CustomerNotFoundException {
        Long count = repo.countById(id);
            if (count== null || count ==0) {
                throw new CustomerNotFoundException("Could not find any customers with the ID: " + id);
        }
        repo.deleteById(id);
    }
}
