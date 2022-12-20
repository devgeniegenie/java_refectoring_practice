package com.ReplaceErrorCodeWithException.after3;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String name){
        super(name);
    }
    public InvalidCommandException(){

    }
}
