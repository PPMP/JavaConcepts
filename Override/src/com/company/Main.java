package com.company;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("My car has fuel type: " + myCar.getFuel());

        ElectricCar myElectric = new ElectricCar();
        System.out.println("myElectric has fuel type: " + myElectric.getFuel());
        myElectric.Hover();

        Car yourCar = new ElectricCar();
        System.out.println("Your car has fuel type: " + yourCar.getFuel());
        System.out.println("Your car has " + yourCar.numberOfWheels() + " wheels.");
        //yourCar.hover(); Trying to access something that's not in the parent class (not legal)
        /** In compile time, the check is made on the reference type. However, in the runtime, JVM figures out
        the object type and would run the method that belongs to that particular object. **/
    }
}
