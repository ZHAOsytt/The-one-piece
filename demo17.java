package project05;

public class demo17 {
	    private double length;
	    private double width;
	    private double height;
	    public demo17(double length, double width, double height) {
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }
	    public double getVolumn() {
	        return length * width * height;
	    }
	    public static void main(String[] args) {
	        Box box = new Box(3.0, 2.0, 4.0);
	        System.out.println("箱子的体积为：" + box.getVolumn());
	    }
	}