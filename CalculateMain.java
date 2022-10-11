public class CalculateMain {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        // call the non-returning value method
        CalculateMethod.addNumVoid(num1, num2);
        // call the returning value method
        int sum = CalculateMethod.addNumNonVoid(num1, num2);
        System.out.printf("The sum of %d and %d is %d \n", num1, num2, sum);
    }
}
