package OOPSNew;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decrement){
        speed -= decrement;

    }

    public void speedUp(int increment){
        speed -= increment;
    }

    public String toString(){
        return ("No of gares are:" + gear + "speed of bike is: "+ speed);
    }
}


class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight){
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override public String toString(){
        return (super.toString() + "seatHeight is: "+ seatHeight);
    }
}
