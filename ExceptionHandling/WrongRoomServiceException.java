package com.learning.assignments.JAVA.ExceptionHandling;

class WrongRoomServiceException extends Exception{
    WrongRoomServiceException(String exception){
        super(exception);
    }
}
