package com.learning.assignments.JAVA.Ass7.inheritance;

public class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("I am a Gerbil");
    }
    @Override
    public void getFoodChoice( ) {
            this.favFood="ants";
    }

    @Override
    public void setLifeSpan( ) {
        this.years=7;
    }

    @Override
    public void getSafePlace( ) {
        this.home="desert";
    }

    public void AnimalType(){
        super.AnimalType();

    }

    public static void main(String[] args) {
//        A obj = new B();

    }
}

//class A
//{
//    public A() {
//        System.out.println("A");
//    }
//
//    public void methodOne() { System.out.print("A"); }
//}
//
//class B extends A
//{
//    public B() { System.out.print("*"); }
//
//    public void methodOne() { System.out.print("B"); }
//}
