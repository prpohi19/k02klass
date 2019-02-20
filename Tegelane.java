import java.util.concurrent.ThreadLocalRandom;
class Tegelane{
  int x, y;
  Tyyp tyyp;
  Suund suund;
  public Tegelane(){
    x = ThreadLocalRandom.current().nextInt(-4, 4);
    y = ThreadLocalRandom.current().nextInt(-4, 4);
    tyyp=Tyyp.MANGIJA;
    suund=Suund.PAREMALE;
  }
  public void liigu(){
    if (suund==Suund.PAREMALE){x++;}
    if (suund==Suund.YLES){y++;}
    if (suund==Suund.VASAKULE){x--;}
    if (suund==Suund.ALLA){y--;}
  }
  /*public int kaugus(Tegelane t){
    int dx=t.x-x; //t on objekt(hetkel on kati t asemel)
    int dy=t.y-y;
    if(dx<0){dx=-dx;}
    if(dy<0){dy=-dy;}
    return dx+dy;
  }*/
  public void muudaSuund(Suund uusSuund){suund=uusSuund;}
  public String toString(){
    return tyyp+" kohal "+x+", "+y+" suunaga "+suund;
  }
}
