package com.learning.SolidDemo;

import com.learning.SolidDemo.Exceptions.CantFlyException;
import com.learning.SolidDemo.TalonsInterface.Talons;
import com.learning.SolidDemo.WingsInterface.Wings;

public class CustomBirdBuild extends BuildBird{

    private FlyingBirds fb;
    private NonFlightBirds nb;
    CustomBirdBuild(Talons talons, Wings wings){
        super(talons,wings);
        String className=wings.getClass().getSimpleName();
        if(className.equals("LargeWings")||className.equals("SmallWings")){
            this.fb=new FlyingBirds(talons, wings);
        }
        else{
            this.nb=new NonFlightBirds(talons);
        }
    }

    @Override
    public void fly() throws CantFlyException {
        if(this.fb!=null){
            this.fb.fly();
        }
        else{
            this.nb.fly();
        }
    }

}
