import java.util.Scanner;
import java.util.Random;
public class Game1{
  static Suund arvSuunaks(){
    Scanner reader = new Scanner(System.in);
    while(true){
      int arv = reader.nextInt();
      if(arv==1){return Suund.PAREMALE;}
      else if(arv==2){return Suund.ALLA;}
      else if(arv==3){return Suund.YLES;}
      else if(arv==4){return Suund.VASAKULE;}
      else {
        System.out.println("VALEEE");
      }
    }
  }
  public static void main(String[] arg){
    Tegelane juku=new Tegelane("Juku",0,1);
    Tegelane kati=new Tegelane("Kati",2,3);
    System.out.println(juku);
    System.out.println(kati);
    //System.out.println(juku.kaugus(kati));
    //
    int pomm=0;
    int m2ng = 0;
    while(true){
      //int vsuund;
      System.out.println("Juku kord liikuda.");
      System.out.println("Vali suund(1=parem,2=alla,3=yles,4=vasakule): ");
      Suund suund = arvSuunaks();
      juku.muudaSuund(suund);juku.liigu();
      pomm = random(1,3);
      /*if (vsuund==1){juku.muudaSuund(Suund.PAREMALE);juku.liigu();}
      if (vsuund==2){juku.muudaSuund(Suund.ALLA);juku.liigu();}
      if (vsuund==3){juku.muudaSuund(Suund.YLES);juku.liigu();}
      if (vsuund==4){juku.muudaSuund(Suund.VASAKULE);juku.liigu();}*/
      System.out.println("juku rand "+ pomm);
      Bomb bomb = new Bomb();
      int test = bomb.Rv6it(pomm);
      System.out.println("pommi nr "+bomb.gennr);
      if (test == 1) {
        System.out.println("Juku kaotas.");
        break;
      }


      System.out.println("Kati kord liikuda.");
      System.out.println("Vali suund(1=parem,2=alla,3=yles,4=vasakule):");
      suund = arvSuunaks();
      kati.muudaSuund(suund);
      kati.liigu();
      pomm = random(1,3);
      System.out.println("Kati rand "+ pomm);
      System.out.println("pommi nr "+bomb.gennr);
      if (test == 1) {
        System.out.println("Kati kaotas.");
        break;
      }

      /*vsuund=reader.nextInt();
      if (vsuund==1){kati.muudaSuund(Suund.PAREMALE);kati.liigu();}
      if (vsuund==2){kati.muudaSuun1d(Suund.ALLA);kati.liigu();}
      if (vsuund==3){kati.muudaSuund(Suund.YLES);kati.liigu();}
      if (vsuund==4){kati.muudaSuund(Suund.VASAKULE);kati.liigu();}*/
      System.out.println(juku);
      System.out.println(kati);
      if(juku.kaugus(kati)==0){break;}



    }
    //reader.close();
    System.out.println("M2ng sai l2bi!");
  }

  private static int random(int i, int i1) {

    //Random rand = new Random();
    /*if (i >= i1) {
      throw new IllegalArgumentException("max must be greater than min");
    }*/
    Random rand = new Random() ;

    //int random= rand.nextInt((i-i1)+1)+i1;

    return rand.nextInt((i1-i)+1)+i;
  }
}
