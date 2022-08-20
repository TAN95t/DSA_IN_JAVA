package OOPS.Classes;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public int rollNo;


    public Student(String firstName, String lastName, int age, int rollNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rollNo = rollNo;
    }

    // copy constructor
    public Student(Student student1){
        this.firstName = student1.firstName;
        this.lastName = student1.lastName;
        this.age = student1.age;
        this.rollNo = student1.rollNo;
    }

    // polymorphism
    public  static void getInfo(int rollNo){
        System.out.println(rollNo);
    }

    public void getInfo(){
        System.out.println("Name: "+ firstName + " " + lastName + ", roll No: " + rollNo);
    }
}
