public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println (String.format("%.2f", faction (5.25)));
        System.out.println (String.format("%.2f", faction (11.993)));
        System.out.println (String.format("%.2f", faction (3.1)));
        System.out.println (sumLastNums (4568));
        System.out.println (charToNum('3'));
        System.out.println ("isPositive:  "+isPositive(-10));
        System.out.println ("is2Digits:   "+is2Digits(23));
        System.out.println ("isUpperCase: "+isUpperCase('d'));
        System.out.println ("isInRange:   "+isInRange(2,15,33));
        System.out.println ("isDivisior:  "+ isDivisor (12,2));
        System.out.println ("isEqual:  "+ isEqual (13,13, 13));
        System.out.println ("lastNUm:  "+ lastNumSum (lastNumSum(lastNumSum(lastNumSum(5,11),123),14),1));

    }

    public static double faction (double x){
        return (x - (int) x );
    }
//    Необходимо реализовать метод таким образом, чтобы он возвращал результат
//    сложения двух последних знаков числа х, предполагая, что знаков в числе не менее двух.
//    Подсказки:
//    int x=123%10; // х будет иметь значение 3
//    int у=123/10; // у будет иметь значение 12
//
//    Пример:
//    x=4568
//    результат: 14

    public static int sumLastNums(int x){
        return (x%10 + x/10 %10);
    }

    //    Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”.
//    Необходимо реализовать метод таким образом, чтобы он преобразовывал символ в соответствующее число.
//    Подсказка:
//    код символа ‘0’ — это число 48.
//
//    Пример:
//    x=’3’
//    результат: 3
    public static int charToNum(char x){
        return (int) x -'0';
    }
    //    Необходимо реализовать метод таким образом,
//    чтобы он принимал число x и возвращал true если оно положительное.
//    Пример 1:
//    x=3
//    результат: true
//    Пример 2:
//    x=-5
//    результат: false
    public static boolean isPositive(int x) {
        boolean z = x>=0;
        return z;
    }
    //    Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно двузначное.
//            Пример 1:
//    x=32
//    результат: true
//    Пример 2:
//    x=516
//    результат: false
    public static boolean is2Digits(int x){
        boolean z = x >= 9 & x <= 99;
        return  z;
    }
    //    Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая буква в диапазоне от ‘A’ до ‘Z’.
//    Пример 1:
//    x=’D’
//    результат: true
//    Пример 2:
//    x=’q’
//    результат: false
    public static boolean isUpperCase(char x){
        return  (x >= 'A' & x <= 'Z');
    }
    //    Метод принимает левую и правую границу (a и b) некоторого числового диапазона.
//    Необходимо реализовать метод таким образом, чтобы он возвращал true, если num входит в указанный диапазон (включая границы). Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а кто меньше)
//    Пример 1:
//    a=5 b=1 num=3
//    результат: true
//    Пример 2:
//    a=2 b=15 num=33
//    результат: false
    public static boolean isInRange(int a, int b, int num) {
        return num >= a && num <= b || num <= a && num >= b;
    }
    //    Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит другое нацело.
//    Пример 1:
//    a=3 b=6
//    результат: true
//    Пример 2:
//    a=2 b=15
//    результат: false
    public static boolean isDivisor (int a, int b){
        return (a % b==0 || b % a==0);
    }
//    Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа равны
//    Пример 1:
//    a=3 b=3 с=3
//    результат: true
//    Пример 2:
//    a=2 b=15 с=2
//    результат: false

    public static boolean isEqual (int a, int b, int c){
        return (a == b & b == c);
    }
//    Выполните с его помощью последовательное сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран.
//    Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.
//    Ответом на данное задание является код метода main, в котором происходит вызов данного метода.
//    Решение выполняется в таком порядке:
//            5+11 это 6
//            6+123 это 9
//            9+14 это 13
//            13+1 это 4
//    Итого 4

    public static int lastNumSum(int a, int b){
        return (a % 10)+(b % 10);
    }

}