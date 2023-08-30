package inheretance;
class Human{
    int age;
    // private String name;

    Human(){
        System.out.println("in human constructor");
    }
    void sleep(){
        age = 18;
        System.out.println("Sleep is good for human");
        System.out.println(age);
        
    }
}
class Student extends Human
{
    // default constructor is being created behind the scene
    // public Student()
    // {
        //super() Since it is a default constructor in first line it will call the super method which will call the
        //  parents constructor of the same class (parent class).
    // }
    void disp()
    {
        System.out.println("Student age is "+age);
        // System.out.println("Student name is "+name); name is private can not be accessed 
        // directly private will make sute to preserve the property of encaptulation to get used in the class
    }   
}
public class inheritance {
    public static void main(String[] args) {        
        Student st = new Student();
        st.sleep();
  
    }

}
