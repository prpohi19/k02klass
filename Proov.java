import java.util.Scanner;
public class Proov{
  public static void main(String[] arg){
    Tegelane juku=new Tegelane();
    Tegelane kati=new Tegelane();
    System.out.println("Juku: " + juku);
    System.out.println("Kati: " + kati);
    Scanner lugeja=new Scanner(System.in);
    while (juku.x != kati.x || juku.y != kati.y) {
      System.out.print("Sisesta Juku suund: ");
      String sisend=lugeja.nextLine();

      if(sisend.equals("PAREMALE")){
        juku.muudaSuund(Suund.PAREMALE);
        juku.liigu();
      }
      if(sisend.equals("VASAKULE")){
        juku.muudaSuund(Suund.VASAKULE);
        juku.liigu();
      }
      if(sisend.equals("YLES")){
        juku.muudaSuund(Suund.YLES);
        juku.liigu();
      }
      if(sisend.equals("ALLA")){
        juku.muudaSuund(Suund.ALLA);
        juku.liigu();
      }
      System.out.println("Juku: " + juku);
      System.out.println("Kati: " + kati);
      System.out.println();

      if (juku.x == kati.x && juku.y == kati.y) {break;}

      System.out.print("Sisesta Kati suund: ");
      String sisend2=lugeja.nextLine();

      if(sisend2.equals("PAREMALE")){
        kati.muudaSuund(Suund.PAREMALE);
        kati.liigu();
      }
      if(sisend2.equals("VASAKULE")){
        kati.muudaSuund(Suund.VASAKULE);
        kati.liigu();
      }
      if(sisend2.equals("YLES")){
        kati.muudaSuund(Suund.YLES);
        kati.liigu();
      }
      if(sisend2.equals("ALLA")){
        kati.muudaSuund(Suund.ALLA);
        kati.liigu();
      }
      System.out.println("Juku: " + juku);
      System.out.println("Kati: " + kati);
      System.out.println();

    }
    System.out.println("Juku ja Kati kohtusid asukohas X = " + juku.x + ", Y = " + juku.y);
  }
}
