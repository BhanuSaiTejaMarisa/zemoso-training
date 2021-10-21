package com.learning.assignments.JAVA.Ass7;

public class Food implements Favorites {
    @Override
    public void foodType() {
        System.out.println("Chinese food");
    }

    @Override
    public void eatWith() {
        System.out.println("fork");

    }

    @Override
    public void drinkType() {
        System.out.println("");

    }

    @Override
    public void drinkTime() {
        System.out.println("");

    }

    @Override
    public void appetizer() {
        System.out.println("");

    }

    @Override
    public void spicy() {
        System.out.println("");

    }

    @Override
    public Favorites order() {
        return null;
    }

    public void getMaggi(Maggi elem){
        System.out.println("Maggi obj "+elem);
    }
    public void getLassi(Lassi elem){
        System.out.println("Lassi obj "+elem);
    }
    public void getChilliPanneer(ChilliPanneer elem){
        System.out.println("Chilli Panneer obj: "+elem);
    }
    public void getFavorites(Favorites elem){
        System.out.println(elem.getClass().getSuperclass());
    }
    public static void main(String[] args) {
        Food myfood=new Food();
        myfood.getMaggi(myfood);
        myfood.getChilliPanneer(myfood);
        myfood.getLassi(myfood);
        myfood.getFavorites(myfood);
    }
}
interface  Maggi{
    public void foodType();
    public void eatWith();
}
interface Lassi{
    public void drinkType();
    public void drinkTime();
}
interface ChilliPanneer{
    public void appetizer();
    public void spicy();
}
interface Favorites extends Maggi, Lassi, ChilliPanneer{
    public Favorites order();
}
class HealthyFoods{
    HealthyFoods(int i){

    }
    HealthyFoods(int i, String j){

    }
    public void show(){
        System.out.println("Fruits are healthy");
    }
}