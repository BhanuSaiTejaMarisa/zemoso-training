package com.learning.SolidDemo;

import com.learning.SolidDemo.TalonsInterface.SmallTalons;
import com.learning.SolidDemo.WingsInterface.SmallWings;

public class HummingBird extends FlyingBirds {

    HummingBird() {
        super(new SmallTalons(),new SmallWings());
    }

    public void hover() {
        fly();
        System.out.println("This Bird can hover");
    }

}
