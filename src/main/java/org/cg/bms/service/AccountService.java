package org.cg.bms.service;

import org.cg.bms.dto.AccountDTO;
import org.cg.bms.exception.AccountException;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public interface AccountService {

    public AccountDTO deleteAccount(long accNo) throws AccountException;
    public HashSet<AccountDTO> getAllAccounts()throws AccountException;
    public AccountDTO createAccount(AccountDTO account) throws AccountException;
    public AccountDTO updateAccount(AccountDTO updatedAccount) throws AccountException;
    public AccountDTO getAccountById(long accNo) throws AccountException;
    public AccountDTO deposit(long accNo, double depositAmount) throws AccountException;
    public AccountDTO withDraw(long accNo, double withdrawAmount) throws AccountException;
    public AccountDTO transfer(long sourceAccNo, long destinationAccNo, double transferAmount) throws AccountException;
    public boolean validateAccountNumber(long accNo)throws AccountException;
    public boolean validateAmount(double amount)throws AccountException;

}
