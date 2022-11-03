package OverloadingAndOverriding;
public class MethodOverloading {
    public static void main(String[] args) {
       int result =  addNum(1,1,1);

       System.out.printf("The result is %d", result);
    }

    public static int addNum(int num)
    {
        return num;
    }

    public static int addNum(int num1, int num2)
    {
        return num1 + num2;
    }

    public static int addNum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
