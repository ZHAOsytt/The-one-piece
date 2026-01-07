package project04;
import java.util.Scanner;
public class demo12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num1 = 0, num2 = 0;
	        boolean valid = false;
	        while (!valid) {
	            try {
	                System.out.print("The first number：");
	                num1 = Integer.parseInt(scanner.nextLine());
	                valid = true;
	            } catch (NumberFormatException e) {
	                System.out.println(" error输入格式错误，请输入整数！");
	            }
	        }
	        valid = false;
	        while (!valid) {
	            try {
	                System.out.print("second number：");
	                num2 = Integer.parseInt(scanner.nextLine());
	                valid = true;
	            } catch (NumberFormatException e) {
	                System.out.println("error输入格式错误，请输入整数！");
	            }
	        }
	        int sum = num1 + num2;
	        System.out.println("two number sum：" + sum);
	        scanner.close();
	    }
	}

