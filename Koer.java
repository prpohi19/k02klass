public class Koer {
    protected String nimi;
    protected int vanus;

    public Koer(String nimi, int vanus){
        this.nimi=nimi;
        this.vanus=vanus;
    }

    public String nimi() {
        return nimi;
    }

    public int vanus() {
        return vanus;
    }

    public double koeraAastates() {
        if(vanus==1){
            return 15;
        }
        else if(vanus==2){
            return 24;
        }
        else{
            return 24+(vanus-2)*5;
        }
    }

}