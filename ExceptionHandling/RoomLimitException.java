package com.learning.assignments.JAVA.ExceptionHandling;

class RoomLimitException extends Exception{
    RoomLimitException (String exception){
        super(exception);//,err
    }
}
