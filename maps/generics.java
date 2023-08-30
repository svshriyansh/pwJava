package maps;

import java.util.*;


class Employee
{

    private String name;
    private int empId;

    Employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }
    
}

class Student
{
    private String name;
    private int stdId;

    Student(String name, int stdId){
        this.name = name;
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public int getStdId() {
        return stdId;
    }

    
}

public class generics {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 112);
        Student s2 = new Student("Rohit", 113);

        Employee e = new Employee("Rohini", 389);

        //Generics provide typesafety and prevent exception at runtime
        ArrayList<Student> arSt = new ArrayList<Student>();

        arSt.add(s1);
        arSt.add(s2);
        // cannot add employee object
        //arSt.add(e);

        System.out.println(arSt);
    }
    
}
