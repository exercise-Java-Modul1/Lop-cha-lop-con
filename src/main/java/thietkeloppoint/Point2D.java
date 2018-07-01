package thietkeloppoint;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    float[] array = {getX(), getY()};

    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }
    public void showArray() {
        System.out.println("Point2D{x = " + getX()
                + ", y = " + getX() + ", array = [" + getX() + ", " + getY() + "]}");
    }
}
