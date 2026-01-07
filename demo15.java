package project04;
import java.util.Scanner;
public class demo15 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("请输入算术表达式（格式：数字+运算符+数字，如2+3、5*6）：");
	        String expression = scanner.nextLine();
	        try {
	            char operator = ' ';
	            int num1 = 0, num2 = 0;
	            for (int i = 0; i < expression.length(); i++) {
	                char c = expression.charAt(i);
	                if (c == '+' || c == '-' || c == '*' || c == '/') {
	                    operator = c;
	                    num1 = Integer.parseInt(expression.substring(0, i).trim());
	                    num2 = Integer.parseInt(expression.substring(i + 1).trim());
	                    break;
	                }
	            }
	            int result = 0;
	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 == 0) {
	                        throw new ArithmeticException("chushu not = =除数不能为0");
	                    }
	                    result = num1 / num2;
	                    break;
	                default:
	                    throw new IllegalArgumentException("wu xiao无效的运算符，仅支持+、-、*、/");
	            }
	            System.out.println(expression + " = " + result);

	        } catch (NumberFormatException e) {
	            System.out.println("error错误：输入的不是有效数字！");
	        } catch (ArithmeticException e) {
	            System.out.println("error错误：" + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("error错误：" + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("error错误：表达式格式错误，请按“数字+运算符+数字”的格式输入！");
	        } finally {
	            scanner.close();
	        }
	    }
	}