import java.util.Scanner;
public class Proov4{
	public static void main(String[] arg){
		Hero juku=new Hero();
		Hero kati=new Hero();
		juku.play();
		kati.arvutaElu(Elu.MIINUS);
		kati.play();
		System.out.println(juku);
		System.out.println(kati);
		System.out.println(juku.vahe(kati));
		
		Scanner lugeja=new Scanner(System.in);
		while(juku.vahe(kati)>0){
		

			System.out.println("Sisesta kas Juku kaotas, teenis elu juurde või on sama seis: ");
			String sisend=lugeja.nextLine();
			if(sisend.equals("-")){
				juku.arvutaElu(Elu.MIINUS);
			    juku.play();
			System.out.println(juku);
			}
			if(sisend.equals("+")){
				juku.arvutaElu(Elu.PLUSS);
			    juku.play();
			System.out.println(juku);
			}
			if(sisend.equals("0")){
				juku.arvutaElu(Elu.SAMA);
			    juku.play();
			System.out.println(juku);
			}
			
			
			if(juku.vahe(kati)==0){
				System.out.println("0:0 Mängu lõpp!");
				return;
			}
		
			System.out.println("Sisesta kas Kati kaotas, teenis elu juurde või on sama seis: ");
			sisend=lugeja.nextLine();
			if(sisend.equals("-")){
				kati.arvutaElu(Elu.MIINUS);
			    kati.play();
			System.out.println(kati);
			}
			if(sisend.equals("+")){
				kati.arvutaElu(Elu.PLUSS);
			    kati.play();
			System.out.println(kati);
			}
			if(sisend.equals("0")){
				kati.arvutaElu(Elu.SAMA);
			    kati.play();
			System.out.println(kati);
			}
			
		}
		System.out.println("Mängu lõpp!");
	}
	
}

/*

*/