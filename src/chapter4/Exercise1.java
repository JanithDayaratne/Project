package chapter4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int rate =15;
        int maxhours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner input = new Scanner(System.in);
        double hours = input.nextDouble();

        while (hours > maxhours || hours < 1) {
            System.out.println("Invalis entry. Try again");
            hours = input.nextDouble();
        }
        input.close();
        double gross = hours * rate;
        System.out.println("Gross pay: $"+gross);
    }
}
