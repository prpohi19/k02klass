class Koletis{
  int x, y;
  Tyyp tyyp;
  Suund suund;
  public Koletis(){
    x=0; y=0;
    tyyp=Tyyp.KOLETIS;
    suund=Suund.PAREMALE;
  }
  public void liigu(){
    if(suund==Suund.PAREMALE){x++;}
    if(suund==Suund.VASAKULE){x--;}
    if(suund==Suund.YLES){y++;}
    if(suund==Suund.ALLA){y--;}
  }
  public int kaugus(Koletis t){
    int dx=t.x-x;
    int dy=t.y-y;
    if(dx<0){dx=-dx;}
    if(dy<0){dy=-dy;}
    return dx+dy;
  }
  public void muudaSuund(Suund uusSuund){this.suund=uusSuund;}
  public String toString(){
    return tyyp+" kohal "+x+", "+y+" suunaga "+suund;
  }
}
