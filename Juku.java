import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Juku{
  public static void main(String[] arg){
    Tegelane koletis=new Tegelane();
    Tegelane Juku=new Tegelane();

	koletis.x= ThreadLocalRandom.current().nextInt(0,10);
	koletis.y= ThreadLocalRandom.current().nextInt(0,10);
	Juku.x= ThreadLocalRandom.current().nextInt(0,10);
	Juku.y= ThreadLocalRandom.current().nextInt(0,10);

	while(koletis.kaugus(Juku)!=0){
		System.out.println("koletise suund? (WASD v6i 0)");
		Scanner koletissuund = new Scanner(System.in);
		String jsuund = koletissuund.nextLine();
		switch (jsuund) {
			case "W":
			case "w":
				koletis.muudaSuund(Suund.YLES);
				koletis.liigu();
				break;
			case "A":
			case "a":
				koletis.muudaSuund(Suund.VASAKULE);
				koletis.liigu();
				break;
			case "S":
			case "s":
				koletis.muudaSuund(Suund.ALLA);
				koletis.liigu();
				break;
			case "D":
			case "d":
				koletis.muudaSuund(Suund.PAREMALE);
				koletis.liigu();
				break;
			case "0":
				System.out.println("Jäid seisma");
		}
		if(koletis.kaugus(Juku)==0){
			break;
		}
		int ksuund=ThreadLocalRandom.current().nextInt(0,7);
		switch (ksuund){
			case 0:
        Juku.muudaSuund(Suund.YLES);
        Juku.liigu();
				break;
			case 1:
        Juku.muudaSuund(Suund.VASAKULE);
        Juku.liigu();
				break;
			case 2:
        Juku.muudaSuund(Suund.ALLA);
        Juku.liigu();
				break;
			case 3:
        Juku.muudaSuund(Suund.PAREMALE);
        Juku.liigu();
				break;
			case 4:
        Juku.muudaSuund(Suund.YLES);
        Juku.liigu();
				break;
		}

		System.out.print("koletis on kohal ");
		System.out.println(koletis);
		System.out.print("Juku on kohal ");
		System.out.println(Juku);
	}
    System.out.println("Koletis sai Juku kätte :(");
  }
}
