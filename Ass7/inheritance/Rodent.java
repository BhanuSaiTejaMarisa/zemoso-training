package com.learning.assignments.JAVA.Ass7.inheritance;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Rodent {
    protected String favFood;
    protected int years;
    protected String home;
    protected String country;
    Rodent(){
        System.out.println("This is a Rodent class ");

    }
    public abstract void getFoodChoice( );
    public abstract void setLifeSpan( );
    public abstract void getSafePlace( );
    public void showLifeSpan(){
        if(this.years==0){
            this.years=5;
        }
        System.out.println("Life span: "+this.years);
    }
    public void AnimalType(){
        System.out.println("All rodents are mammals");
    }
    public void showDetails(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("lifespan:"+this.years);
        System.out.println("favfood: "+this.favFood);
        System.out.println("home: "+this.home);

    }
    public static void main(String[] args) {
        ArrayList<Rodent> rodents=new ArrayList<Rodent>();
        Collections.addAll(rodents,new Gerbil(),new Mouse(),new Hamster());
        for(Rodent rodent:rodents){
            rodent.getFoodChoice();
            rodent.setLifeSpan();

            rodent.getSafePlace();
            rodent.showDetails();
            rodent.AnimalType();
        }
    }
}

