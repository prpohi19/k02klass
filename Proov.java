import java.util.Scanner;
import java.util.Random;

public class Proov{
  public static void main (String[] arg){
    Tegelane hiireke = new Tegelane();
    Takistus kiisu = new Takistus();
    Takistus loks1 = new Takistus();
    Takistus loks2 = new Takistus();
    Takistus loks3 = new Takistus();

     System.out.println("Hiirekese asukoht: ");
     System.out.println(hiireke);
     System.out.println("\n");
     System.out.println("Magava kassi asukoht: ");
     System.out.println(kiisu);
     System.out.println("Lõksude asukohad: ");
     System.out.println(loks1);
     System.out.println(loks2);
     System.out.println(loks3);
     System.out.println("\n");


//Süsteem küsimas:
//    while (kiisu.x != hiireke.x & kiisu.y != hiireke.y ){
boolean gameOn = true;
      while (gameOn){

      Scanner input1 = new Scanner(System.in);
      System.out.println("Sisesta hiirekese suund (P, Y, V, A): ");
      String valik = input1.nextLine();
      if(valik.equals("P")){
        hiireke.muudaSuund(Suund.PAREMALE);
        hiireke.liigu();
        System.out.println("Hiire asukoht: ");
        System.out.println(hiireke);
        System.out.println("\n");
      }
      if(valik.equals("V")){
        hiireke.muudaSuund(Suund.VASAKULE);
        hiireke.liigu();
        System.out.println("Hiire asukoht: ");
        System.out.println(hiireke);
        System.out.println("\n");
      }
      if(valik.equals("Y")){
        hiireke.muudaSuund(Suund.YLES);
        hiireke.liigu();
        System.out.println("Hiire asukoht: ");
        System.out.println(hiireke);
        System.out.println("\n");
      }
      if(valik.equals("A")){
        hiireke.muudaSuund(Suund.ALLA);
        hiireke.liigu();
        System.out.println("Hiire asukoht: ");
        System.out.println(hiireke);
        System.out.println("\n");
      }
      if ( hiireke.x == kiisu.x && hiireke.y == kiisu.y){
        System.out.println("Tundub, et magavale kassile jookseb siiski hiir suhu... Mäng läbi!");
        gameOn = false;
      }
      if ( hiireke.x == loks1.x && hiireke.y == loks1.y || hiireke.x == loks2.x && hiireke.y == loks2.y || hiireke.x == loks3.x && hiireke.y == loks3.y ){
        gameOn = false;
        System.out.println("Sattusid lõksu. Mäng läbi!");
      }
      // Katse: Mänguvälja piirangud erandid: lisada/keelata
      if (hiireke.x == 11 | hiireke.x == -11 | hiireke.y == 11 | hiireke.y == -11){
        System.out.println("Sein tuli ette. Liigu teises suunas!");
      }
    }
    System.out.println("\n");


  }
}
