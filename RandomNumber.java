package kodutoo02;
import java.util.Random;

public class RandomNumber {

    int nr;

    public void generateNumber() {
        Random rand = new Random();
        nr = rand.nextInt(50);
    }
}
