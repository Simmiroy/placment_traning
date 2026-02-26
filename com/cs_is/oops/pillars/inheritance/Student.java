package com.cs_is.oops.pillars.inheritance;

 interface Sports {
        void play();
    }
    class Person{
        String name;
        Person(String name){
            this.name=name;
        }
    }
    public class Student extends Person implements Sports{
        Student(String name){
            super(name);
        }

        @Override
        public void play() {
            System.out.println(name + " plays sports");
        }

        public static void main(String[] args) {
            Student s1=new Student("Simmi Roy");
            s1.play();
        }
    }


