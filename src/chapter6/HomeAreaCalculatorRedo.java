package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area=calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: "+area);

        calculator.input.close();
    }

    private double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea()+rectangle2.calculateArea();

    }

    public Rectangle getRoom() {

        System.out.print("Enter the width of the room: ");
        double width = input.nextDouble();

        System.out.print("Enter the length of the room: ");
        double length = input.nextDouble();

        //Rectangle room =


        return new Rectangle(width, length);

    }
}
