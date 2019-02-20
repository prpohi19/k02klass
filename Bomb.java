import java.util.Random;

public class Bomb {
    int number;
    int gennr = random(1,3);

    public int Rv6it(int playernr){

        if (playernr == this.gennr) {
            this.number=1;
        }
        else {
          this.number=0;
        }
        return this.number;
    }

    private static int random(int i, int i1) {

        Random rand = new Random() ;
        return rand.nextInt((i1-i)+1)+i;
    }



}
