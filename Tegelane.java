class Tegelane{
  int x, y;
  Tyyp tyyp;
  Suund suund;
  public Tegelane(){
    x = 0; y = 0;
    tyyp = Tyyp.MANGIJA;
    suund = Suund.PAREMALE;
  }
  public void liigu(){
    if(suund==Suund.PAREMALE){x++;} //Lisage ka muud suunad
    if(suund==Suund.VASAKULE){x--;}
    if(suund==Suund.YLES){y++;}
    if(suund==Suund.ALLA){y--;}

  }
  //Tegelaste kauguse kuvamine:
  public int kaugus(Tegelane t){ //(Tegelane (nt Kati) t ->> Kati=t) määratakse ajutine muutuja t
    int dx = t.x - x;
    int dy = t.y - y;
    if(dx < 0){dx = -dx;}
    if(dy < 0){dx = -dy;}
    return dx + dy;
  }
  public void muudaSuund(Suund uusSuund){suund=uusSuund;}
  //mitu samanimelist muutujat this -> pöördub classi muutuja poole. hetkel võib ka ära võtta this.suund=uusSuund
  public String toString(){
    return tyyp + " kohal " + x + ", " + y;
  }
//õigem viis default x ja y väärtuste muutmine erandkorras
  public void setX(int newX){
    x = newX;
  }
}
