package day3;

public class Student {
    private String name;
    private int age;
    Student(String n , int a){
        name = n;
        age= a;
    }
    public String getname(){
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Student ob = new Student("Anu", 15);
        System.out.println(ob.getname());
        ob.setName("Aman");
        System.out.println(ob.getname());
    }
}
