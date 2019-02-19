import java.util.Scanner;
import java.util.Random;

public class Proov3{
	public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
	}
	public static void main(String[] args){
					 Boolean meet = false;
					 //string movePlayer;
					 Random rand = new Random();
					 Character character = new Character();
					 Character characterTwo = new Character();
					 Map map = new Map();
					 Monster monster = new Monster();
					 Scanner input = new Scanner(System.in);
					 String moveChar;
					 //map.ReadMap(character, monster);
					 while (meet != true)
					 {
							 clearScreen();
							 System.out.println("---");
							 System.out.println("M2ngija 1: " + character.Location());
							 System.out.println("M2ngija 2: " + characterTwo.Location());
							 System.out.println(monster.Location());
							 //movePlayer = Console.ReadLine();
							 map.ReadMap(character, characterTwo, monster);
							 System.out.println("Esimene m2ngija liigub mis suunas?(up, down, left, right)");
							 moveChar = input.nextLine();
							 if (moveChar.equals("up")){
								 character.changeDirection(Direction.UP);
								 character.move();
							 }
							 if (moveChar.equals("down")){
								 character.changeDirection(Direction.DOWN);
								 character.move();
							 }
							 if (moveChar.equals("left")){
								 character.changeDirection(Direction.LEFT);
								 character.move();
							 }
							 if (moveChar.equals("right")){
								 character.changeDirection(Direction.RIGHT);
								 character.move();
							 }
							 if (character.x == monster.x && character.y == monster.y)
							 {
									 meet = true;
									 clearScreen();
									 System.out.println("---");
									 System.out.println("M2ngija 1: " + character.Location());
									 System.out.println("M2ngija 2: " + characterTwo.Location());
									 System.out.println(monster.Location());
									 map.ReadMap(character, characterTwo, monster);
									 System.out.println(" ");
									 System.out.println("Esimene m2ngija sai koletise k2tte!");
									 System.out.println("---");
									 break;
							 }
							 clearScreen();
							 System.out.println("---");
							 System.out.println("M2ngija 1: " + character.Location());
							 System.out.println("M2ngija 2: " + characterTwo.Location());
							 System.out.println(monster.Location());
							 map.ReadMap(character, characterTwo, monster);
							 System.out.println("Teine m2ngija liigub mis suunas?(up, down, left, right)");
							 moveChar = input.nextLine();
							 if (moveChar.equals("up")){
								 characterTwo.changeDirection(Direction.UP);
								 characterTwo.move();
							 }
							 if (moveChar.equals("down")){
								 characterTwo.changeDirection(Direction.DOWN);
								 characterTwo.move();
							 }
							 if (moveChar.equals("left")){
								 characterTwo.changeDirection(Direction.LEFT);
								 characterTwo.move();
							 }
							 if (moveChar.equals("right")){
								 characterTwo.changeDirection(Direction.RIGHT);
								 characterTwo.move();
							 }
							 int skip = rand.nextInt(20);
							 if (skip % 2 == 0)
							 {
									 int moveMonster = rand.nextInt(3) + 1;
									 if (moveMonster == 1)
									 {
											 monster.changeDirection(Direction.UP);
											 //Console.WriteLine("Koletis liikus yles.");
											 monster.move();
									 }
									 if (moveMonster == 2)
									 {
											 monster.changeDirection(Direction.DOWN);
											 //Console.WriteLine("Koletis liikus alla.");
											 monster.move();
									 }
									 if (moveMonster == 3)
									 {
											 monster.changeDirection(Direction.LEFT);
											 //Console.WriteLine("Koletis liikus vasakule.");
											 monster.move();
									 }
									 if (moveMonster == 4)
									 {
											 monster.changeDirection(Direction.RIGHT);
											 //Console.WriteLine("Koletis liikus paremale.");
											 monster.move();
									 }
							 }
							 if (characterTwo.x == monster.x && characterTwo.y == monster.y)
							 {
									 meet = true;
									 clearScreen();
									 System.out.println("---");
									 System.out.println("M2ngija 1: " + character.Location());
									 System.out.println("M2ngija 2: " + characterTwo.Location());
									 System.out.println(monster.Location());
									 map.ReadMap(character, characterTwo, monster);
									 System.out.println(" ");
									 System.out.println("Teine m2ngija sai koletise k2tte!");
									 System.out.println("---");
							 }
					 }
		//System.out.println("M2ngija ja koletise vahe on "+player.distance(monster));
	}
}
