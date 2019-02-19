import java.util.Random;

class Takistus{
  int x, y;
  Tyyp tyyp;

  public Takistus(){
    Random r = new Random();
    x = r.nextInt(10);
    y = r.nextInt(10);
    tyyp = Tyyp.TAKISTUS;
  }

  public String toString(){
    return tyyp + " kohal " + x + ", " + y;
  }
}
