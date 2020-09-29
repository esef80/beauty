package com.esef.beauty.data;

import com.esef.beauty.data.dto.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
