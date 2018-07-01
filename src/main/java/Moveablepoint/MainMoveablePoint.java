package Moveablepoint;

public class MainMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(3.1f, 4.2f);
        point.totoString();
        Point moveablePoint = new MoveablePoint(2.5f, 3.1f, 7.0f, 3.5f);
        moveablePoint.totoString();
        ((MoveablePoint) moveablePoint).move();
    }
}
