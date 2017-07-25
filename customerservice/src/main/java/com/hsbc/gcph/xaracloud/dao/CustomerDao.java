package com.hsbc.gcph.xaracloud.dao;

import com.hsbc.gcph.xaracloud.common.model.Customer;

import java.util.List;

/**
 * Created by subhash on 23/7/17.
 */

public interface CustomerDao  {

    List<Customer> getAllCustomers();
    void addCustomer(final Customer customer);


}
