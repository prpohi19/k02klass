package tund2;

import java.util.Random;
import java.util.Scanner;
public class Proov1{
	private static boolean running = true;
	public static void main(String[] arg) {
		Character henri=new Character();
		Character eia=new Character();
		henri.move();
		eia.changeDirection(Direction.UP);
		eia.move();
		henri.changeDirection(Direction.UP);
		String command;

		Obstecles portalRoom = new Obstecles();
		System.out.println(portalRoom);

		while(running = true) {
			System.out.println(henri);
			System.out.println(eia);
			System.out.println(henri.distance(eia));
			Scanner reader= new Scanner(System.in);
			System.out.println("henri's direction (L, R, U, D)");
			String input=reader.nextLine();
			if(input.equals("L")) {
				henri.changeDirection(Direction.LEFT);
			}
			if(input.equals("R")) {
				henri.changeDirection(Direction.RIGHT);
			}
			if(input.equals("U")) {
				henri.changeDirection(Direction.UP);
			}
			if(input.equals("D")) {
				henri.changeDirection(Direction.DOWN);
			}
			System.out.println("henri liigub...");
			if(henri.distance(eia) == 0) {
				System.out.println("M6lemad on samal kordinaadil!");
				break;
			}
			if(henri.x == portalRoom.x && henri.y == portalRoom.y) {
				Random r = new Random();
				henri.x = r.nextInt(50 - 1) + 1;
				eia.x = r.nextInt(50 - 1) + 1;
			}
			henri.move();
			henri.distance(eia);
			command = reader.nextLine();
			System.out.println("eia's direction (L, R, U, D)");
			if(command.equals("R")){
				eia.changeDirection(Direction.RIGHT);
			}else if(command.equals("U")){
				eia.changeDirection(Direction.UP);
			}else if(command.equals("L")){
				eia.changeDirection(Direction.LEFT);
			}else if(command.equals("D")){
				eia.changeDirection(Direction.DOWN);
			}
			if(eia.x == portalRoom.x && eia.y == portalRoom.y) {
				Random r = new Random();
				henri.x = r.nextInt(50 - 1) + 1;
				eia.x = r.nextInt(50 - 1) + 1;
			}
			System.out.println("eia liigub...");
			eia.move();
			eia.distance(henri);

			if(eia.distance(henri) == 0){
				System.out.println("M6lemad on samal kordinaadil!");
				break;
			}
		}
	}
}