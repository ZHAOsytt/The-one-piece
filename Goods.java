package chap01;

public class Goods {

	//属性
	private String num;
	private String name;
	
	//构造方法
	public Goods() {
		
	}
	
	public Goods(String num,String name) {
		this.num=num;
		this.name=name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//显示货物信息
	public void displayInfo() {
		System.out.println("货物编号："+num+"，货物名称:"+name);
	}
}