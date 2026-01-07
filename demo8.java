package project02;

public class demo8 {
	    public static void main(String[] args) {
	        long[] fibArr = new long[50];
	        fibArr[0] = 1;
	        fibArr[1] = 1;
	        for (int i = 2; i < 50; i++) {
	            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
	        }
	        System.out.println("Fibonacci  50：");
	        for (int i = 0; i < 50; i++) {
	            System.out.printf("%15d", fibArr[i]);
	            if ((i + 1) % 10 == 0) {
	                System.out.println();
	            }
	        }
	    }
	}