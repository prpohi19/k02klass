import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Tegelane Ats = new Tegelane();
    public static Tegelane Pets = new Tegelane();
    public static int kaardixy = 10;

    public static void main(String[] args) {

        Ats.nimi = "Ats";
        Ats.x = juhuslikAlgus();
        Ats.y = juhuslikAlgus();

        Pets.nimi = "Pets";
        Pets.x = juhuslikAlgus();
        Pets.y = juhuslikAlgus();

        int kaike = 0;
        while (!kusAsuvad()) {
            kaike++;

            if (kaike % 2 == 0){
                kysiLiikumist(Ats);
            }
            else {
                kysiLiikumist(Pets);
            }
        }
    }

    public static void kysiLiikumist(Tegelane t){
        Scanner input = new Scanner(System.in);
        String sisend;

        System.out.println("Millises suunas liigub " + t.nimi + "?");
        System.out.println("üles/alla/paremale/vasakule");
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

        t.liigu();
    }

    public static boolean kusAsuvad(){

        kuvaKaart();

        if (Ats.x == Pets.x && Ats.y == Pets.y){
            System.out.println("Mängijad jõudsid kokku!");
            return true;
        }
        return false;
    }

    public static void kuvaKaart(){
        char[][] kaart = new char[kaardixy][kaardixy];

        for (char[] row: kaart)
            Arrays.fill(row, '_');

        kaart[Ats.x][Ats.y] = Ats.nimi.charAt(0);
        kaart[Pets.x][Pets.y] = Pets.nimi.charAt(0);

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


}
