package project03;

public class demo11 {
	public class GeometricObject {
	    String color;
	    boolean filled;
	    public GeometricObject() {
	        this.color = "white";
	        this.filled = false;
	    }
	    public GeometricObject(String color, boolean filled) {
	        this.color = color;
	        this.filled = filled;
	    }
	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean isFilled() {
	        return filled;
	    }

	    public void setFilled(boolean filled) {
	        this.filled = filled;
	    }
	}}

public class Triangle extends GeometricObject {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    public Triangle() {
        super();
    }
    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isTriangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    public double getArea() {
        if (!isTriangle()) {
            return 0;
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter() {
        if (!isTriangle()) {
            return 0;
        }
        return a + b + c;
    }
    @Override
    public String toString() {
        return "三角形的三边：a=" + a + ", b=" + b + ", c=" + c + "\n面积：" + getArea() + "\n周长：" + getPerimeter();
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        while (true) {
            System.out.print("请输入三角形的第一条边：");
            double a = scanner.nextDouble();
            System.out.print("请输入三角形的第二条边：");
            double b = scanner.nextDouble();
            System.out.print("请输入三角形的第三条边：");
            double c = scanner.nextDouble();

            triangle.setA(a);
            triangle.setB(b);
            triangle.setC(c);

            if (triangle.isTriangle()) {
                break;
            } else {
                System.out.println("a b c not input sanjiaoxing");
            }
        }
        scanner.nextLine();
        System.out.print("请输入三角形的颜色color：");
        String color = scanner.nextLine();
        triangle.setColor(color);
        System.out.print("请输入是否填充（true/false）：");
        boolean filled = scanner.nextBoolean();
        triangle.setFilled(filled);
        System.out.println("\n" + triangle.toString());
        if (triangle.isFilled()) {
            System.out.println("三角颜色color：" + triangle.getColor());
        }

        scanner.close();
    }
}