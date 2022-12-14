package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        //Redundant class instantiations
//        Lottery ball1 = new Lottery();
//        System.out.println(ball1.getRandomBall().toString());
//        Lottery ball2 = new Lottery();
//        System.out.println(ball2.getRandomBall().toString());
//        Lottery ball3 = new Lottery();
//        System.out.println(ball3.getRandomBall().toString());
        //The right decision
        for (int i = 0; i <3 ; i++) {
            System.out.println(new Lottery().getRandomBall().toString());
        }
    }
}
