package org.cg.bms.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class TransactionDTO implements Serializable{
    private int transactionId;
    private String transactionType;
    private LocalDate transactionDate;
    private double transactionAmount;
    private AccountDTO account;

    // private String transactionStatus;
    //

    public TransactionDTO() {
        super();
    }

    public TransactionDTO(int transactionId, String transactionType, LocalDate transactionDate, double transactionAmount, AccountDTO account) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.account = account;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionType='" + transactionType + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                ", account=" + account +
                '}';
    }
}

