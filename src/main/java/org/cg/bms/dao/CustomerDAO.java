package org.cg.bms.dao;

import org.cg.bms.entity.Customer;
import org.cg.bms.exception.CustomerException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
