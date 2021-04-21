import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        switch ((0 <= num && num <= 45 ) ? 0 :
                (45 < num && num <= 90) ? 1 : 
                (90 < num && num <= 135 )? 2: 3) {

            case 0:
                System.out.println("number is in 0->45 range");
                break;
            case 1:
                System.out.println("number is in 45->90 range");
                break;
            case 2:
                System.out.println("number is in 90->135 range");
                break;
            case 3: System.out.println("number is in other range");
        }
    }


}
