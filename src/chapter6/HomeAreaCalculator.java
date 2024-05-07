package chapter6;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //RECTANGLE 1
        //Create instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        //RECTANGLE 2
        Rectangle room2 = new Rectangle(30,75);
        //room2.setWidth(25);
        //room2.setLength(50);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);


    }
}
