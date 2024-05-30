public class Utils {

    public static double faction (double x){
        return (x - (int) x );
    }


    public static int sumLastNums(int x){
        return (x%10 + x/10 %10);
    }

    public static int charToNum(char x){
        return (int) x -'0';
    }
    public static boolean isPositive(int x) {
        boolean z = x>=0;
        return z;
    }
    public static boolean is2Digits(int x){
        boolean z = x >= 9 & x <= 99;
        return  z;
    }
    public static boolean isUpperCase(char x){
        return  (x >= 'A' & x <= 'Z');
    }
    public static boolean isInRange(int a, int b, int num) {
        return num >= a && num <= b || num <= a && num >= b;
    }
    public static boolean isDivisor (int a, int b){
        return (a % b==0 || b % a==0);
    }

    public static boolean isEqual (int a, int b, int c){
        return (a == b & b == c);
    }

    public static int lastNumSum(int a, int b){
        return (a % 10)+(b % 10);
    }

}
