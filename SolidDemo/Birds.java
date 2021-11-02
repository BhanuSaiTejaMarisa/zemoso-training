package com.learning.SolidDemo;

import com.learning.SolidDemo.Exceptions.CantFlyException;
import com.learning.SolidDemo.TalonsInterface.Talons;
import com.learning.SolidDemo.WingsInterface.Wings;

public abstract class Birds extends CommonFeatures implements Talons, Wings {

     String name;
     final Talons talons;
     final Wings wings;

    Birds(Talons talons, Wings wings){
        this.talons = talons;
        this.wings=wings;
    }



    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void fly() throws CantFlyException;

    public void speed(Integer speed){
        System.out.println("This Bird can achieve a speed of "+speed);
    }

}
//migrate
//sing
//paradise-dance