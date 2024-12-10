package org.cg.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;
import java.util.Comparator;

@Entity
@Table (name = "customer")
public class Customer {

    @Id
    private int custId;
    private String firstName;
    private String lastName;
    private String userName;

    public Customer() {
        super();
    }
    public Customer(int custId, String firstName, String lastName, String userName) {
        this.custId = custId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return super.toString();
    }
}
