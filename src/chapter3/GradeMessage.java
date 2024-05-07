package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
                case "B":
                    message = "Great job!";
                    break;
                    case "C":
                        message = "Good job!";
                        break;
                        case "D":
                            message = "You need to work a bit harder!";
                            break;
                            case "F":
                                message= "Uh no!";
                                break;
            default:
                message = "Something went wrong!";
                break;
        }
        System.out.println(message);
    }
}
