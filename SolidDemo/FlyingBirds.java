package com.learning.SolidDemo;

import com.learning.SolidDemo.TalonsInterface.Talons;
import com.learning.SolidDemo.WingsInterface.Wings;

public class FlyingBirds extends BuildBird {

    FlyingBirds(Talons talons, Wings wings){
        super(talons,wings);
        this.wingsToBodyRatio ="High";
    }

   public void fly() {
        System.out.println("Can fly!!");
   }




}
