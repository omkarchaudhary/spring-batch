package com.codehack.springbatch.repository;

import com.codehack.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRespository extends JpaRepository<Customer,Integer> {
}
