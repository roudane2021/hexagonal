package com.roudame.hexagonal.domain.product.exception;

public class DoesNotExistException extends Exception{

    public DoesNotExistException(final String message) {
            super(message);
        }

}
