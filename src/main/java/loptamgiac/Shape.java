package loptamgiac;


import java.util.Scanner;

public class Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Scanner sc = new Scanner(System.in);

    public Shape() {

    }

    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void NhapTT() {
        System.out.println("Nhập độ dài cho 3 cạnh cảu tam giác: ");
        System.out.print("Độ dài cạnh thứ nhất: ");
        double side1 = sc.nextInt();
        setSide1(side1);
        System.out.print("Độ dài cạnh thứ hai: ");
        double side2 = sc.nextInt();
        setSide2(side2);
        System.out.print("Độ dài cạnh thứ ba: ");
        double side3 = sc.nextInt();
        setSide3(side3);
    }

    public double getArea() {
        return (getSide3() * Math.sqrt(Math.pow(getSide1(), 2)
                - (Math.pow(getSide1(), 2) - Math.pow(getSide2(), 2)
                + Math.pow(getSide3(), 2)) / (2 * getSide3()))) / 2;
    }

    public double getPerimeter() {
        return (getSide1() + getSide2() + getSide3());
    }

    public void giaTri() {
        System.out.println("Tam gác với 3 cạnh lầm lượt là " + getSide1() + " " + getSide2() + " " + getSide3() + " có:");
        System.out.println("Chu vi là: " + getArea());
        System.out.println("Diện tích là: " + getPerimeter());
    }
}
