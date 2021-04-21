
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z=Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
        String point=(z<4)? "inside" : (z>4)? "outside of": (z==4) ? "on": " ";

        // Check whether the point is within the circle
       
        System.out.println("Point B with x and y coordinates is  " + point + "the circle line");
          
    
        }


    }