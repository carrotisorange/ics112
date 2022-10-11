import java.util.Scanner;

class ReverseString1 {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter integer:");
        int input = kbd.nextInt();

        String nstr = "";
        char ch;
        String stringInput = String.valueOf(input);

        System.out.println("Original word: " + stringInput);

        for (int i = 0; i < stringInput.length(); i++) {
            ch = stringInput.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }
}