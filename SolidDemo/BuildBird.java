package com.learning.SolidDemo;

import com.learning.SolidDemo.TalonsInterface.Talons;
import com.learning.SolidDemo.WingsInterface.Wings;

public abstract class BuildBird extends Birds{


    BuildBird(Talons talons, Wings wings) {
        super(talons, wings);
    }


    @Override
    public void useOfTalon() {
              this.talons.useOfTalon();
    }

    @Override
    public void useOfWings() {
        this.wings.useOfWings();
    }
}
