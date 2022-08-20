package OOPS;

// import Bank.Account;
import OOPS.Classes.Pen;
import OOPS.Classes.Student;
import OOPS.Classes.Triangle;

public class oops {
    

    public static void main(String[] args){
        Pen pen1 = new Pen("Domes", "blue", "gel");
        pen1.description();


        Student student1 = new Student("Tanay", "Maheshwari", 22, 199302133);
        student1.getInfo();


        Student student2 = new Student(student1);
        student2.getInfo();
        Student.getInfo(student2.rollNo);

        Triangle t1 = new Triangle("triangle",30, "red");
        t1.getInfo();



    }
}
