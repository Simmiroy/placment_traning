package com.cs_is.oops.pillars.inheritance;

public interface Animal {
    /*Interface methods are completely abstract and cannot have body.
    They are implemented in the respective child classes
    Therefore , interface exhibit 100% abstraction.

     */
    void sound();
    void run();



}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Cats Meow.");
    }

    @Override
    public void run() {
        System.out.println("Cats runs fast.");
    }
}
class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("Dog Bark.");
    }

    @Override  //Annotation.
    public void run() {
        System.out.println("Dogs runs fast.");
    }
}
class Demo{
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat = new Cat();
        cat.run();
        cat.sound();
        dog.sound();
        dog.run();
    }
}
