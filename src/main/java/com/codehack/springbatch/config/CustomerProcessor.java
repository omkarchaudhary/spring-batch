package com.codehack.springbatch.config;

import com.codehack.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
        //write logic to
        //filter your data for processing
        return customer;
    }
}
