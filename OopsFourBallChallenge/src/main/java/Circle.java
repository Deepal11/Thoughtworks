import processing.core.PApplet;

public class Circle extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x_coordinate = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(x_coordinate, HEIGHT / 5, DIAMETER, DIAMETER);
        ellipse(2 * x_coordinate, 2 * HEIGHT / 5, DIAMETER, DIAMETER);
        ellipse(3 * x_coordinate, 3 * HEIGHT / 5, DIAMETER, DIAMETER);
        ellipse(4 * x_coordinate, 4 * HEIGHT / 5, DIAMETER, DIAMETER);
        x_coordinate++;
    }
}
