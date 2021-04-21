public class Random {

    public static void main( String args[] ) {
        int min = 15;
        int max = 85;

        //Generates random numbers from the given range
        double random = Math.random()*(max-min+1)+min;
        System.out.println(random);
    }
}