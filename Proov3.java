import java.util.Scanner;


public class Proov3{
	public static void main(String[] arg){
		Tegelane juku=new Tegelane();
		Tegelane kati=new Tegelane();
		juku.liigu();
		kati.muudaSuund(Suund.YLES);
		kati.liigu();
		System.out.println(juku);
		System.out.println(kati);
		System.out.println(juku.kaugus(kati));

		Scanner lugeja=new Scanner(System.in);
		while(juku.kaugus(kati)>0){


			System.out.println("Palun Juku suund: ");
			String sisend=lugeja.nextLine();
			if(sisend.equals("v")){
				juku.muudaSuund(Suund.VASAKULE);
				juku.liigu();
			System.out.println(juku);
			}
			if(sisend.equals("p")){
				juku.muudaSuund(Suund.PAREMALE);
				juku.liigu();
			System.out.println(juku);
			}
			if(sisend.equals("a")){
				juku.muudaSuund(Suund.ALLA);
				juku.liigu();
			System.out.println(juku);
			}
			if(sisend.equals("y")){
				juku.muudaSuund(Suund.YLES);
				juku.liigu();
			System.out.println(juku);
			}
			if(juku.kaugus(kati)==0){
				System.out.println("Saite kokku!");
				return;
			}
			System.out.println("Palun Kati suund: ");
			sisend=lugeja.nextLine();
			if(sisend.equals("v")){
				kati.muudaSuund(Suund.VASAKULE);
				kati.liigu();
			System.out.println(kati);
			}
			if(sisend.equals("p")){
				kati.muudaSuund(Suund.PAREMALE);
				kati.liigu();
			System.out.println(kati);
			}
			if(sisend.equals("a")){
				kati.muudaSuund(Suund.ALLA);
				kati.liigu();
			System.out.println(kati);
			}
			if(sisend.equals("y")){
				kati.muudaSuund(Suund.YLES);
				kati.liigu();
			System.out.println(kati);
			}

		}
		System.out.println("Saite kokku! Mängu lõpp!");
	}

}

/*
harjutus:
Koostage programm kahe tegelasega, kes algul teineteisest mõne sammu kaugusel.
Programm hakkab kordamööda küsima, et millises suunas kumbki liigub.
Enteri vajutusel liigutakse kummagi tegelase koordinadid.
Kui teineteisega samale ruudule satutakse, lõpeb mäng.
if(sisend.equals("v"))
*/
