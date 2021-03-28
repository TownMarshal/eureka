package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public class Point {
    double x, y, z;

    public Point(double _x, double _y, double _z) {
        x = _x;
        y = _y;
        z = _z;

    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distance(Point p) {
        double result = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
        return result;

    }

    public static void main(String[] args) {
        Point p = new Point(3.2, 4, 6);
        Point p1 = new Point(23, 23, 244);
        System.out.println(p.distance(p1));
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);

    }
}
