import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(2.5,5.0);
        shapes[2] = new Square(3.0);

        Circle circle = (Circle) shapes[0];
        Rectangle rectangle = (Rectangle) shapes[1];
        Rectangle square = (Square) shapes[2];

        System.out.println("Trước khi thay đổi: ");
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());

        for (Shape shape: shapes) {
            if (shape instanceof Circle) {
                Resizeable resizeable = (Circle) shapes[0];
                resizeable.resize(Math.random()*100 - 1);
            } else if (shape instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shapes[1];
                resizeable.resize(Math.random()*100 - 1);
            } else {
                Resizeable resizeable = (Square) shapes[2];
                resizeable.resize(Math.random()*100 - 1);
            }
        }

        System.out.println("Sau khi thay đổi: ");
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getPerimeter());
        System.out.println(square.getPerimeter());
    }
}
