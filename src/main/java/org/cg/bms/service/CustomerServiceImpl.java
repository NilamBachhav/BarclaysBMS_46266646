package org.cg.bms.service;

import org.cg.bms.dao.CustomerDAO;
import org.cg.bms.dto.CustomerDTO;
import org.cg.bms.exception.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDAO customer;

    @Override
    public CustomerDTO deleteCustomerById(int custId) throws CustomerException {
        return null;
    }

    @Override
    public HashSet<CustomerDTO> getAllCustomers() throws CustomerException {
        return null;
    }

    @Override
    public CustomerDTO getCustomerById(int custId) throws CustomerException {
        return null;
    }

    @Override
    public CustomerDTO addCustomer(CustomerDTO customer) throws CustomerException {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO updatedCustDetails) throws CustomerException {
        return null;
    }

    @Override
    public boolean validateName(String name) throws CustomerException {
        return false;
    }

    @Override
    public boolean validateUsername(String userName) throws CustomerException {
        return false;
    }
}
