import java.util.Random;
import java.util.Scanner;
public class TryThis{
	private static boolean running = true;
	public static void main(String[] arg) {
		Character juku=new Character();
		Character kati=new Character();
		juku.move();
		kati.changeDirection(Direction.UP);
		kati.move();
		juku.changeDirection(Direction.UP);
		String command;

		Obstacles room = new Obstacles();
		System.out.println(room);

		while(running = true) {
			System.out.println(juku);
			System.out.println(kati);
			System.out.println(juku.distance(kati));
			Scanner reader= new Scanner(System.in);
			System.out.println("juku's direction ([l]eft, [r]ight, [u]p, [d]own)");
			String input=reader.nextLine();
			if(input.equals("l")) {
				juku.changeDirection(Direction.LEFT);
			}
			if(input.equals("r")) {
				juku.changeDirection(Direction.RIGHT);
			}
			if(input.equals("u")) {
				juku.changeDirection(Direction.UP);
			}
			if(input.equals("d")) {
				juku.changeDirection(Direction.DOWN);
			}
			System.out.println("juku liigub...");
			if(juku.distance(kati) == 0) {
				System.out.println("M6lemad on samal kohal!");
				break;
			}
			if(juku.x == room.x && juku.y == room.y) {
				Random r = new Random();
				juku.x = r.nextInt(15 - 1) + 1;
				kati.x = r.nextInt(15 - 1) + 1;
			}
			juku.move();
			juku.distance(kati);
			command = reader.nextLine();
			System.out.println("kati's direction ([l]eft, [r]ight, [u]p, [d]own)");
			if(command.equals("r")){
				kati.changeDirection(Direction.RIGHT);
			}else if(command.equals("l")){
				kati.changeDirection(Direction.LEFT);
			}else if(command.equals("u")){
				kati.changeDirection(Direction.UP);
			}else if(command.equals("d")){
				kati.changeDirection(Direction.DOWN);
			}
			if(kati.x == room.x && kati.y == room.y) {
				Random r = new Random();
				juku.x = r.nextInt(15 - 1) + 1;
				kati.x = r.nextInt(15 - 1) + 1;
			}
			System.out.println("kati liigub...");
			kati.move();
			kati.distance(juku);

			if(kati.distance(juku) == 0){
				System.out.println("M6lemad on samal kohal!");
				break;
			}
		}
	}
}
