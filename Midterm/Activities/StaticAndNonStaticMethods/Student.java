package StaticAndNonStaticMethods;

public class Student {
        
    public int yearLevel;
    static int numberOfAbsences=0;
    static boolean isAbsent;

    static int counter;

    public static void checkAttendance(){
        isAbsent = true;
        System.out.println(isAbsent);
    }

    public int getYearLevel(){
        return yearLevel;
    }

    public static int incrementAbsent(){
        return numberOfAbsences++;
    }


}
