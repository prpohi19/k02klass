import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Proov2{
  public static void main(String[] arg){
    Tegelane juku=new Tegelane();
    Tegelane miisu=new Tegelane();

	juku.x= ThreadLocalRandom.current().nextInt(0,10);
	juku.y= ThreadLocalRandom.current().nextInt(0,10);
	miisu.x= ThreadLocalRandom.current().nextInt(0,10);
	miisu.y= ThreadLocalRandom.current().nextInt(0,10);
    
	/*juku.liigu();
    kati.muudaSuund(Suund.PAREMALE);
    kati.liigu();
	kati.liigu();
	kati.liigu();
	kati.liigu();
    juku.muudaSuund(Suund.PAREMALE);*/
    
	while(juku.kaugus(miisu)!=0){
		System.out.println("Juku suund? (WASD v6i 0)");
		Scanner jukusuund = new Scanner(System.in);	
		String jsuund = jukusuund.nextLine();
		switch (jsuund) {
			case "W":
			case "w":
				juku.muudaSuund(Suund.YLES);
				juku.liigu();
				break;
			case "A":
			case "a":
				juku.muudaSuund(Suund.VASAKULE);
				juku.liigu();
				break;
			case "S":
			case "s":
				juku.muudaSuund(Suund.ALLA);
				juku.liigu();
				break;
			case "D":
			case "d":
				juku.muudaSuund(Suund.PAREMALE);
				juku.liigu();
				break;
			case "0":
				System.out.println("juku seisis paigal");		
		}
		if(juku.kaugus(miisu)==0){
			break;			
		}
		int msuund=ThreadLocalRandom.current().nextInt(0,7);
		switch (msuund){
			case 0:
				miisu.muudaSuund(Suund.YLES);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.VASAKULE);
				miisu.liigu();
				break;
			case 1:
				miisu.muudaSuund(Suund.YLES);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.PAREMALE);
				miisu.liigu();
				break;
			case 2:
				miisu.muudaSuund(Suund.VASAKULE);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.ALLA);
				miisu.liigu();
				break;
			case 3:
				miisu.muudaSuund(Suund.VASAKULE);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.YLES);
				miisu.liigu();
				break;
			case 4:
				miisu.muudaSuund(Suund.ALLA);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.VASAKULE);
				miisu.liigu();
				break;
			case 5:
				miisu.muudaSuund(Suund.ALLA);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.PAREMALE);
				miisu.liigu();
				break;
			case 6:
				miisu.muudaSuund(Suund.PAREMALE);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.YLES);
				miisu.liigu();
				break;
			case 7:
				miisu.muudaSuund(Suund.PAREMALE);
				miisu.liigu();
				miisu.liigu();
				miisu.liigu();
				miisu.muudaSuund(Suund.ALLA);
				miisu.liigu();
				break;
		}

		
		System.out.print("juku on kohal ");
		System.out.println(juku);
		System.out.print("miisu on kohal ");		
		System.out.println(miisu);
	}

	//System.out.println(juku);
    //juku.liigu();
    //juku.liigu();
    System.out.println("juku sai miisu k2tte, n2madi-n2mm!");
    

    //System.out.println(juku.kaugus(kati));


  }
}
