package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    // JPA framework will automatically will take care of method implemetation
    // findBy + fieldValue of Database
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
