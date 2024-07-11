public class Line {

    private Point startPoint;
    private Point endPoint;

    Line (Point startPoint, Point endPoint){
        this.startPoint = new Point(startPoint.getX(), startPoint.getY());
        this.endPoint = new Point(endPoint.getX(), endPoint.getY() );
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

    @Override
    public String toString(){
        return "Линия от " + startPoint + " до " + endPoint;
    }
}
