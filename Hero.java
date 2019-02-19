class Hero{
	int x; 
	Tyyp tyyp;
	Elu elu;
	public Hero(){
		x=3;
		tyyp=Tyyp.MANGIJA;
		elu=Elu.SAMA;
	}
	public void play(){
		//int n = StdIn.readInt();
		if(elu==Elu.PLUSS){x=x+1;}
		if(elu==Elu.MIINUS){x=x-1;}
		if(elu==Elu.SAMA){x=x+0;}
		
	}
	public int  vahe(Hero t){
		int dx=t.x+x;
		return dx;
	}
	public void arvutaElu(Elu uusElu){elu=uusElu;}
	public String toString(){
		return tyyp+ " elude arv on " +x;
	}
	
}

