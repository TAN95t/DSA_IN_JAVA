package OOPSNew;

public class Main {

    public static void main(String[] args){
        Bike b = new Splendor();
        b.run();


        Parent a = new subclass1();
        a.print();
        
        a = new subclass2();
        a.print();

        System.out.println(Helper.multiply(2, 9));
        System.out.println(Helper.multiply(2.1, 9.6));


        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());

        Shape s1 = new Circle("red", 2.2);
        System.out.println(s1.toString());
    }
}
