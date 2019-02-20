/*Kodutöö raames lisasin teleporteri, mille koordinaatidele sattudes teleporditakse mängija uuele
asukohale ning sellest antakse konsoolis teada.
Kui astutakse teleporteri peale, siis see kaob kaugele koordinaatidele ära,
ehk teoorias kaob mänguväljalt
Teleportereid on 2 ning need on peidetud
*/



import java.util.Scanner;

public class Proov2{

  public static void main(String[] arg){
    Tegelane juku = new Tegelane();
    Tegelane kati = new Tegelane();
    Teleporter tel1 = new Teleporter();
    Teleporter tel2 = new Teleporter();
    juku.x = 1;
    juku.y = 1;
    kati.x = 20;
    kati.y = 20;

    int tel1luger = 0;
    int tel2luger = 0;



    tel1.x1 = (int)(Math.random() * 20 + 1);
	  tel1.y1 = (int)(Math.random() * 20 + 1);

    tel2.x1 = (int)(Math.random() * 20 + 1);
    tel2.y1 = (int)(Math.random() * 20 + 1);

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
      //System.out.println("Teleporter üks asub x "+tel1.x1+" ja y "+tel1.y1+" Tel2: x"+tel2.x1+" y"+tel2.y1);


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

      if(juku.x == tel1.x1 && juku.y == tel1.y1){
        juku.x = (int)(Math.random() * 20 + 1);
        juku.y = (int)(Math.random() * 20 + 1);
        System.out.println("\n\nJuku astus teleporterisse, tema uued koordinaadid on: x"+juku.x+" y"+juku.y+"\n\n");
        tel1luger++;
      }else if(juku.x == tel2.x1 && juku.y == tel2.y1){
        juku.x = (int)(Math.random() * 20 + 1);
        juku.y = (int)(Math.random() * 20 + 1);
        System.out.println("\n\nJuku astus teleporterisse, tema uued koordinaadid on: x"+juku.x+" y"+juku.y+"\n\n");
        tel2luger++;
      }

      if(kati.x == tel1.x1 && kati.y == tel1.y1){
        kati.x = (int)(Math.random() * 20 + 1);
        kati.y = (int)(Math.random() * 20 + 1);
        System.out.println("\n\nKati astus teleporterisse, tema uued koordinaadid on: x"+kati.x+" y"+kati.y+"\n\n");
        tel1luger++;
      }else if(kati.x == tel2.x1 && kati.y == tel2.y1){
        kati.x = (int)(Math.random() * 20 + 1);
        kati.y = (int)(Math.random() * 20 + 1);
        System.out.println("\n\nKati astus teleporterisse, tema uued koordinaadid on: x"+kati.x+" y"+kati.y+"\n\n");
        tel2luger++;
      }

      if(tel1luger>0){
        tel1.x1 = 100;
    	  tel1.y1 = 100;

      }else if(tel2luger>0){
        tel2.x1 = 100;
        tel2.y1 = 100;
      }



      if(juku.x == kati.x && juku.y == kati.y){
        sameXY = true;
        System.out.println(" Palju Õnne, Juku ja Kati on samadel koordinaatidel");
      }





    }
  }




}
