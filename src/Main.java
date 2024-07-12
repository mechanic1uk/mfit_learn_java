
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//
//        System.out.println (String.format("%.2f", Utils.faction (5.25)));
//        System.out.println (String.format("%.2f", Utils.faction (11.993)));
//        System.out.println (String.format("%.2f", Utils.faction (3.1)));
//        System.out.println (Utils.sumLastNums (4568));
//        System.out.println (Utils.charToNum('3'));
//        System.out.println ("isPositive:  "+ Utils.isPositive(-10));
//        System.out.println ("is2Digits:   "+Utils.is2Digits(23));
//        System.out.println ("isUpperCase: "+Utils.isUpperCase('d'));
//        System.out.println ("isInRange:   "+Utils.isInRange(2,15,33));
//        System.out.println ("isDivisior:  "+ Utils.isDivisor (12,2));
//        System.out.println ("isEqual:  "+ Utils.isEqual (13,13, 13));
//        System.out.println ("lastNUm:  "+ Utils.lastNumSum (Utils.lastNumSum(Utils.lastNumSum(Utils.lastNumSum(5,11),123),14),1));
//
//        //        -----------------------------------------ЗАДАНИЕ 3 -----------------------------------------
//        System.out.println("MOD: " + Utils.safeDiv(99, 9));
//        System.out.println("ABS: " + Utils.abs(5));
//        System.out.println("MAX: " + Utils.max(53, 1));
//        System.out.println("makeDecision: " + Utils.makeDecision(99, 130));
//        System.out.println("MAX3: " + Utils.max3(12, 13, -15));
//        System.out.println("SUM3: " + Utils.sum3(14, 5, -8));
//        System.out.println("SUM2: " + Utils.sum2(14, -3));
//        System.out.println("IS35: " + Utils.is35(30));
//        System.out.println("MAGIC6: " + Utils.magic6( 6,  10));
//        System.out.println("AGE: " + Utils.age( 20));
//        System.out.println("DAY: " + Utils.day( 5));
//        System.out.println("WEEK: " );
//        Utils.printDays("Среда");
////        -----------------------------------------ЗАДАНИЕ 4 -----------------------------------------
//        Utils.guessGame();
//        System.out.println(Utils.listNums(5));
//        System.out.println(Utils.reverseListNums(5));
//        System.out.println(Utils.chet(12));
//        System.out.println(Utils.pow(2,5));
//        System.out.println(Utils.numLen(0));
//        System.out.println(Utils.equalNum(141));
//        Utils.square(6);
//        Utils.leftTriangle(3);
//        Utils.rightTriangle(5);
//        -----------------------------------------ЗАДАНИЕ 5 -----------------------------------------

//        int [] arr={1,20,-300,0,-20, 44,-77};
//         arr= new int[]{1, 5, 7, 4, 7, 5, 1};
//        int [] arr1= {1,2,3};
//        int [] arr2= {7,8,9};
//        System.out.println(Utils.findFirst(arr, 5));
//        System.out.println(Utils.findLast(arr, 1));
//        System.out.println(Utils.maxAbs(arr));
//        System.out.println(Utils.countPositive(arr));
//        System.out.println(Utils.palindrom(arr));

//        int [] arrx= Utils.reverseBack(arr);
//        for (int x: arrx) {System.out.print(x+" ");}
//          int [] arr3= Utils.concat(arr1,arr2);
//          for(int i:arr3){
//                System.out.print(i+" ");
//          }
//         arr= new int[]{1, 2, 3, 8, 2, 2, 9};
//        int [] reslt = Utils.findAll(arr, 2);
//        for (int x:reslt){
//            System.out.print(x+" ");
//        }
//        arr= new int[]{1, 2, -3, 4, -2, 2, -5};
//        reslt = Utils.deleteNegative(arr);
//        for (int x:reslt){
//            System.out.print(x+" ");
//        }
//        Utils.reverse(arr);
//        arr= new int[]{1, 2, 3, 4, 5};
//        int [] ins= {7,8,9};
//        int insert=99;
//        int pos=2;
//        int [] rst = Utils.add(arr, insert,pos);
//        int [] rst = Utils.arradd(arr, ins, pos);
//        for (int z:rslt){System.out.print(z+" ");}
//        System.out.println();
//        for (int y:rst){System.out.print(y+" ");}
//
//        String s = "1+2";
//        String[] spl = s.split("\\+");
//        for (String str:spl){System.out.println(str);}
/*//1.1.1
        Point point1 = new Point(1,5);
        Point point2 = new Point(10,51);
        Point point3 = new Point(11,25);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println();
        Human h1 = new Human(new Name("Клеопатра","",""), 152);
        Human h2 = new Human(new Name("","Пушкин", ""), 167);
        Human h3 = new Human(new Name("Владимир","Маяковский", ""), 189);
//1.1.2
        System.out.println("Name: " + h1.getName() + " hight " + h1.getHight() );
        System.out.println("Name: " + h2.getName() + " hight " + h2.getHight() );
        System.out.println("Name: " + h3.getName() + " hight " + h3.getHight() );

//1.1.3
        Name kleopatra = new Name("Клеопатра", "", "");
        System.out.println(kleopatra);

        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        System.out.println(pushkin);

        Name mayakovsky = new Name("Маяковский", "Владимир", "");
        System.out.println(mayakovsky);
//1.1.4
        Time time1 = new Time(10);
        System.out.println("10 секунд: " + time1.toString());

        Time time2 = new Time(10000);
        System.out.println("10000 секунд: " + time2.toString());

        Time time3 = new Time(100000);
        System.out.println("100000 секунд: " + time3.toString());
        Home firsthome = new Home(1);
        Home secondhome = new Home(5);
        Home thirdhome = new Home(23);
        Home fourthome = new Home("Дом № 153",  23);
//1.1.5
        System.out.println(firsthome.toString());
        System.out.println(secondhome.toString());
        System.out.println(thirdhome.toString());
        System.out.println(fourthome.toString());

//1.2
        System.out.println("1.2.1");
        Point start = new Point(1,2);
        Point end = new Point(123,233);
        Line line1 = new Line(start, end);
        start.setXY(5, 10);
        end.setXY(25, 10);
        Line line2 = new Line(start, end);
        Line line3 = new Line(line1.getStartPoint(), line2.getEndPoint());
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());
        line1.setStartEndPoint( new Point(22,33 ), new Point(44,99 ));
        line2.setStartEndPoint( new Point(100,1 ), new Point(144,990 ));
        line3.setStartEndPoint(line1.getStartPoint(), line2.getEndPoint());
        System.out.println();
        System.out.println();
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line3.toString());

    Name gfath = new Name("Иван","Чудов","Сергеевич" );
    Name son = new Name("Петр","Чудов","" );
    Name fath = new Name("Борис","","" );
    Human ivan = new Human(gfath);
    Human petr = new Human(son,gfath);
    Human boris = new Human(fath,son);

        System.out.println(ivan.toString());
        System.out.println(petr.toString());
        System.out.println(boris.toString());
*/
        Employees kozlov = new Employees("Козлов", "IT");
        Employees petrov = new Employees("Петров", "IT",kozlov);
        Employees sidorov = new Employees("Сидоров", "IT", kozlov);

        System.out.println(kozlov.toString());
        System.out.println(petrov.toString());
        System.out.println(sidorov.toString());

    }

}

// 1.6.4, 1.6.6, 1.6.9, 1.6.10, 1.6.11