package com.ReplaceErrorCodeWithException.after2;

public class InvalidCommandException extends Exception {
    public InvalidCommandException(String name){
        super(name);
    }
    public InvalidCommandException(){

    }
}
