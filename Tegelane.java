import java.util.concurrent.ThreadLocalRandom;
class Tegelane{
  int x, y;
  Tyyp tyyp;
  Suund suund;
  public Tegelane(){
    x = ThreadLocalRandom.current().nextInt(0, 11);
    y = ThreadLocalRandom.current().nextInt(0, 11);
    tyyp=tyyp.MANGIJA;
    suund=Suund.PAREMALE;
  }
  public void liigu(){
    if(suund==Suund.PAREMALE){x++;}
    if(suund==Suund.VASAKULE){x--;}
    if(suund==Suund.YLES){y++;}
    if(suund==Suund.ALLA){y--;}
  }

public void muudaSuund(Suund uusSuund){suund=uusSuund;}
public String toString(){
  return "kohal X: "+x+", Y: "+y+" suunaga "+suund;
}
}
