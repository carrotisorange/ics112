import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
   static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args) {
       char choice = showMessage();
       showSelection(choice);
   }

   public static void showSelection(char choice){

    switch(choice){ 
        case '1': 
        System.out.println("Enter five integers: ");
        int [] intArr = acceptArrayInt();
        sortArray(intArr);
        printArray(intArr);
        break;

        case '2':
        System.out.println("Enter five doubles: ");
        double[] doubleArr = acceptArrayDouble();
        sortArray(doubleArr);
        printArray(doubleArr);
        break;

        default:
        System.out.println("What do you mean?");
        char anotherChoice = scanner.next().charAt(0);
        showSelection(anotherChoice);
    }
   }

   public static void printArray(int[] arr){
    System.out.println("The sorted orders are: " + Arrays.toString(arr));
   }
   
   //METHOD OVERLOADING
   public static void printArray(double[] arr) {
       System.out.println("The sorted orders are: " + Arrays.toString(arr));
   }

   public static char showMessage(){
        System.out.println("Select your choice \n 1. Int \n 2. Double");
        char choice = scanner.next().charAt(0);
        return choice;
   }

   public static int[] acceptArrayInt(){
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static double[] acceptArrayDouble(){
        double[] arr = new double[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }

        return arr;
    }

   //sort array of int
   public static void sortArray(int[] arr){
    boolean isSorted;
    for (int i = 0; i < arr.length; i++) {
        isSorted = true;
        for (int j = 1; j < arr.length-i; j++) {
           if(arr[j] < arr[j-1]){
            swap(arr, j, j-1);
            isSorted = false;
           }
        }
        if (isSorted) {
            return;
        }
    }
   }
   
   //METHOD OVERLOADING
   public static void sortArray(double[] arr) {
       boolean isSorted;
       for (int i = 0; i < arr.length; i++) {
           isSorted = true;
           for (int j = 1; j < arr.length - i; j++) {
               if (arr[j] < arr[j - 1]) {
                   int temp = (int) arr[j-1];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   isSorted = false;
               }
           }
           if (isSorted) {
               return;
           }
       }
   }

   private static void swap(int[] arr, int currentIndex, int previousIndex){
     int temp = arr[currentIndex];
     arr[currentIndex] = arr[previousIndex];
     arr[previousIndex] = temp;
   }

}


