
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

    }


}