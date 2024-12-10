package org.cg.bms.exception;

public class CustomerException extends Exception {
    public CustomerException(String message) {
        super("Error: " + message);
    }
}
