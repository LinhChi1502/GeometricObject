public class Rectangle extends Shape implements Resizeable {
    public double width;
    public double length;
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }
    // "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy"
    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width + " and length= " + this.length
                + " , which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= (100 + percent) / 100;
        this.length *= (100 + percent) / 100;
    }
}
