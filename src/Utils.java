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

    public static int safeDiv(int x, int y) {
        return x != 0 && y != 0 ? x / y : 0;
    }

    public static int abs(int x) {
        return x >= 0 ? x : -x;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static String makeDecision(int x, int y) {
        if (x == y) {
            return "" + x + "=" + y;
        } else {
            return x > y ? "" + x + ">" + y : "" + x + "<" + y;
        }
    }

    public static int max3(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else {
            return x < y && y > z ? y : z;
        }
    }

    public static boolean sum3(int x, int y, int z) {
        return x + y == z || x == y + z || z + x == y;
    }

    public static int sum2(int x, int y) {
        return x + y > 10 & x + y < 20 ? 20 : x + y;
    }

    public static boolean is35(int x) {
        if (0 == x % 3 & 0 == x % 5) {
            return false;
        } else {
            return 0 == x % 3 || 0 == x % 5;
        }
    }

    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || 6 == x - y || y - x == 6 || 6 == x + y;
    }

    public static String age(int x) {
        if (x % 10 == 1 & x != 11) {
            return "" + x + " год";
        } else {
            return 2 == x % 10 || 3 == x % 10 || 4 == x % 10 && 12 != x && 13 != x && 14 != x ? "" + x + " года" : "" + x + " лет";
        }
    }

    public static String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "Ошибка!";
        }
    }

    public static void printDays(String x) {
        switch (x) {
            case "Понедельник":
                System.out.println("Понедельник");
            case "Вторник":
                System.out.println("Вторник");
            case "Среда":
                System.out.println("Среда");
            case "Четверг":
                System.out.println("Четверг");
            case "Пятница":
                System.out.println("Пятница");
            case "Суббота":
                System.out.println("Суббота");
            case "Воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели!");
        }
    }
    public static String listNums(int x) {
        String result ="";
        for (int i = 0; i < x; i++) {
            result+=i+" ";
        }
        return result;
    }
    public static String reverseListNums(int x){
        String result ="";
        for (;x>0;x--){
            result+=x+" ";
        } return result;
    }
    public static String chet(int x) {
        String result ="";
        for (int i = 0; i <=x; i+=2) {
            result += " " + i;

        }

        return result;
    }
    public static int pow(int x, int y){
        if (x==0) return 0;
        else if (y==0) return 1;
        else {
            int z =1;
            for (;y!=0;y--){
                z=z*x;}
            return z;
        }
    }
    public static int numLen(long x) {
        if (x==0) return 1;
        int z =0;
        for (;x!=0; z++)
        {
            x=x/10;
        } return z;
    }
    public static int equalNum(int x)
    {
        return x/10;

    }
    public static void square(int x) {
        for (int i=x; i != 0; i--) {
            for (int y = x; y != 0; y--) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void leftTriangle(int x){
        for ( ;x!=0;x--){
            for (int i=0;i!=x;i++){
                System.out.print('*');
            }System.out.println();
        }
    }
    public static void rightTriangle (int x){
        for (int i=0; i!=x; i++) {
            for (int j=0;j<(x-i-1);j++){
                System.out.print(' ');
            }
            for (int z=0; z<i; z++){
                System.out.print('*');
            }System.out.println();
        }


    }



    public static void guessGame() {
        int randomNum = 3;
        int trysum = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        while (x != randomNum){
            System.out.println("No, try again");
            trysum++;
            x = sc.nextInt();
        }

        System.out.println("Yes, it`s " + randomNum);
        System.out.println("you tried " + (trysum+1) + " times");

    }
    public static int findFirst(int[] arr, int x) {
        int i=0;
        for (int n:arr){
            if (x == n) return i;
            i++;
        }
        return -1;
    }
    public static int findLast(int[] arr, int x){

        for (int i = arr.length-1; i>0; i--){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static int maxAbs(int[] arr){
        int max =0;
        boolean sing = false;
        for (int x:arr){
            if (x<0) {
                x*=-1;
                if ( x > max) {
                    sing = true;
                    max = x;
                }
            }
            if (x>max){
                sing = false;
                max = x;
            }

        }


        if (sing == true) {
            return max*=-1;
        } return max;
    }
    public static int countPositive(int[] arr){
        int i =0;
        for(int x:arr) {
            if (x>0)
            {
                i++;
            }
        }
        return i;
    }

    public static boolean palindrom(int[] arr){
        boolean flag = true;
        int z = arr.length;
        for (int i = 0; i<z/2 && z!=0;i++){
            if (arr[i]!=arr[z-i-1])
            {flag=false; break;}
        }
        return flag;

    }

    public static void reverse(int[] arr){

        for(int i:arr){
            System.out.print(i+" ");
        } System.out.println();
        int change =0;
        for(int i = 0; i<(arr.length-1)/2; i++){
            change =arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1] = change;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }System.out.println();
    }
    public static int[] reverseBack(int[] arr) {
        int [] reversarr = new int[arr.length];
        int index=0;
        for (int i = arr.length - 1; i>0 ; i--, index++) {
            reversarr[index] = arr[i];
        }
        return reversarr;
    }
    public static int[] concat(int[] arr1, int[] arr2){

        int [] result = new int[arr1.length+arr2.length];
        int i = 0;
        for (int x:arr1){
            result[i]= x;
            i++;
        }
        for (int x:arr2){
            result[i]=x;
            i++;
        }
        return result;
    }
    public static int[] findAll(int[] arr, int x) {
        int i =0;
        for (int z: arr){if (z==x){i++;}}
        int [] result = new int [i];
        i=0;
        int n=0;
        for (int y:arr){if (y==x){result[n]=i; n++;}i++;}
        return result;
    }

    public static int[] deleteNegative(int[] arr){

        int i =0;
        for (int x:arr){
            if (x>0){
                i++;
            }
        }
        int [] result = new int[i];
        i=0;
        for (int z: arr){
            if(z>0){
                result[i] = z;
                i++;
            }
        } return result;
    }

    public static int[] add(int[] arr, int x, int pos){
        int [] result = new int[arr.length+1];
        int [] stack = new int [arr.length-pos];
        int z =0;
        if (pos == arr.length){result[arr.length]=x;}
        for ( int i = pos; i<arr.length; i++)
        {
            stack[z] = arr[i];
            z++;
        }
        for (int i=0; i<arr.length;i++){
            if (i==pos){
                result[i] =x;
                i++;
                for (int y:stack){ result[i]=y;i++;}
                break;
            }
            result[i] = arr[i];

        }


        return result;


    }
    public static int[] arradd(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        int i = 0;
        if (pos == arr.length){
            for (int x : arr){
                result[i] = x;
                i++;
            }
            for (int x:ins){
                result[i]=x;
                i++;
            }
        } else {
            int [] stack = new int[arr.length-pos];
            for (int x=pos; x<arr.length; x++){
                stack[i]=arr[x];
                i++;
            }
            i=0;
            for (int x=0; x!=pos; x++){
                result[i] = arr[x];
                i++;
            }
            for (int x:ins){result[i]=x; i++;}
            for (int x:stack){result[i]=x; i++;}

        }




        return result;
    }
}


