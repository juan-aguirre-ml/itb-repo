package com.itbclass4.linktracker.exceptions;

public class LinkNotFoundException extends Throwable{
    public LinkNotFoundException(){
        super("The requested ID was not found.");
    }
}
