public enum Direction {
    RIGHT('d'),
    LEFT('a'),
    UP('w'),
    DOWN('s'),
    STOP('x');

    private char key;

    Direction(char key) {
        this.key = key;
    }

    public static Direction fromKey(char key) {
        for (Direction dir : Direction.values()) {
            if (dir.key == key) {
                return dir;
            }
        }
        return null;
    }
}