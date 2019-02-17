import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Proov4 {
    public static Tegelane luna = new Tegelane();
    public static Tegelane noah = new Tegelane();
    public static int kaardixy = 10;

    public static void main(String[] args) {

        luna.nimi = "Luna";
        luna.x = juhuslikAlgus();
        luna.y = juhuslikAlgus();

        noah.nimi = "Noah";
        noah.x = juhuslikAlgus();
        noah.y = juhuslikAlgus();

        int kaike = 0;
        while (!kusAsuvad()) {
            kaike++;

            if (kaike % 2 == 0){
                kysiLiikumist(luna);
            }
            else {
                kysiLiikumist(noah);
            }
        }
    }

    public static void kysiLiikumist(Tegelane t){
        Scanner input = new Scanner(System.in);
        String sisend;

        System.out.println("Millises suunas liigub " + t.nimi + "?");
        System.out.println("üles/alla/paremale/vasakule/suva");
        sisend = input.nextLine();

        if (sisend.equals("üles")){
            t.muudaSuund(Suund.ALLA); // vahetatud paremaks kaardi kuvaks
        }
        else if (sisend.equals("alla")) {
            t.muudaSuund(Suund.YLES); // vahetatud paremaks kaardi kuvaks
        }
        else if (sisend.equals("paremale")) {
            t.muudaSuund(Suund.PAREMALE);
        }
        else if (sisend.equals("vasakule")){
            t.muudaSuund(Suund.VASAKULE);
        }
        else if (sisend.equals("suva")){
            t.muudaSuund(suvalineSuund());
        }

        t.liigu();
    }

    public static boolean kusAsuvad(){
        //System.out.println(luna);
        //System.out.println(noah);
        kuvaKaart();

        if (luna.x == noah.x && luna.y == noah.y){
            System.out.println("Mängijad jõudsid kokku!");
            return true;
        }
        return false;
    }

    public static void kuvaKaart(){
        char[][] kaart = new char[kaardixy][kaardixy];

        for (char[] row: kaart) // https://stackoverflow.com/a/7118214
            Arrays.fill(row, '_'); // täida massiiv

        kaart[luna.x][luna.y] = 'L';
        kaart[noah.x][noah.y] = 'N';

        for(int i = 0; i < kaardixy; i++){
            for (int j = 0; j < kaardixy; j++) {
                System.out.print(kaart[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static int juhuslikAlgus(){
        return ThreadLocalRandom.current().nextInt(0, kaardixy + 1);
    }

    public static Suund suvalineSuund(){
        int juhuslik = ThreadLocalRandom.current().nextInt(0, Suund.values().length);
        return Suund.values()[juhuslik];
    }

}
