public class PracticeWithNumbers {
    public static void main(String[] args) {
        // System.out.println(10/0); //returns ArithmeticException
        System.out.println(10/0.0); //returns Infinity
        System.out.println(10/30f); //returns .33333
        System.out.println(10/30); //returns 0
        System.out.println(40.0/4.0);

        double a = 4;
        System.out.println(a/2);
    }
    
}