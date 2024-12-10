package org.cg.bms.service;

import org.cg.bms.dao.AccountDAO;
import org.cg.bms.dto.AccountDTO;
import org.cg.bms.exception.AccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountDAO accountDAO;

    @Override
    public AccountDTO deleteAccount(long accNo) throws AccountException {
        return null;
    }

    @Override
    public HashSet<AccountDTO> getAllAccounts() throws AccountException {
        return null;
    }

    @Override
    public AccountDTO createAccount(AccountDTO account) throws AccountException {
        return null;
    }

    @Override
    public AccountDTO updateAccount(AccountDTO updatedAccount) throws AccountException {
        return null;
    }

    @Override
    public AccountDTO getAccountById(long accNo) throws AccountException {
        return null;
    }

    @Override
    public AccountDTO deposit(long accNo, double depositAmount) throws AccountException {
        return null;
    }

    @Override
    public AccountDTO withDraw(long accNo, double withdrawAmount) throws AccountException {
        return null;
    }

    @Override
    public AccountDTO transfer(long sourceAccNo, long destinationAccNo, double transferAmount) throws AccountException {
        return null;
    }

    @Override
    public boolean validateAccountNumber(long accNo) throws AccountException {
        return false;
    }

    @Override
    public boolean validateAmount(double amount) throws AccountException {
        return false;
    }
}