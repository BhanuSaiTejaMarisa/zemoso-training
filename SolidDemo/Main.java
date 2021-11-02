package com.learning.SolidDemo;

import com.learning.SolidDemo.Exceptions.CantFlyException;
import com.learning.SolidDemo.TalonsInterface.LargeTalons;
import com.learning.SolidDemo.TalonsInterface.SmallTalons;
import com.learning.SolidDemo.WingsInterface.NoWings;
import com.learning.SolidDemo.WingsInterface.SmallWings;

public class Main {


    public void testOCP(){
        HummingBird hb=new HummingBird();
        hb.setName("Lego humming bird");
        hb.fly();
        hb.hover();
    }

    public void testLSP(){// extension of OCP
        FlyingBirds bebo=new HummingBird();
        bebo.setName("Bebo parent humming bird");
        bebo.fly();
        bebo.useOfTalon();
        bebo.useOfWings();
        //bebo.hover();
    }



    public void testDI() throws CantFlyException {


       try{
           CustomBirdBuild popo=new CustomBirdBuild(new LargeTalons(), new SmallWings());
           popo.layEggs();
           popo.useOfTalon();
           popo.fly();

           System.out.println("\n");

           CustomBirdBuild logo=new CustomBirdBuild(new SmallTalons(), new NoWings());
           logo.useOfTalon();
           logo.fly();
       }
       catch (Exception e){
           System.out.println(e);
        }

    }

    public static void main(String[] args) {

        try {

            Main test=new Main();

            //1.
            //Birds class and Common features

            //2. Humming Birds - hover method
//            test.testOCP();

            //3. Humming bird
//            test.testLSP();

            //4. talons,wings


            //5. Custom Bird
            test.testDI();







//            Birds myBird = new NonFlightBirds(new LargeTalons());
//            myBird.fly();

            //write these methods
            //CallSingleRespons
            //CallOpenCLosedP
            //callForLiskov
            //callInterfaeSeggregation
            //CallDependencyInv
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
