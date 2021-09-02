import processing.core.PApplet;

public class BallProcessing extends PApplet{

    int x_coordinate = 0;
    Circle circle1 = new Circle(96);
    Circle circle2 = new Circle(2 * 96);
    Circle circle3 = new Circle(3 * 96);
    Circle circle4 = new Circle(4 * 96);


    public static void main(String[] args) {
        PApplet.main("BallProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(Circle.WIDTH, Circle.HEIGHT);
    }

    @Override
    public void draw() {
        System.out.println("X: " +x_coordinate + "\nY: "  + circle1.y_coordinate + "\nDiameter: " + Circle.DIAMETER);
        ellipse(x_coordinate, circle1.y_coordinate, Circle.DIAMETER, Circle.DIAMETER);
        ellipse(2 * x_coordinate, circle2.y_coordinate, Circle.DIAMETER, Circle.DIAMETER);
        ellipse(3 * x_coordinate, circle3.y_coordinate, Circle.DIAMETER, Circle.DIAMETER);
        ellipse(4 * x_coordinate, circle4.y_coordinate, Circle.DIAMETER, Circle.DIAMETER);
        x_coordinate++;
    }
}
