class Tegelane {
    int x, y;
    String nimi;
    Tyyp tyyp;
    Suund suund;
    public Tegelane(){ // Vaikeväärtused
        x=0; y=0;
        nimi="nimetu";
        tyyp=Tyyp.MANGIJA;
        suund=Suund.PAREMALE;
    }

    public void liigu(){ // Saab ka switch, aga poleks lühem
        if (suund==Suund.PAREMALE) x++;
        else if (suund==Suund.VASAKULE) x--;
        else if (suund==Suund.YLES) y++;
        else if (suund==Suund.ALLA) y--;
    }

    public int kaugus(Tegelane t){
        int dx = t.x - x; // t x-koordinaat - oma t-koordinaat
        int dy = t.y - y;

        // Kui negatiivne, korruta miinusega et teha positiivseks
        if (dx < 0) dx =- dx;
        if (dy < 0) dy =- dy;

        return dx + dy;
    }

    public void muudaSuund(Suund uusSuund){
        suund = uusSuund;
    }

    public String toString() {
        return tyyp + " " + nimi + " kohal " + x + ", " + y + " suunaga " + suund;
    }
}