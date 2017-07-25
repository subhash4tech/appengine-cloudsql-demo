package com.hsbc.gcph.xaracloud.service.customer;


import com.hsbc.gcph.xaracloud.common.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by subhash on 27/6/17.
 */

@RestController
public class CustomerInMemoryService {

    private static List<Customer> customers = new ArrayList<Customer>();

    static {
        Customer customer1 = new Customer(1, "Customer 1");
        Customer customer2 = new Customer(2, "Customer 2");
        Customer customer3 = new Customer(3, "Customer 3");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    @GetMapping("/customersIM")
    public static List<Customer> getCustomers() {
        return customers;
    }


    @GetMapping("/customersIM/get/{id}")
    public Customer getCustomerById(@PathVariable("id") final int id) {
        return id <= customers.size() && id >= 0 ?
                customers.get(id-1) :
                null;
    }
}
