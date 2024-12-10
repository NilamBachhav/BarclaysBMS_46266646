package org.cg.bms.dto;

import java.io.Serializable;

public class AccountDTO implements Serializable{
    private long accountId;
    private double balance;
    private String accountType;
    private CustomerDTO custDetails;


    public AccountDTO() {
        super();
    }
    public AccountDTO(long accountId, double balance, String accountType, CustomerDTO custDetails) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountType = accountType;
        this.custDetails = custDetails;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public CustomerDTO getCustDetails() {
        return custDetails;
    }

    public void setCustDetails(CustomerDTO custDetails) {
        this.custDetails = custDetails;
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
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", custDetails=" + custDetails +
                '}';
    }
}
