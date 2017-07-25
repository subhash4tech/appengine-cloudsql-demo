package com.hsbc.gcph.xaracloud.dao;

import com.hsbc.gcph.xaracloud.common.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by subhash on 23/7/17.
 */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
