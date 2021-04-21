  import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    Switch ((0 <= input && input <= 45 ) ? 0 :
    (45 <= input && input <= 90) ? 1 : (90 <= input && input <= 135)? 2:" ") {
             case 0:
                System.out.println("Number is in...");
                break;
            case 1:
                System.out.println("I'm between 6 and 10 inclusive.");
                break;
            case 2:
                System.out.println("I'm not between one and five or 6 and 10 inclusive.");
                break;



    }

    



    }


}
