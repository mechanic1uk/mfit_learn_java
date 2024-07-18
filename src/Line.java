public class Line {

    private Point startPoint;
    private Point endPoint;

    Line (Point startPoint, Point endPoint){
        this.startPoint = new Point(startPoint.getX(),startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }
    Line (int startX, int startY, int endX, int endY){
        this.startPoint = new Point(startX, startY);
        this.endPoint = new Point(endX, endY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = new Point(startPoint.getX(),startPoint.getY());
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public Point getStartPoint() {
        return new Point(this.startPoint.getX(), this.startPoint.getY());
    }

    public Point getEndPoint() {
        return new Point(this.endPoint.getX(), this.endPoint.getY());
    }

    public int distance (){
        double result = Math.sqrt(endPoint.getX() - startPoint.getX()) + Math.sqrt(endPoint.getY()-startPoint.getY());
        return (int) result;
    }

    @Override
    public String toString(){
        return "Линия от " + startPoint + " до " + endPoint;
    }
}
/*
@todo

Линия: сеттеры нарушают требования:
так как присваиваются ссылки переданные снаружи,
это означает что две линии могут ссылаться на один объект Точки

1.2.1
Прямая. Создайте сущность Линия, расположенную на двумерной плоскости, которая описывается:
•	Координата начала: Точка
•	Координата конца: Точка
•	Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
Для указания координат нужно использовать сущность Точка, разработанную в примере 1.1.1. Создайте линии со следующими характеристиками:
1.	Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
3.	Линия 3 которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же, где заканчивается линия 2.
Таким образом, если положение первой или второй линии меняется, то меняется и третья линия.
4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это таким образом,
чтобы положение третьей линии соответствовало требованиям пункта 3.
5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.


1.4.2
Создаем Линию. Измените сущность Линия из задачи 1.2.1. Новые требования включают:
•	Создание Линии возможно с указанием Точки начала и Точки конца (Точки из задачи 1.4.1)
•	Создание Линии возможно с указанием координат начала и конца как четырех чисел (x1,y1,x2,y2)
Создайте линии со следующими характеристиками:
1.	Линия 1 с началом в т. {1;3} и концом в {23;8}.
2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
3.	Линия 3 которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же, где заканчивается линия 2.


1.5.3
Длина Линии. Измените сущность Линия из задачи 1.4.2.
Добавьте ей возможность возвращать по запросу пользователя расстояние
между точками начала и конца (в виде целого числа).
Создайте линию из точки {1;1} в точку {10;15} и выведите на экран её длину.

1.6.6 Отдельные линии. Измените сущность Линия из задачи 1.5.3. Необходимо, чтобы Линия соответствовала следующим требованиям:
•	Две любые линии не могут ссылаться на один и тот же объект точки.
•	У Линии можно изменить координаты начала или конца
•	У Линии можно запросить координаты начала или конца
Продемонстрируйте работоспособность решения на примерах.


 */