package com.learning.assignments.JAVA.Ass7.inheritance;


public class Mouse extends Rodent {
    Mouse(){
        System.out.println("I am a Mouse");
    }
    @Override
    public void getFoodChoice( ) {
        this.favFood="chips";
    }

    @Override
    public void setLifeSpan( ) {
        this.years=6;
    }

    @Override
    public void getSafePlace( ) {
        this.home= "home";
        //home
    }
    public void AnimalType(){
        System.out.println("Mouse ia als a Mammal");

    }


}

