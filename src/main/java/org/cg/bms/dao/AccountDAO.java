package org.cg.bms.dao;

import org.cg.bms.dto.AccountDTO;
import org.cg.bms.entity.Account;
import org.cg.bms.exception.AccountException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public interface AccountDAO extends CrudRepository<Account, Long> {

}
