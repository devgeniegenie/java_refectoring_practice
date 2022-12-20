package com.ReplaceErrorCodeWithException.after1;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String name){
        super(name);
    }
    public InvalidCommandException(){

    }
}
