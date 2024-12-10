package org.cg.bms.exception;

public class TransactionException extends Exception {
    public TransactionException(String message) {
        super("Error: " + message);
    }
}
