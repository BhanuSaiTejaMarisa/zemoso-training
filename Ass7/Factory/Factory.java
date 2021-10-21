package com.learning.assignments.JAVA.Ass7.Factory;

public class Factory {
    public Cycle createCycle(String elem){

        if (elem == null || elem.isEmpty())
            return null;

        if("Unicycle".equals(elem)){
            return new Unicycle();
        }
        else if("Bicycle".equals(elem)){
            return new Bicycle();
        }
        else if("Tricycle".equals(elem)){
            return new Tricycle();
        }

        return null;
    }

    public static void main(String[] args) {
        Factory own=new Factory();
        Cycle myCycle=own.createCycle("Tricycle");
        myCycle.wheels();
    }
}
