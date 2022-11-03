package VoidAndNonVoidMethods;
public class CalculateMain {
    public static void main(String[] args) {

        int x=1;
        int y=1;

        // CalculateMethod.addNumVoid(x, y);

        int z = CalculateMethod.addNumNonVoid(x, y);

        System.out.println(z+1);



    }
}
