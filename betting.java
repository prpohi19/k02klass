import java.util.Random;
import java.util.Scanner;


public class betting {
    static Random rn = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int wins = 0;
    static int losses = 0;
    static double balanceMax = 1500;


    public static double bet(double balance, int betRisk, double betReward, double betLoss){
        System.out.println("Kui suure panuse teete: ");
        double betSize = scanner.nextDouble();
        //Kontrollitakse kas on piisavalt raha kontol
        while (betSize > balance){
            System.out.println("Pole piisavalt raha!");
            System.out.println("Kui suure panuse teete: ");
            betSize = scanner.nextDouble();
        }
        System.out.println("Valige oma number: ");
        int yourNr = scanner.nextInt();
        //Kontrollitakse kas number mis siestasite sobib
        while (yourNr > betRisk || yourNr < 1){
            System.out.println("Number ei sobi! Sisesta uus: ");
            yourNr = scanner.nextInt();
        }
        int betNr = rn.nextInt(betRisk)+1;
        //Makstakse raha või võetakse raha
        if(yourNr == betNr){
            balance = balance + betSize*betReward;
            System.out.println("Te võitsite: " + betSize*betReward + " Eurot!");
            System.out.println("");
            wins++;
            if(balance > balanceMax){
                balanceMax = balance;
            }
        }else{
            balance = balance - betSize*betLoss;
            System.out.println("Te kaotasite: " + betSize*betLoss + " Eurot!");
            System.out.println("");
            losses++;
            if(balance > balanceMax){
                balanceMax = balance;
            }
        }
        return balance;
    }

    public static void help(){
        System.out.println("----------------------------------------");
        System.out.println("ABI:");
        System.out.println("Valik 1 - Võit 1/4 panusest, kaotus 1/2 panusest, numbrid 1 - 2");
        System.out.println("Valik 2 - Võit 1/2 panusest, kaotus 1/2 panusest, numbrid 1 - 4");
        System.out.println("Valik 3 - Võit 1/1 panusest, kaotus 1/1 panusest, numbrid 1 - 6");
        System.out.println("Valik 4 - Võit 2/1 panusest, kaotus 1/1 panusest, numbrid 1 - 12");
        System.out.println("Valik 5 - Võit 4/1 panusest, kaotus 1/1 panusest, numbrid 1 - 24");
        System.out.println("Valik 10 - Väike laen");
        System.out.println("Valik 11 - Keskmine laen");
        System.out.println("Valik 12 - Suur laen");
        System.out.println("Valik 13 - Maksa laen tagasi");
        System.out.println("Valik 99 - Välju");
    }

    public static void gameOver(){
        System.out.println("Te võitsite: " + wins + " korda.");
        System.out.println("Te kaotasite: " + losses + " korda.");
        System.out.println("Teie konto suurim raha summa oli: " + balanceMax + " eurot.");
        System.out.println("Casino de Erkki soovib teile head päeva!");
        System.out.println("Ootame teid tagasi!");
    }
}
