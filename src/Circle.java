public class Circle extends Shape implements Resizeable {
    public double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    //A Circle with radius=xxx, which is a subclass of yyy"
    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= (100 + percent) / 100;
    }
}
