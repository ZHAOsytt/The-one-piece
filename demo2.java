package project01;
import java.util.Scanner;

public class demo2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("input a：");
	        double a = scanner.nextDouble();
	        System.out.print("input b：");
	        double b = scanner.nextDouble();
	        System.out.print("input c：");
	        double c = scanner.nextDouble();
	        if (a == 0) {
	            System.out.println("a not = 0，");
	            scanner.close();
	            return;
	        }
	        double delta = b * b - 4 * a * c;
	        if (delta > 0) {
	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("two answer：x1=" + x1 + "，x2=" + x2);
	        } else if (delta == 0) {
	            double x = -b / (2 * a);
	            System.out.println("only one answer：x=" + x);
	        } else {
	            System.out.println("not answer");
	        }  
	        scanner.close();
	    }
	}