import java.util.Scanner;
public class Proov4{
	public static Tegelane luna=new Tegelane();
    public static Tegelane noah=new Tegelane();
    public static int kaugus=0;
	public static void main(String[] arg){
		luna.nimi = "Luna";
		luna.x=0;
		luna.y=0;
		noah.nimi = "Noah";
		noah.x=3;
		noah.y=3;
        int kaike=0;
		
		while (!kusAsuvad()) {
			kaike++;
			
			if(kaike % 2 == 0) {
                kysiliikumist(luna);
				
			}
			else{
                kysiliikumist(noah);
			}
		}
	}
	public static void kysiliikumist(Tegelane t){
		Scanner input = new Scanner(System.in);
		String sisend;
		
		System.out.println("Millises suunas liigub "+t.nimi+"?");
		System.out.println("üles/alla/paremale/vasakule");
        sisend = input.nextLine();
        kaugus = ((luna.x - noah.x) + (luna.y - noah.y)) + 1;
		
		if (sisend.equals("üles")) {
			t.muudaSuund(Suund.YLES);
			t.liigu();
		}
		else if(sisend.equals("alla")) {
			t.muudaSuund(Suund.ALLA);
			t.liigu();
		}
		else if(sisend.equals("paremale")) {
			t.muudaSuund(Suund.PAREMALE);
			t.liigu();
		}
		else if(sisend.equals("vasakule")) {
			t.muudaSuund(Suund.VASAKULE);
			t.liigu();
		}
		else {
			t.liigu();
		}
	}
	public static boolean kusAsuvad(){
		System.out.println(luna);
        System.out.println(noah);
        System.out.println("Mängijad on üksteisest " + Math.abs(kaugus) + " käigu kaugusel");  
		if(luna.x == noah.x && luna.y == noah.y) {
            System.out.println("Mängijad leidsid üksteist üles!!");
            return true;
		}
		return false;
	}
}


/* TULEMUS
MANGJA Luna kohal 0, 0, suunaga YLES
MANGJA Noah kohal 3, 0, suunaga ALLA
Mängijad on üksteisest 3 käigu kaugusel
Millises suunas liigub Luna?
üles/alla/paremale/vasakule

...

MANGJA Luna kohal 2, 0, suunaga PAREMALE
MANGJA Noah kohal 2, 0, suunaga VASAKULE
Mängijad on üksteisest 0 käigu kaugusel
Mängijad leidsid üksteist üles!!

*/
