import java.util.Scanner;
public class DivideNum {
    public static void main(String[] args) {
       
        double dividend = acceptInput();
        double divisor = acceptInput();

        if( checkInput(divisor)){
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }
       
        System.out.printf("The quotient of %.1f and %.1f is %.1f", 
        dividend, 
        divisor, 
        performDivision(dividend, divisor));
    }

    public static double acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        double input  = scanner.nextDouble();

        return input;
    }

    public static boolean checkInput(double divisor)
    {
        boolean isValid = false;

        if (divisor == 0) {
           isValid = true;
        }else{
            isValid = false;
        }

        return isValid;
    }

    public static double performDivision(double dividend, double divisor)
    {
        double quotient = dividend / divisor;
        return quotient;
    }
}
