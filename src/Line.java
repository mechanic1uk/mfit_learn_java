public class Line {

    private Point startPoint;
    private Point endPoint;

    Line (Point startPoint, Point endPoint){
        this.startPoint = new Point(startPoint.getX(), startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY() );
    }
    Line (int ... points){
        if (points.length < 4) throw new IllegalArgumentException("Не верно указано количество аргументов. Количество аргументов должно быть не меньше 4-x");
        this.startPoint = new Point(points[0], points[1]);
        this.endPoint = new Point(points[2], points[3]);
    }

    public Point getStartPoint(){
        return this.startPoint;
    }
    public Point getEndPoint(){
        return this.endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    public void setStartEndPoint(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;

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
