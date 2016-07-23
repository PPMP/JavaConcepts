package com.company;

/**
 * Created by Patorn on 7/23/16.
 */
public class ElectricCar extends Car{
    String battery = "100V";
    String getFuel(){
        return this.battery;
    }

    void Hover(){
        System.out.println("fly");
    }
}
