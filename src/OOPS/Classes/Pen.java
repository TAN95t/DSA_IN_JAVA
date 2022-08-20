package OOPS.Classes;

public class Pen {
    public String name;
    public String color;
    public String type;

    public Pen(String name, String color, String type){
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void description(){
        System.out.println(name + " " + color + " " + type + "pen");
    }
}
