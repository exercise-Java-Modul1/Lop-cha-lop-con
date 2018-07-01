package Moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    float[] array = {getxSpeed(), getySpeed()};

    public float[] getArray1() {
        return array;
    }

    public void setArray1(float[] array1) {
        this.array = array1;
    }
    public void totoString() {
        System.out.println("Point{x=" + getX() + ", y=" + getY() + ", array=[" + getX() + ", " + getY() + "]}");
        System.out.println("Speed{xs=" + getxSpeed() + ", ys=" + getySpeed() + ", array=[" + getxSpeed() + ", " + getySpeed() + "]}");
    }
    public void move() {
        System.out.println("MovePoint{x=" + (getX() + getxSpeed()) + ", y=" + (getY() + getySpeed()) + ", array=[" + (getX() + getxSpeed()) + ", " + (getY() + getySpeed()) + "]}");
    }
}
