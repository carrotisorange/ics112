
import java.lang.*;
import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("enter an integer: ");

        int integer = kbd.nextInt();
        
  
        System.out.print("The reverse of the entered integer is ");
        int digit = 0;
        int remainder = 0;
      
        do {
            remainder = integer % 10;
            System.out.println(remainder);
            integer = integer / 10;

        }while (remainder > 0);
    }
}
