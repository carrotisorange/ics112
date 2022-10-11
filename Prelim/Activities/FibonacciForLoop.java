class FibonacciForLoop {
  public static void main(String[] args) {

    int maxNumber = 8, firstTerm = 0, secondTerm = 1;

    System.out.print("(Iterative) Fibonacci Series of "+ maxNumber+" numbers: ");
    for (int i = 1; i <= maxNumber; ++i) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}