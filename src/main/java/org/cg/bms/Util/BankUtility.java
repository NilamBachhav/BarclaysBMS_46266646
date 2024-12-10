package org.cg.bms.Util;

import org.cg.bms.dto.AccountDTO;
import org.cg.bms.dto.CustomerDTO;
import org.cg.bms.dto.TransactionDTO;
import org.cg.bms.entity.Account;
import org.cg.bms.entity.Customer;
import org.cg.bms.entity.Transaction;
import org.cg.bms.exception.AccountException;

import java.util.Random;
import org.modelmapper.ModelMapper;

public class BankUtility {

    private static final Random random = new Random();
    private static ModelMapper modelMapper = new ModelMapper();

    public static long generateAccountNumber() throws AccountException {
        long accountNumber;
        do {
            // Generate a 12-digit number by ensuring it is between 100000000000L and 999999999999L
            accountNumber = 100000000000L + (long) (random.nextDouble() * 900000000000L);
        } while (isAccountNumberExists(accountNumber)); // Ensure uniqueness
        return accountNumber;
    }

    private static boolean isAccountNumberExists(long accountNumber) {
        return false;
    }

    public static int generateCustomerId() {
        int customerId;
        do {
            // Generate a 6-digit number by ensuring it is between 100000 and 999999
            customerId = 100000 + random.nextInt(900000);
        } while (isCustomerIdExists(customerId)); // Ensure uniqueness
        return customerId;
    }

    private static boolean isCustomerIdExists(int customerId) {
        return false;
    }

    public static Account convertAccountDtoToAccountEntity(AccountDTO accountdto) {
        return modelMapper.map(accountdto, Account.class);
    }

    public static Customer convertCustomerDtoToCustomerEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }

    public static Transaction convertTransactionDtoToTransactionEntity(TransactionDTO transactionDTO) {
        return modelMapper.map(transactionDTO, Transaction.class);
    }



}
