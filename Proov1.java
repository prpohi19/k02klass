import java.util.Scanner;

public class Proov1{
  public static void main(String[] arg){
    Tegelane juku = new Tegelane();
    Tegelane kati = new Tegelane();
    juku.x = 1;
    juku.y = 1;
    kati.x = 2;
    kati.y = 2;
    boolean sameXY = false;
    if(juku.x == kati.x && juku.y == kati.y){
      sameXY = true;
    }
    /*kati.liigu();
    kati.muudaSuund(Suund.YLES);
    kati.liigu();
    juku.liigu();
    juku.muudaSuund(Suund.YLES);
    juku.liigu();
    juku.liigu();
    */
    /*System.out.println(juku+" Juku on siin");
    System.out.println(kati+" Kati on siin");
    System.out.println(juku.kaugus(kati));
    */
    while(sameXY != true){
      System.out.println("Juku ja Kati ei ole samadel koordinaatidel \n");
      System.out.println("Eesmärk oleks läbi käskluste Juku ja Kati kokku viia \n");

      Scanner scan = new Scanner(System.in);
      int liikumissuund;
      //1 on paremale, 2 on alla, 3 on vasakule ning 4 on Ć¼les, 0 on sama suund edasi
      System.out.println("Sisesta täisarvuga kuhu Kati edasi liigub, sisesta 0 kui ei taha väärtust muuta: ");
      System.out.println("1 on paremale, 2 on alla, 3 on vasakule ning 4 on üles");
      System.out.println("Kati"+kati+"\n");
      liikumissuund = scan.nextInt();
      if (liikumissuund == 0){}
      if(liikumissuund == 1){
          kati.muudaSuund(Suund.PAREMALE);
      }
      if(liikumissuund == 2){
          kati.muudaSuund(Suund.ALLA);
      }
      if(liikumissuund == 3){
          kati.muudaSuund(Suund.VASAKULE);
      }
      if(liikumissuund == 4){
          kati.muudaSuund(Suund.YLES);
      }
      kati.liigu();
      System.out.println("Kati"+kati);

      //1 on paremale, 2 on alla, 3 on vasakule ning 4 on Ć¼les
      System.out.println("Sisesta täisarvuga kuhu Juku edasi liigub, sisesta 0 kui ei taha väärtust muuta: ");
      System.out.println("1 on paremale, 2 on alla, 3 on vasakule ning 4 on üles");
      System.out.println("Juku"+ juku+"\n");
      liikumissuund = scan.nextInt();
      if (liikumissuund == 0){}
      if(liikumissuund == 1){
          juku.muudaSuund(Suund.PAREMALE);
      }
      if(liikumissuund == 2){
          juku.muudaSuund(Suund.ALLA);
      }
      if(liikumissuund == 3){
          juku.muudaSuund(Suund.VASAKULE);
      }
      if(liikumissuund == 4){
          juku.muudaSuund(Suund.YLES);
      }
      juku.liigu();
      System.out.println("Juku"+ juku);

      if(juku.x == kati.x && juku.y == kati.y){
        sameXY = true;
        System.out.println(" Palju Õnne, Juku ja Kati on samadel koordinaatidel");
      }





    }
  }




}
