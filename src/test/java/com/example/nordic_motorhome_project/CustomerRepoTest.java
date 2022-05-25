package com.example.nordic_motorhome_project;

import com.example.nordic_motorhome_project.model.Customer;
import com.example.nordic_motorhome_project.repository.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class CustomerRepoTest {
    @Autowired private CustomerRepo repo;
    @Test
     public void testAddNew(){
         Customer customer = new Customer();
         customer.setFirstName("Louise");
         customer.setLastName("Mikkelsen");
         customer.setPhoneNumber(12345678);

         Customer savedCustomer=repo.save(customer);
         assertThat(savedCustomer).isNotNull();
         assertThat(savedCustomer.getId()).isGreaterThan(0);
     }
    @Test
    public void testListAll() {
        Iterable<Customer> customers = repo.findAll();
        assertThat(customers).hasSizeGreaterThan(0);
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    @Test
    public void testUpdate() {
        Integer customerId = 1;
        Optional<Customer> optionalCustomer = repo.findById(customerId);
        Customer customer = optionalCustomer.get();
        customer.setPhoneNumber(23456789);
        repo.save(customer);

        Customer updatedCustomer = repo.findById(customerId).get();
        assertThat(updatedCustomer.getPhoneNumber()).isEqualTo(23456789);
    }

    @Test
    public void testGet() {
        Integer customerId = 1;
        Optional<Customer> optionalCustomer = repo.findById(customerId);
        assertThat(optionalCustomer).isPresent();
        System.out.println(optionalCustomer.get());
    }

    @Test
    public void testDelete() {
        Integer customerId = 1;
        repo.deleteById(customerId);
        Optional<Customer> optionalCustomer = repo.findById(customerId);
        assertThat(optionalCustomer).isNotPresent();

    }

}
