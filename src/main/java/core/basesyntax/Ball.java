package core.basesyntax;

public class Ball {
    //It is not desirable to use the default access modifier
    String ballColor;
    int ballNumber;

    public Ball() {
    }

    public Ball(String color, int number) {
        this.ballColor = color;
        this.ballNumber = number;
    }

    //No accessors need to be created for class fields that use the default access modifier
    public String getBallColor() {
        return this.ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public int getBallNumber() {
        return this.ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String toString() {
        //The variable in use
        String ball = "ball";
        return "Ball with number: " + ballNumber + " and color: " + ballColor;
    }
}
