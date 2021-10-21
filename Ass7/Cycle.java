package com.learning.assignments.JAVA.Ass7;



public class Cycle {

    String name;

    public void Balance(){
    System.out.println("this cycle needs to be balanced by the user");
    }

    public void method(){
        System.out.println("this is method of parent class");
    }

    public static void main(String[] args) {

        Cycle parentUnicycle= (Cycle)new Unicycle();
        Cycle parentBicycle=(Cycle)new Bicycle();
        Cycle parentTricycle=(Cycle)new Tricycle();

        parentUnicycle.Balance();//prints child Balance method because overridden in Unicycle
        parentBicycle.Balance();// prints child Balance method because overridden in Bicycle
        parentTricycle.Balance();//prints parent Balance method because it's not overridden in Tricycle

        //parentUnicycle.type  upcasting cannot use props from Child class only overridden methods can be used
        parentUnicycle.name="Unicycle of Parent Class";
        //parentUnicycle.Child cannot be accessed, it's not an overridden method


        System.out.println("");
        //Downcasting
        Unicycle childUnicycle=(Unicycle) parentUnicycle;
        Bicycle childBicycle=(Bicycle) parentBicycle;
        Tricycle childTricycle=(Tricycle) parentTricycle;

        childUnicycle.Balance();// child Balance method
        childBicycle.Balance();// child Balance method
        childTricycle.Balance();// Parent Balance method
        System.out.println(childUnicycle.name);// "Unicycle of Parent Class"
        childUnicycle.type="Unicycle type of Child Class";
        System.out.println(childUnicycle.type);
        childUnicycle.method();//parent class method
        childUnicycle.Child();// child class method

        System.out.println("");
        Unicycle myCycle=new Unicycle();
        myCycle.name="BTWIN";
        System.out.println(myCycle.name);
        myCycle.Balance();
        myCycle.method();
        myCycle.type="Gear type";
        System.out.println(myCycle.type);
        myCycle.Child();

        Tricycle auto=new Tricycle();
        

    }
}
class Unicycle extends Cycle{

    String type;
    public void Balance(){
        System.out.println(this.getClass().getSimpleName()+ " needs to be balanced by the user");
    }
    public void Child(){
        System.out.println("this is a method of child class");
    }
}
class Bicycle extends Cycle{

    String type;

    public void Balance(){
        System.out.println(this.getClass().getSimpleName()+ " needs to be balanced by the user");
    }
}
class Tricycle extends Cycle{
    String type;

    public void Child(){
        System.out.println("this is a method of child class");
    }
}
//        Cycle[] cycles=new Cycle[3];
//        cycles[0]=one;
//        cycles[1]=two;
//        cycles[2]= three;
//        Collections.addAll(cycles,one,two,three);
//        for(Cycle c:cycles){
//           c.Balance();
//        }
