package encapsulation;

class Student{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    
}
public class encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(12);
        st.setName("Rahul");
        System.out.println(st.getAge());
        System.out.println(st.getName());
    }
}
