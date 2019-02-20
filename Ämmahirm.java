//Mäng "Ämm võidab alati"
//Jüri ajas laaberdamisega amma vihaseks ja peab jooksma.
//Juhi Jüri turvalisusesse

import java.lang.Math;
import java.util.Scanner;
public class Ämmahirm{
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static void main(String[] arg){
    Scanner lugeja=new Scanner(System.in);
    Tegelane jyri=new Tegelane();
    jyri.x=5;
    Koletis amm=new Koletis();
    String sisend;
    amm.tyyp=Tyyp.KOLETIS;
    jyri.liigu();
    amm.muudaSuund(Suund.YLES);
    amm.liigu();
    System.out.println(jyri);
    System.out.println(amm);
    while(jyri.x!=amm.x || jyri.y!=amm.y){
      System.out.println(ANSI_PURPLE);
      System.out.println("Palun Jüri suunda (wasd): ");
      sisend=lugeja.nextLine();
      if(sisend.equals("a")){
        jyri.muudaSuund(Suund.VASAKULE);
      }
      if(sisend.equals("d")){
        jyri.muudaSuund(Suund.PAREMALE);
      }
      if(sisend.equals("w")){
        jyri.muudaSuund(Suund.YLES);
      }
      if(sisend.equals("s")){
        jyri.muudaSuund(Suund.ALLA);
      }
      jyri.liigu();
      System.out.println(jyri);

      if(Math.abs(amm.x-jyri.x) > Math.abs(amm.y-jyri.y)) {
      	if(amm.x > jyri.x) { amm.x--; }
      	if(amm.x < jyri.x) { amm.x++; }
      } else {
      	if(amm.y > jyri.y) { amm.y--; }
      	if(amm.y < jyri.y) { amm.y++; }
      }
      System.out.println(amm);
    }
  System.out.println("Jüri sai ämmamoorilt Panniga pähe! ");
  System.out.println(jyri);
  System.out.println(amm);
  System.out.println(ANSI_RESET);
  }
}
