package com.cs_is.oops.pillars.Association;
//Composition
class Engine{
    void start(){
        System.out.println("Engine start ");
    }
}

public class Car {
    private Engine engine;
    Car() {
        engine  = new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        Car c1=new Car();
        c1.drive();
    }
}
