package com.learning.assignments.JAVA.ExceptionHandling;

class ServiceAlreadyDoneException extends Exception{
    ServiceAlreadyDoneException(String exception){
        super(exception);
    }
}
