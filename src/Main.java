public class Main {
    public static void main(String[] args) {


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

        Employees kozlov = new Employees("Козлов", "IT");
        Employees petrov = new Employees("Петров", "IT",kozlov);
        Employees sidorov = new Employees("Сидоров", "IT", kozlov);

        System.out.println(kozlov.toString());
        System.out.println(petrov.toString());
        System.out.println(sidorov.toString());

        Student Vasya = new Student("Вася", new int[]{3, 4, 5});
        Student Petya = new Student("Петя", Vasya.getAssassments());
        Student Andrei = new Student("Андрей", Vasya.getAssassments());

        Vasya.setAssessment(1,3);
        Petya.setAssessment(1,9);
        System.out.println(Vasya.toString());
        System.out.println(Petya.toString());
        System.out.println(Andrei.toString());



        Polyline first = new Polyline();
        Polyline second = new Polyline();
        List<Point> pointList= new ArrayList<>();


        first.addPoint(new Point(1,5));
        first.addPoint(new Point(2,8));
        first.addPoint(new Point(5,3));


        second.addPoint( first.getPoint(0));
        second.addPoint( new Point(2,-5));
        second.addPoint( new Point(4,-5));
        second.addPoint( first.getPoint(first.getSize()-1));
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println();


        first.setPoints(new Point(0,10));
        second.addPoint( first.getPoint(0));

        System.out.println(first.toString());
        System.out.println(second.toString());
*/
/* 1.6.4
       Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 5);


        // Сложение
        Fraction sum = f1.add(f2);
        System.out.println("1/3 + 2/3 = " + sum); // Вывод: 1/3 + 2/3 = 1

// Вычитание
        Fraction diff = f2.subtract(f1);
        System.out.println("2/3 - 1/3 = " + diff); // Вывод: 2/3 - 1/3 = 1/3

// Умножение
        Fraction product = f1.multiply(f2);
        System.out.println("1/3 * 2/3 = " + product); // Вывод: 1/3 * 2/3 = 2/9

// Деление
        Fraction quotient = f2.divide(f1);
        System.out.println("2/3 / 1/3 = " + quotient); // Вывод: 2/3 / 1/3 = 2

        System.out.println("1/3 * 2/3 = " + f1.multiply(f2)); // Вывод: 1/3 * 2/3 = 2/9
        Fraction result = f1.add(f2).divide(f3).subtract(5);
        System.out.println(result); // Вывод: -19/15
*/
/*        Point start = new Point(1,1);
        Point end = new Point(10,15);
        Line firstEx = new Line(start, end);
        Line secondEx = new Line(start, end);

        System.out.println(firstEx.distance());
        System.out.println(firstEx.distance());
        System.out.println(firstEx.getStartPoint()+" "+ firstEx.getEndPoint());
        System.out.println(secondEx.getStartPoint()+" "+secondEx.getEndPoint());
*/
/*        Student Petrov = new Student("Петров");

        Petrov.setAssessments(new int []{4, 2, 3, 4, 5, 5, 5} );
        System.out.println(Petrov.toString());
        Petrov.changeAssessment(1,5);
        System.out.println(Petrov.toString());
*/
        Department it = new Department("IT");
        Department omt = new Department("OMT");


        Employee kozlov = new Employee("Козлов", omt);
        Employee kozlov1 = new Employee("Козлов1", omt);
        Employee ivanov = new Employee("Иванов", it);
        Employee petrov = new Employee("Петров", it);
        Employee sidorov = new Employee("Сидоров", omt);

        it.setBoss(ivanov);
        omt.setBoss(kozlov);


        System.out.println(kozlov.toString());
        System.out.println(ivanov.toString());
        System.out.println(petrov.toString());
        System.out.println(sidorov.toString());
        System.out.println();
        System.out.println(it.getEmployees());

        System.out.println(omt.getEmployees());

        it.setBoss(kozlov);

//        System.out.println(it.getBoss());
//        System.out.println(omt.getBoss());
        System.out.println();
        System.out.println(kozlov.toString());
        System.out.println(ivanov.toString());
        System.out.println(petrov.toString());
//        System.out.println(sidorov.toString());
        System.out.println(it.getEmployees());
        System.out.println(omt.getEmployees());







 /*
        City city1 = new City("Москва");
        City city2 = new City("Воронеж");
        City city3 = new City("Казань");

        // Создаем прямую дорогу между городами 1 и 2
        city1.addRoad(city2, true);

        // Создаем транзитную дорогу между городами 1 и 3 через город 2
        city1.addRoad(city3, false);
        city2.addRoad(city3, true);

        // Проверяем наличие прямой дороги между городами
        System.out.println("Дорога между " + city1.getName() + " и " + city2.getName() + " " + city1.isDirectRoad(city2)); // true
        System.out.println("Дорога между " + city1.getName() + " и " + city3.getName() + " " + city1.isDirectRoad(city3)); // false


        // Добавляем новую прямую дорогу между городами 1 и 3
        city1.addRoad(city3, true);

        // Удаляем дорогу между городами 1 и 2
        city1.removeRoad(city2);

        // Проверяем, что города 1 и 2 больше не связаны
        System.out.println(city1.getName() + " и " + city2.getName() + " : " + city1.isConnected(city2)); // false

         */

 /*       Polyline first = new Polyline();
        Polyline second = new Polyline();
        List<Point> pointList= new ArrayList<>();


        first.addPoint(new Point(1,5));
        first.addPoint(new Point(2,8));
        first.addPoint(new Point(5,3));


        second.addPoint( first.getPoint(0));
        second.addPoint( new Point(2,-5));
        second.addPoint( new Point(4,-5));
        second.addPoint( first.getPoint(first.getSize()-1));
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println();


        first.setPoints(new Point(0,10));
        second.addPoint( first.getPoint(0));

        System.out.println(first.toString());
        System.out.println(second.toString());

  */

    }

}

/*
3.1.2, 3.2.3, 3.2.4, 3.3.3, 3.3.5
 */
