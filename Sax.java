class Saxophone{
  Type type;
  Key key;

  public Saxophone(){
    //type = Type.UNDEFINED;
    //key = Key.UNDEFINED;

    type = Type.UNDEFINED;
    //key = Key.UNDEFINED;
  }
  public void DefineKey(){
    if(type == Type.SOPRANISSIMO){key = Key.B_FLAT;}
    if(type == Type.SOPRANINO){key = Key.E_FLAT;}
    if(type == Type.SOPRANO){key = Key.B_FLAT;}
    if(type == Type.ALTO){key = Key.E_FLAT;}
    if(type == Type.TENOR){key = Key.B_FLAT;}
    if(type == Type.BARITONE){key = Key.E_FLAT;}
    if(type == Type.BASS){key = Key.B_FLAT;}
    if(type == Type.CONTRABASS){key = Key.E_FLAT;}
    if(type == Type.SUBCONTRABASS){key = Key.B_FLAT;}
  }
  public void ChangeInstrument(Type newType){type = newType;}
  public String toString(){
    return type+" key is "+key;
  }
}
