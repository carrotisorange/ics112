public class FibonacciRecursion{ 
    public static void main(String args[]) {
        int n = 0;
        System.out.print("(Recursive) Fibonacci Series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + ", ");
        }
    }

    // compute the next term
	public static int fibonacciRecursion(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
}