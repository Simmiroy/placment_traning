package day2;

public class Employee {
    int id;
    String name;
    double salary;
    Employee(int Eid,String Ename, double Esalary){
        id=Eid;
        name=Ename;
        salary=Esalary;
    }
    void display(){
        System.out.println(id + " "+ name + " " + salary);
    }
    public static void main(String args[]){
        Employee E2 = new Employee(74,"sham", 458888 );
        Employee E1 = new Employee(45 , "samira" ,450000);
        E1.display();
        E2.display();
    }
}
