package OOPS.Classes;

public class Triangle extends Shape {
    String name;
    public Triangle(String name, int area, String color){
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public void getInfo(){
        System.out.println(name + " " + color + " " + area);
    }
}
