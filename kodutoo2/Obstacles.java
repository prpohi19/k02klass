import java.util.Random;

public class Obstacles {
    int x, y;
    Traps traps;

    public Obstacles(){
        Random r = new Random();
        this.x = r.nextInt(15 - 1) + 1;
        this.y = r.nextInt(15 - 1) + 1;
        traps = Traps.PORTAL;
    }

    public String toString(){
        return traps + " type of trap at x:" + x + " & y:" + y;
    }
}
