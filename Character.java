package tund2;

class Character{
	int x, y;
	Type type;
	Direction direction;
	Traps trap;
	public Character() {
		int random = (int)(Math.random()*50 + 1);
		x=random; y=random;
		type=Type.PLAYER;
		direction=Direction.RIGHT;
		trap=Traps.PORTAL;
	}
	public void move() {
		if(direction==Direction.RIGHT) {x++;}
		if(direction==Direction.LEFT) {x--;}
		if(direction==Direction.UP) {y++;}
		if(direction==Direction.DOWN) {x--;}
	}
	public int distance(Character c) {
		int dx=c.x-x;
		int dy=c.y-y;
		if(dx<0) {dx=-dx;}
		if(dy<0) {dy=-dy;}
		return dx+dy;
	}
	public void changeDirection(Direction newDirection) {direction=newDirection;}
	public String toString() {
		return type+" kohal "+x+", "+y+" suunaga "+direction;
	}
}

