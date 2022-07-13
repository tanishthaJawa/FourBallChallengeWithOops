import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallChallenge extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static final int YPOSITION = HEIGHT / 5;
    private int xPosition=0;
    private int unitDistance;

    private static final List<FourBallChallenge> ballsList = new ArrayList<>();

    public FourBallChallenge() {
        super();
    }

    public FourBallChallenge(int unitDistance) {
        this.unitDistance = unitDistance;
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (FourBallChallenge ball : ballsList) {
            ellipse(ball.xPosition, ball.unitDistance * YPOSITION, DIAMETER, DIAMETER);
            ball.xPosition += ball.unitDistance;
        }
    }


    public static void main(String[] args) {

        PApplet.main("FourBallChallenge", args);
        for (int unitDistance = 1; unitDistance <= 4; unitDistance++) {
            FourBallChallenge ball = new FourBallChallenge(unitDistance);
            ballsList.add(ball);
        }
    }

}
