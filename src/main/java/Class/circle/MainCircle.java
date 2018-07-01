package Class.circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Diện tích hình tròn có bán kính " + circle.getRadius()
                + " và màu " + circle.getColor() + " là: " + circle.getArea());
        circle = new Circle(5, " green");
        System.out.println("Diện tích hình tròn có bán kính " + circle.getRadius()
                + " và màu " + circle.getColor() + " là: " + circle.getArea());
        circle = new Cylinder(5.1, 3.0, "gray");
        System.out.println("Thể tích hình trụ có bán kính " + circle.getRadius()
                + " chiều cao " + ((Cylinder) circle).getHeight() + " màu sắc "
                + circle.getColor() + " là: " + ((Cylinder) circle).getVolume());
    }
}
