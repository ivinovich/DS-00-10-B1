package e1;

public class YearUtilities {
    public static boolean isLeap(int year){
        if (year % 4 == 0)
            if (year % 100 == 0)
                if(year % 400 == 0)
                    return true;
                else return false;
            else return false;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(YearUtilities.isLeap( 2000));
    }
}
