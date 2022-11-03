package OverloadingAndOverriding;
public class MethodInvocation {
    public static void main(String[] args) {
        double max = max(1,2);

        System.out.println(max);
    }   


    public static double max(double num1, int num2)
    {
        double max;

        if(num1 > num2)
        {
            max = num1;
        }else{
            max = num2;
        }

        return max;

    }

    public static double max(int num1, double num2)
    {
        double max;

        if(num1 > num2)
        {
            max = num1;
        }else{
            max = num2;
        }

        return max;
    }
}
