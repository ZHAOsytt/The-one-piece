package project04;
import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
public class demo14 {
	    public static void main(String[] args) {
	        String filePath = "test.txt";
	        int charCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;
	        boolean inWord = false; 
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                lineCount++;
	                char[] chars = line.toCharArray();
	                
	                for (char c : chars) {
	                    charCount++;
	                    if (c == ' ') {
	                        inWord = false;
	                    } else if (!inWord) {
	                        inWord = true;
	                        wordCount++;
	                    }
	                }
	                charCount++;
	            }
	            if (charCount == 0) {
	                lineCount = 0;
	            }
	            System.out.println("zifu字符数（含空格、换行）：" + charCount);
	            System.out.println("word单词数：" + wordCount);
	            System.out.println("hangshu行数：" + lineCount);

	        } catch (IOException e) {
	            System.out.println("duqushibai文件读取失败：" + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	}