package project05;

public class demo18 {
    private double x;
    private double y;
    public demo18(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(demo18 anotherPoint) {
        double dxSquare = Math.pow(anotherPoint.x - this.x, 2);
        double dySquare = Math.pow(anotherPoint.y - this.y, 2);
        return Math.sqrt(dxSquare + dySquare);
    }
    public static void main(String[] args) {
        demo18 p1 = new demo18(0, 0);
        demo18 p2 = new demo18(3, 4);
        double dist = p1.distance(p2);
        System.out.println("liang dian ju li两点之间的距离为：" + dist);
    }
}