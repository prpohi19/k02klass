class Monster {
	int x, y;
	Type type = Type.MONSTER;
	Direction direction = Direction.RIGHT;
	public Monster(){
		x=-3; y=5;
		//type = Type.MONSTER;
		//direction = Direction.RIGHT;
	}
	public void move(){
		if(direction==Direction.RIGHT){x++;}
		if(direction==Direction.LEFT){x--;}
		if(direction==Direction.UP){y++;}
		if(direction==Direction.DOWN){y--;}
	}
	public int distance(Monster t){
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
