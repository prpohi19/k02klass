public class Player {

    private Vector location;
    private Type type;
    private Direction direction;

    private String name;
    private int score;

    public Player(String name) {
        this.location = new Vector(0, 0);
        this.type = Type.MONSTER;
        this.direction = Direction.RIGHT;
        this.name = name;
    }

    public Player(String name, Vector location) {
        this.location = location;
        this.type = Type.MONSTER;
        this.direction = Direction.RIGHT;
        this.name = name;
    }

    public void move() {
        switch (this.direction) {
            case RIGHT:
                if (location.getX() < Game.MAX_X-1) {
                    location.setX(location.getX()+1);
                }
                break;
            case LEFT:
                if (location.getX() > Game.MIN_X) {
                    location.setX(location.getX()-1);
                }
                break;
            case UP:
                if (location.getY() > Game.MIN_Y) {
                    location.setY(location.getY()-1);
                }
                break;
            case DOWN:
                if (location.getY() < Game.MAX_Y-1) {
                    location.setY(location.getY()+1);
                }
                break;
            case STOP:
                break;
        }
    }

    public int distance(Vector location) {
        int dx = Math.abs(location.getX() - this.getLocation().getX());
        int dy = Math.abs(location.getY() - this.getLocation().getY());
        return dx+dy;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Vector getLocation() {
        return this.location;
    }

    public void setLocation(Vector location) {
        this.location = location;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore() {
        this.score++;
    }

    public String toString() {
        return this.type + " (" + this.name + ") has a score " + this.score + " and is at x:" + this.location.getX() + " y:" + this.location.getY() + " direction:" + this.direction;
    }
}