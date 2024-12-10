package org.cg.bms.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
    private int custId;
    private String firstName;
    private String lastName;
    private String userName;

    public CustomerDTO() {
        super();
    }
    public CustomerDTO(int custId, String firstName, String lastName, String userName) {
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
        return "Customer{" +
                "custId=" + custId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
