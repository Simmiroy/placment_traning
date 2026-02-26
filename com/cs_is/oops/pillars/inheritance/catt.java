package com.cs_is.oops.pillars.inheritance;

interface catt {
    default void sound1(){
        System.out.println("Cat makes sound");
    }
}
interface Dog1{
    default void sound1(){
        System.out.println("woooh");
    }
}
class Cog implements catt,Dog1{
    @Override
    public void sound1(){
        Dog1.super.sound1();
        }


}
class Demo1 {
    public static void main(String[] args) {
        Cog d = new Cog();
        d.sound1();

    }
}
