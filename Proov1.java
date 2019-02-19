public class Proov1{
	public static void main(String[] args){
		Tegelane player = new Tegelane();
		player.move();
		player.changeDirection(Direction.DOWN);
		System.out.println(player);
		player.move();
		player.move();
		System.out.println(player);
	}
}