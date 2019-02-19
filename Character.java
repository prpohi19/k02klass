import java.util.Random;

class Character {
	Random rand = new Random();
	int x, y;
	Type type = Type.PLAYER;
	Direction direction = Direction.RIGHT;
	public Character(){
		x = rand.nextInt(6) - 3; y = rand.nextInt(6) - 3;
		//type = Type.PLAYER;
		//direction = Direction.RIGHT;
	}
	public void move(){
		if(direction==Direction.RIGHT){x++;}
		if(direction==Direction.LEFT){x--;}
		if(direction==Direction.UP){y++;}
		if(direction==Direction.DOWN){y--;}
	}
	public int distance(Character t){
		int dx=t.x-x;
		int dy=t.y-y;
		if (dx<0){
			dx = -dx;
		}
		if (dy<0){
			dy = -dy;
		}
		return dx+dy;
	}
	public void changeDirection(Direction newDirection){
		direction=newDirection;
	}
	public String Location(){
		return type+" kohal x: "+x+", y: "+y+", vaatab suunaga "+ direction;
	}
}

//koostage ENUM suund v22rtustega paremale, yles, vasakule, alla
//koostage suund-tyypi muutuja algv22rtusega paremale
//kuva suund toString-k2skluses v2lja
