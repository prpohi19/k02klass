class Tegelane{
	int x, y;
	String nimi;
	Tyyp tyyp;
	Suund suund;
	public Tegelane(){
		x=0; y=0;
		nimi="nimetu";
		tyyp=Tyyp.MANGJA;
		suund=Suund.PAREMALE;
	}
	public void liigu(){
	if(suund==Suund.PAREMALE){x++;}
	else if(suund==suund.YLES){y++;}
	else if(suund==suund.VASAKULE){x--;}
	else if(suund==suund.ALLA){y--;}
	}
	public int kaugus(Tegelane t){
		int dx=t.x-x;
		int dy=t.y-y;
		if(dx<0){dx=-dx;}
		if(dy<0){dy=-dy;}
		return dx+dy;
	}
	public void muudaSuund(Suund uusSuund){this.suund=uusSuund;}
	public String toString(){
		return tyyp+" "+nimi+" kohal "+x+", "+y+", suunaga "+suund;
	}
}

