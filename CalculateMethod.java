class CalculateMethod {
    public static void addNumVoid(int num1, int num2) {
        int sum = num1 + num2;

        System.out.printf("The sum of %d and %d is %d", num1, num2, sum);
    }

    public static int addNumNonVoid(int num1, int num2) {
        int sum = num1 + num2;

        return sum;
    }
}