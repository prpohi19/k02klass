package tund2;

import java.util.Random;

public class Obstecles {
    int x, y;
    Traps traps;

    public Obstecles(){
        Random r = new Random();
        this.x = r.nextInt(50 - 1) + 1;
        this.y = r.nextInt(50 - 1) + 1;
        traps = Traps.PORTAL;
    }

    public String toString(){
        return traps + " type of trap at x:" + x + " & y:" + y;
    }
}
