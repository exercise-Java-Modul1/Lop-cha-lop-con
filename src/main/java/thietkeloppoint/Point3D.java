package thietkeloppoint;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    float[] array = {getX(), getY(), z};

    @Override
    public float[] getArray() {
        return array;
    }

    @Override
    public void setArray(float[] array) {
        this.array = array;
    }

    public void showArray() {
        System.out.println("Point3D{x = " + getX()
                + ", y = " + getX() + ", z = " + getZ() + ", array = [" + getX() + ", " + getY() +", " + getZ() + "]}");
    }
}
