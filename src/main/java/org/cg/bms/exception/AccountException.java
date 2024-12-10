package org.cg.bms.exception;

public class AccountException extends Exception {
    public AccountException(String message) {
        super("Error: " + message);
    }
}
