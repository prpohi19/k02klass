import java.lang.Math;

public class Palk {
    int bruto, tulumaksuvabastus;

    public static double kulu_tooandjale(int bruto){
        double kulu = bruto+(bruto*0.33)+(bruto*0.008);
        return kulu;
    }

    public static String leiaNetopalk(int bruto, int tulumaksuvabastus) {
        double palk = bruto;
        double maksuvabatulu = 0;
        palk = palk - (palk * 0.02) - (palk * 0.016);
        if (bruto <= 1200) {
            maksuvabatulu = 500;
            if (tulumaksuvabastus < maksuvabatulu){
                maksuvabatulu = tulumaksuvabastus;
            }
            if(bruto >=maksuvabatulu){
                palk = ((palk-maksuvabatulu)*0.8)+maksuvabatulu;
            }
        } else if (bruto <= 2100) {
            maksuvabatulu = (6000 - (6000.0 / 10800 * (bruto * 12 - 14400))) / 12;
            if (tulumaksuvabastus < maksuvabatulu){
                maksuvabatulu = tulumaksuvabastus;
            }
            palk = ((palk - maksuvabatulu) * 0.8) + maksuvabatulu;
        } else {
            palk = (palk * 0.8);
        }
        return "Netopalk: "+Math.round((palk) * 100.0) / 100.0+" eurot";
    }

    public Palk(int _bruto, int _tulumaksuvabastus){
        bruto = _bruto;
        tulumaksuvabastus = _tulumaksuvabastus;
    }
    public static String firma_kulu(int bruto){
       return "Tööandjale kulu kokku: "+Math.round(kulu_tooandjale(bruto) * 100.0) / 100.0+" eurot";
    }

}
