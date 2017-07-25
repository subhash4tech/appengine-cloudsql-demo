package com.hsbc.gcph.xaracloud.service.customer;

import com.hsbc.gcph.xaracloud.common.model.Customer;
import com.hsbc.gcph.xaracloud.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;

/**
 * Created by subhash on 22/7/17.
 */

@Entity
@RestController
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }


    @PutMapping("/customers/add")
    public void addCustomer(final Customer customer) {
        customerRepository.save((customer));
    }

}
