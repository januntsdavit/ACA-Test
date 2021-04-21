
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Prompt the user to enter a point coordinates
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z=Math.pow(Math.pow(x-3, 2) + Math.pow(y-5, 2), 0.5);

        switch ((z<4)? 0: ((z>4)? 1:  (z==4)? 2: 3)) {

        case 0:
        System.out.println("Point B with x and y coordinates is inside of the circle line");
        break;
        case 1:
        System.out.println("Point B with x and y coordinates is outside of the circle line");
        break;
        case 2:
        System.out.println("Point B with x and y coordinates is on the circle line");
        break;

        }

        }


    }