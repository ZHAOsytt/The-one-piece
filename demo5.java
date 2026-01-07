package project02;
import java.util.Arrays;
import java.util.Scanner;
public class demo5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[] scores = new double[9];
	        System.out.println("input 9 score（0-100）：");
	        for (int i = 0; i < 9; i++) {
	            scores[i] = scanner.nextDouble();
	        }
	        Arrays.sort(scores);
	        double sum = 0;
	        for (int i = 1; i < 8; i++) { 
	            sum += scores[i];
	        }
	        double average = sum / 7;
	        System.out.printf("finally score：%.2f\n", average);
	        scanner.close();
	    }
	}