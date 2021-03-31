package com.itbclass4.linktracker.exceptions;

public class InvalidURLException extends Throwable {
    public InvalidURLException(){
        super("The url is incorrectly formatted");
    }
}
