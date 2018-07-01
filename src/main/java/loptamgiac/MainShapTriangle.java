package loptamgiac;

public class MainShapTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setColor("green");
        triangle.NhapTT();
        double a = triangle.getSide1();
        double b = triangle.getSide2();
        double c = triangle.getSide3();
        if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a) {
            triangle.giaTri();
        } else {
            System.out.println("Đây không phải là chiều dài 3 cạnh của 1 tam giác");
        }
    }
}
