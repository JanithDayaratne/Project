package chapter5;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name + "!");
    }
}
