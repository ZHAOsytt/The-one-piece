package project01;
import java.util.Scanner;
public class demo4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("first number：");
	        int num1 = scanner.nextInt();
	        System.out.print("second number：");
	        int num2 = scanner.nextInt();
	        int gcd = calculateGCD(num1, num2);
	        int lcm = calculateLCM(num1, num2, gcd);
	        System.out.println("biggest gongyueshu：" + gcd);
	        System.out.println("last gongbeishu：" + lcm); 
	        scanner.close();
	    }
	    public static int calculateGCD(int a, int b) {
	        a = Math.abs(a);
	        b = Math.abs(b);
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	    public static int calculateLCM(int a, int b, int gcd) {
	        if (gcd == 0) {
	            return 0;
	        }
	        return Math.abs(a * b) / gcd;
	    }
	}