package com.itbclass4.linktracker.exceptions;

public class InvalidURLIdException extends Throwable{
    public InvalidURLIdException(){
        super("The URL ID provided is invalid.");
    }
}
