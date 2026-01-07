package project04;
import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Random;
public class demo13 {
	    public static void main(String[] args) {
	        Random random = new Random();
	        String filePath = "data.dat";
	        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
	            System.out.println("input random number：");
	            for (int i = 0; i < 10; i++) {
	                int num = random.nextInt(1001) + 1000; // 1000~2000
	                System.out.print(num + " ");
	                dos.writeInt(num);
	            }
	            System.out.println("\nshu ju xie ru data.dat");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
	            System.out.println("\nwen jian du qu：");
	            for (int i = 0; i < 10; i++) {
	                int num = dis.readInt();
	                System.out.print(num + " ");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}