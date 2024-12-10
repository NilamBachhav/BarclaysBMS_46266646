package org.cg.bms.service;

import org.cg.bms.dao.CustomerDAO;
import org.cg.bms.dto.CustomerDTO;
import org.cg.bms.exception.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public interface CustomerService {

    public CustomerDTO deleteCustomerById(int custId) throws CustomerException;
    public HashSet<CustomerDTO> getAllCustomers() throws CustomerException;
    public CustomerDTO getCustomerById(int custId) throws CustomerException;
    public CustomerDTO addCustomer(CustomerDTO customer) throws CustomerException;
    public CustomerDTO updateCustomer(CustomerDTO updatedCustDetails) throws CustomerException;
    public boolean validateName(String name)throws CustomerException;
    public boolean validateUsername(String userName)throws CustomerException;

}
