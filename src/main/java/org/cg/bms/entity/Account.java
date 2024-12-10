package org.cg.bms.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Comparator;

@Entity
@Table(name = "account")
public class Account implements Serializable{

    @Id
    private long accountId;
    private double balance;
    private String accountType;
    @OneToOne
    private Customer custDetails;

    public Account() {
        super();
    }
    public Account(long accountId, double balance, String accountType, Customer custDetails) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountType = accountType;
        this.custDetails = custDetails;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
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

    public Customer getCustDetails() {
        return custDetails;
    }

    public void setCustDetails(Customer custDetails) {
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
