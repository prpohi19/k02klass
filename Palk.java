import java.lang.Math;

public class Palk{
    int brutopalk, tulumaksuvaba;
    public static double tooandjaKulu(int brutopalk){
        double kulu = brutopalk+(brutopalk*0.33)+(brutopalk*0.008);
        return kulu;
    }
    public static String netopalk(int brutopalk, int tulumaksuvaba){
        double palk = brutopalk;
        double tempmaksuvaba = 0;
        palk = palk - (palk*0.02) - (palk*0.016);
        
        if(brutopalk <= 1200){
            tempmaksuvaba = 500;
            if(tulumaksuvaba < tempmaksuvaba){
                tempmaksuvaba = tulumaksuvaba;
            }
            if(brutopalk >= tempmaksuvaba){
                palk = ((palk - tempmaksuvaba)*0.8)+tempmaksuvaba;
            }
        } else if (brutopalk <= 2100){
            tempmaksuvaba = (6000-(6000/10800*(brutopalk*12-14400)))/12;
            if(tulumaksuvaba < tempmaksuvaba){
                tempmaksuvaba = tulumaksuvaba;
            }
            palk = ((palk-tempmaksuvaba)*0.8)+tempmaksuvaba;
        } else {
            palk = (palk*0.8);
        }
        return "Netopalk on "+Math.round((palk)*100.0)/100.0+" eurot.";
    }
    public Palk(int brutopalk2, int tulumaksuvaba2){
        brutopalk = brutopalk2;
        tulumaksuvaba = tulumaksuvaba2;
    }
    public static String firmaKulud(int brutopalk){
        return "Firmale kulu kokku on "+Math.round(tooandjaKulu(brutopalk)*100.0)/100.0+" eurot.";
    }
}