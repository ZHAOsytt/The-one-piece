package project02;
import java.util.Arrays;
public class demo6 {
	    public static void main(String[] args) {
	        int[] oldArr = {1, 3, 4, 5, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
	        Arrays.sort(oldArr);
	        int zeroCount = 0;
	        for (int num : oldArr) {
	            if (num == 0) {
	                zeroCount++;
	            } else {
	                break;
	            }
	        }
	        int[] newArr = Arrays.copyOfRange(oldArr, zeroCount, oldArr.length);
	        System.out.println("Array shuzu：" + Arrays.toString(oldArr));
	        System.out.println("delete 0：" + Arrays.toString(newArr));
	    }
	}