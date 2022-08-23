package OOPSNew;

abstract class Shape {
    String color;

    abstract double area();
    public abstract String toString();

    public Shape(String color){
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // non-abstract method
    public String getColor(){
        return color;
    }


}

class Circle extends Shape{
    double radius;
    
    public Circle(String color, double radius) {
        super(color);
        //TODO Auto-generated constructor stub
        System.out.println("circle constructor called");
        this.radius = radius;
        
    }

    
    @Override
    double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "circle color is: " +  super.getColor()+ " and area is : "+ area();
    }

}
