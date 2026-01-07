package project05;

public class demo19 {
    public int getMax(int a, int b) {
        return a > b ? a : b;
    }
    public double getMax(double a, double b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
    	demo19 demo = new demo19();
        int intMax = demo.getMax(10, 20);
        System.out.println("The max number from two number：" + intMax);
        double doubleMax = demo.getMax(3.14, 5.98);
        System.out.println("max for two xiaoshu：" + doubleMax);
    }
}