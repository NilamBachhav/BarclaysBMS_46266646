package org.cg.bms.service;

import org.cg.bms.dao.TransactionDAO;
import org.cg.bms.dto.TransactionDTO;
import org.cg.bms.exception.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;

@Service
public interface TransactionService {



    public HashSet<TransactionDTO> getTransactions() throws TransactionException;
    public TransactionDTO updateTransactionById(int transactionId, long accNo, TransactionDTO updatedDetails)throws TransactionException;
    public TransactionDTO createTransaction(TransactionDTO transaction) throws TransactionException;
    public HashSet<TransactionDTO> getTransactionsByAccountId(long accNo)throws TransactionException;
    public TransactionDTO getTransactionByTransactionId(int transactionId)throws TransactionException;
    public HashSet<TransactionDTO> getLastTenTransactions(long accNo)throws TransactionException;
    public HashSet<TransactionDTO> getTransactionByDate(LocalDate fromDate, LocalDate toDate)throws TransactionException;

}
