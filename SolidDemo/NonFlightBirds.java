package com.learning.SolidDemo;

import com.learning.SolidDemo.Exceptions.CantFlyException;
import com.learning.SolidDemo.TalonsInterface.Talons;
import com.learning.SolidDemo.WingsInterface.NoWings;

public class NonFlightBirds extends BuildBird {

    NonFlightBirds(Talons talons){
        super(talons,new NoWings());
        this.wingsToBodyRatio ="Small";
    }
    public void fly() throws CantFlyException {
        throw new CantFlyException();
    }


}
