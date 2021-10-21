package com.learning.assignments.JAVA.Ass7.inheritance;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("I am a Hamster");
    }

    @Override
    public void getFoodChoice( ) {
        this.favFood="cucumber";
    }

    @Override
    public void setLifeSpan( ) {
        this.years=3;
    }

    @Override
    public void getSafePlace( ) {
        this.home="pocket";
    }
    public void AnimalType(){
        super.AnimalType();

    }

}
