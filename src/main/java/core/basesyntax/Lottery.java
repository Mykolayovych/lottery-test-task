package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {
        // Empty line
        Ball ball = new Ball();
        // Empty line
        ball.setBallColor(ColorSupplier.getRandomColor());
        // Empty line
        ball.setBallNumber(new Random().nextInt(100));

        return ball;
    }
}

// The best solution option
//public class Lottery extends ColorSupplier {
//    public Ball ball;
//
//    public Lottery(Ball ball) {
//        this.ball = ball;
//    }
//
//    public Ball getRandomBall() {
//        this.ball.setBallColor(ColorSupplier.getRandomColor());
//        this.ball.setBallNumber(new Random().nextInt(100));
//
//        return this.ball;
//    }
//}