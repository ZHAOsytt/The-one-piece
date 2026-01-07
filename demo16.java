package project05;

public class demo16 {
	    private String name;
	    public demo16() {
	        this("默认姓名");
	    }
	    public demo16(String name) {
	        this.name = name;
	        System.out.println("Person的name属性值为：" + this.name);
	    }
	    public static void main(String[] args) {
	        demo16 person = new demo16();
	    }
	}