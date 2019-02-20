import java.util.Scanner;
public class Proov3{
  public static void main(String[] arg){
    Tegelane juku=new Tegelane();
    Tegelane kati=new Tegelane();
    kati.tyyp=Tyyp.KOLETIS;
    juku.liigu();
    kati.muudaSuund(Suund.YLES);
    kati.liigu();
    System.out.println(juku);
    System.out.println(kati);
    //System.out.println(juku.kaugus(kati));
    while(juku.x!=kati.x && juku.y!=kati.y && lugeja.hasNextLine()){
      Scanner lugeja=new Scanner(System.in);
      System.out.println("Palun Juku suunda: ");
      Scanner
      String sisend=lugeja.nextLine();
      if(sisend.equals("v")){
        juku.muudaSuund(Suund.VASAKULE);
      }
      if(sisend.equals("p")){
        juku.muudaSuund(Suund.PAREMALE);
      }
      if(sisend.equals("y")){
        juku.muudaSuund(Suund.YLES);
      }
      if(sisend.equals("a")){
        juku.muudaSuund(Suund.ALLA);
      }
      juku.liigu();
      System.out.println(juku);

      System.out.println("Palun Kati suunda: ");
      sisend=lugeja.nextLine();
      if(sisend.equals("v")){
        kati.muudaSuund(Suund.VASAKULE);
      }
      if(sisend.equals("p")){
        kati.muudaSuund(Suund.PAREMALE);
      }
      if(sisend.equals("y")){
        kati.muudaSuund(Suund.YLES);
      }
      if(sisend.equals("a")){
        kati.muudaSuund(Suund.ALLA);
      }
      kati.liigu();
      System.out.println(kati);
      lugeja.close();
    }
    System.out.println("Game over! ");
  }
}

/*
Koostada programm kahe tegelasega, kes algus teineteisest on mõne sammu kaugusel.
Programm hakkab kordamööda küsima millises suunas kumbki liigub. Enterivajutusel liigutakse samas suunas edasi.
Iga sammu järgi kuvatakse kummagi tegelase koordinaadid.
Kui teineteisega samale ruudule satutakse, lõpeb mäng
if(sisend.equals("v")){}
*/
