package day2;

public class constructor {
    String name;
    int age;
    constructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name + " " + age);
    }
    public static void main(String[] args){
        constructor ob=new constructor("Anup",27);
        ob.display();
        ob.name="Anu";
        ob.age=18;
        System.out.println(ob.name +" " + ob.age);
    }
}
