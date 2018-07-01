package Class.circle;

public class Cylinder extends Circle{
    private double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public Cylinder() {

    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return height*getRadius()*getRadius()*Math.PI;
    }
}
