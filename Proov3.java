import java.util.Scanner;
public class Proov3{
  public static void main(String[] arg){
    Tegelane juku=new Tegelane();
    Tegelane kati=new Tegelane();
    /*System.out.println("Juku: " + juku);
    System.out.println("Kati: " + kati);*/

System.out.println("Tere tulemast mängu, kahe tegelase koordinaadid on randomiga genereeritud, proovige ära arvata.");
    while (juku.x != kati.x || juku.y != kati.y){
      Scanner lugeja= new Scanner(System.in);
      System.out.println("Palun sisestage Juku suund: ");
      String sisend=lugeja.nextLine();
      if(sisend.equals("PAREMALE")){
        juku.x=juku.x+1;
      }
      if(sisend.equals("VASAKULE")){
        juku.x=juku.x-1;
      }
      if(sisend.equals("YLES")){
        juku.y=juku.y+1;
      }
      if(sisend.equals("ALLA")){
        juku.y=juku.y-1;
      }

     if (juku.x == kati.x && juku.y == kati.y) {break;} //Kohtusid, lõpetab mänzgu

     System.out.print("Palun sisestage Kati suund: "); //küsime Kati käiku
     String sisend2=lugeja.nextLine();
     if(sisend.equals("PAREMALE")){
       kati.x=kati.x+1;
     }
     if(sisend.equals("VASAKULE")){
       kati.x=kati.x-1;
     }
     if(sisend.equals("YLES")){
       kati.y=kati.y+1;
     }
     if(sisend.equals("ALLA")){
       kati.y=kati.y-1;
     }
     if (juku.x == 6 || kati.x == -6 || juku.y == 6 || kati.y == -6 || juku.x == -6 || kati.x == 6 || juku.y == -6 || kati.y == 6){
        System.out.println("Liikusite mänguväljakult välja, liikuge tagasi");
      }
    }
     System.out.println("Juku ja Kati kohtusid asukohas X = " + juku.x + ", Y = " + juku.y);
     System.out.println("Täname mängimast meie mängu.");
  }
}
