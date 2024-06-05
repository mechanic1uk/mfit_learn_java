
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println (String.format("%.2f", Utils.faction (5.25)));
        System.out.println (String.format("%.2f", Utils.faction (11.993)));
        System.out.println (String.format("%.2f", Utils.faction (3.1)));
        System.out.println (Utils.sumLastNums (4568));
        System.out.println (Utils.charToNum('3'));
        System.out.println ("isPositive:  "+ Utils.isPositive(-10));
        System.out.println ("is2Digits:   "+Utils.is2Digits(23));
        System.out.println ("isUpperCase: "+Utils.isUpperCase('d'));
        System.out.println ("isInRange:   "+Utils.isInRange(2,15,33));
        System.out.println ("isDivisior:  "+ Utils.isDivisor (12,2));
        System.out.println ("isEqual:  "+ Utils.isEqual (13,13, 13));
        System.out.println ("lastNUm:  "+ Utils.lastNumSum (Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(5,11),123),14),1));

        //        -----------------------------------------ЗАДАНИЕ 3 -----------------------------------------
        System.out.println("MOD: " + Utils.safeDiv(99, 9));
        System.out.println("ABS: " + Utils.abs(5));
        System.out.println("MAX: " + Utils.max(53, 1));
        System.out.println("makeDecision: " + Utils.makeDecision(13, 13));
        System.out.println("MAX3: " + Utils.max3(12, 13, -15));
        System.out.println("SUM3: " + Utils.sum3(14, 5, -8));
        System.out.println("SUM2: " + Utils.sum2(14, -3));
        System.out.println("IS35: " + Utils.is35(15));
        System.out.println("MAGIC6: " + Utils.magic6( 6,  10));
        System.out.println("AGE: " + Utils.age( 44));
        System.out.println("DAY: " + Utils.day( 5));
        System.out.println("\nWEEK: " );
        Utils.printDays("Среда");
//        -----------------------------------------ЗАДАНИЕ 4 -----------------------------------------
        Utils.guessGame();
        System.out.println(Utils.listNums(5));
        System.out.println(Utils.reverseListNums(5));
        System.out.println(Utils.chet(12));
        System.out.println(Utils.pow(2,5));
        System.out.println(Utils.numLen(0));
        System.out.println(Utils.equalNum(141));
        Utils.square(6);
        Utils.leftTriangle(3);
        Utils.rightTriangle(5);
//        -----------------------------------------ЗАДАНИЕ 5 -----------------------------------------

        int [] arr={1,2,-3,0,-12,44,-77};
         arr= new int[]{1, 5, 7, 4, 7, 5, 1};
        int [] arr1= {1,2,3};
        int [] arr2= {7,8,9};
        System.out.println(Utils.findFirst(arr, 5));
        System.out.println(Utils.findLast(arr, 1));
        System.out.println(Utils.maxAbs(arr));
        System.out.println(Utils.countPositive(arr));
        System.out.println(Utils.palindrom(arr));
        int [] arrx= Utils.reverseBack(arr);
        for (int x: arrx) {System.out.print(x+" ");}
          int [] arr3= Utils.concat(arr1,arr2);
          for(int i:arr3){
                System.out.print(i+" ");
          }
         arr= new int[]{1, 2, 3, 8, 2, 2, 9};
        int [] reslt = Utils.findAll(arr, 2);
        for (int x:reslt){
            System.out.print(x+" ");
        }
        arr= new int[]{1, 2, -3, 4, -2, 2, -5};
        reslt = Utils.deleteNegative(arr);
        for (int x:reslt){
            System.out.print(x+" ");
        }
        Utils.reverse(arr);
        arr= new int[]{1, 2, 3, 4, 5};
        int [] ins= {7,8,9};
        int x=99;
        int pos=5;
        int [] rslt = Utils.add(arr, x,pos);
        int [] rst = Utils.arradd(arr, ins, pos);
       for (int z:rslt){System.out.print(z+" ");}
       System.out.println();
        for (int y:rst){System.out.print(y+" ");}

        String s = "1+2";
        String[] spl = s.split("\\+");
        for (String str:spl){System.out.println(str);}
    }

}