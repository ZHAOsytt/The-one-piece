package project01;
import java.util.Scanner;
public class demo3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); 
	        System.out.print("请输入一个年份：");
	        int year = scanner.nextInt();
	        String[] zodiacs = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
	        int index = (year - 1900) % 12;
	        if (index < 0) {
	            index += 12;
	        }
	        System.out.println(year + "年的生肖是：" + zodiacs[index]);
	        scanner.close();
	    }
	}