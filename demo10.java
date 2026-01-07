package project03;

public class demo10 {
	    String name;
	    String idCard;
	    public Person() {
	        System.out.println("It's a person");
	    }
	    public Person(String name, String idCard) {
	        this.name = name;
	        this.idCard = idCard;
	    }
	    public void printInfo() {
	        System.out.println("name：" + name + "，idcard：" + idCard);
	    }
	}

public class Teacher extends Person {
    String department;
    double salary;
    public Teacher() {
        System.out.println("It's a teacher");
    }
    public Teacher(String name, String idCard) {
        super(name, idCard);
    }
    public Teacher(String name, String idCard, String department, double salary) {
        super(name, idCard);
        this.department = department;
        this.salary = salary;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("numen：" + department + "，money：" + salary);
    }
}

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "张三";
        t1.idCard = "110101199001011234";
        t1.department = "bumen";
        t1.salary = 8000.0;
        System.out.println("=== no canshu ===");
        t1.printInfo();
        Teacher t2 = new Teacher("李四", "110101199002025678");
        t2.department = "bumen";
        t2.salary = 7500.0;
        System.out.println("\n=== two canshu ===");
        t2.printInfo();
        Teacher t3 = new Teacher("王五", "110101199003039012", "bumen", 9000.0);
        System.out.println("\n=== four canshu ===");
        t3.printInfo();
    }
}