package com.learning.SolidDemo;

public class CommonFeatures {

    String wingsToBodyRatio;
    String metabolism;
    String bloodType;
    boolean feathers;
    boolean beaks;

    CommonFeatures(){
        this.metabolism="High rate";
        this.bloodType="Warm blooded";
        this.feathers=true;
        this.beaks=true;
    }

    public  void layEggs(){
        System.out.println("This Bird lays eggs");
    }

}
