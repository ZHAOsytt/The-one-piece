package project05;

class Car {
 private String name;
 public Car(String name) {
     this.name = name;
 }
 public void run() {
     System.out.println(name + "car zheng zai xing shi...");
 }
 public String getName() {
     return name;
 }
}
class Driver {
 private String name;
 public Driver(String name) {
     this.name = name;
 }
 public void drive(Car car) {
     System.out.println(name + "driver" + car.getName());
     car.run();
 }
}
public class demo20 {
 public static void main(String[] args) {
     Car car = new Car("E300");
     Driver driver = new Driver("zhang san");
     driver.drive(car);
 }
}