package Ball;
import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(24.5, "blue", "volleyball", 2000);
        Ball b2 = new Ball(23.5, "pink", "volleyball", 1000);
        Ball b3 = new Ball(25.5, "yellow", "volleyball", 3000);

        b3.setColor("pink");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
