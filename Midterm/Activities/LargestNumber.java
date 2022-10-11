import java.util.Scanner;
import java.lang.*;

class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num;
        double max;
        int count;

        System.out.println("Enter 10 numbers");
        num = scanner.nextDouble();
        max = num;

        for (int i = 1; i<10; i++) {
            num = scanner.nextDouble();
            max = larger(max, num);

        }

        System.out.println("The Largest number is " + max);
    }

    public static double larger(double max, double num)
    {
        

        if(x>=y){
            max=x;
        }else{
            max=y;
        }

        return max;
    }
}
