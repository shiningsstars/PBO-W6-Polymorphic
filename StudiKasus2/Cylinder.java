public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    // rumus sesuai soal: PI * radius^2 * height
    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
