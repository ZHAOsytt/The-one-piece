package project02;

public class demo9 {
	    public static void main(String[] args) {
	        int total = 12;
	        int countNum = 5;
	        boolean[] people = new boolean[total];
	        for (int i = 0; i < total; i++) {
	            people[i] = true;
	        }
	        int remain = total;
	        int count = 0; 
	        int index = 0; 
	        while (remain > 1) {
	            if (people[index]) {
	                count++; 
	                if (count == countNum) {
	                    people[index] = false; 
	                    remain--; 
	                    count = 0; 
	                }
	            }
	            index = (index + 1) % total;
	        }
	        for (int i = 0; i < total; i++) {
	            if (people[i]) {
	                System.out.println("finally person：" + (i + 1) + "号");
	                break;
	            }
	        }
	    }
	}