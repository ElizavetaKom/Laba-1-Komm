package Dog;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Koka", 1, 15, "white");
        Dog d2 = new Dog("Bolla", 3);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        d3.setColor("yellow");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
