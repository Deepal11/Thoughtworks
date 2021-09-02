import processing.core.PApplet;

public class BallProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0;

    public static void main(String[] args) {
        PApplet.main("BallProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(x, HEIGHT / 5, DIAMETER, DIAMETER);
        ellipse(2 * x, 2 * (HEIGHT / 5), DIAMETER, DIAMETER);
        ellipse(3 * x, 3 * (HEIGHT / 5), DIAMETER, DIAMETER);
        ellipse(4 * x, 4 * (HEIGHT / 5), DIAMETER, DIAMETER);
        x++;
    }
}
