package collection.lambda;

import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort{
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(101,"Prity"));
        list.add(new Student(100,"Ajay"));
        list.add(new Student(106,"Riya"));
        for(Student s:list) {
            System.out.println( s.id+" ,"+s.name);
        }
        //Ascending order acc. to id's.
        Collections.sort(list,(s1,s2)->s1.id-s2.id);
        for(Student s:list) {
            System.out.println( s.id+" ,"+s.name);
        }
        //Descending order.
        Collections.sort(list,(s1,s2)->s2.id-s1.id);
        for(Student s:list) {
            System.out.println( s.id+" ,"+s.name);
        }
    }

}
