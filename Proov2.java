public class Proov2{
	public static void main(String[] args){
		Tegelane player = new Tegelane();
		Tegelane monster = new Tegelane();
		player.move();
		player.changeDirection(Direction.DOWN);
		monster.changeDirection(Direction.DOWN);
		monster.move();
		System.out.println(player);
		System.out.println(monster);
		System.out.println(player.distance(monster));
	}
}