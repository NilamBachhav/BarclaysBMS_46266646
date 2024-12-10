package org.cg.bms.dao;

import org.cg.bms.entity.Transaction;
import org.cg.bms.exception.TransactionException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.HashSet;

@Repository
public interface TransactionDAO extends CrudRepository<Transaction, Integer> {

}
