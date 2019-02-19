import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final int MIN_X = 0;
    public static final int MIN_Y = 0;
    public static final int MAX_X = 30;
    public static final int MAX_Y = 10;
    public static final int COINS = 5;

    private Scanner scanner;
    private Random random;
    private Coin[] coins;
    private int collected = 0;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    private void start() {
        scanner = new Scanner(System.in);
        random = new Random();
        
        // Spawn the players
        Player player = new Player("A Player", getRandomLocation());
        Player monster = new Player("B Player", getRandomLocation());

        // Spawn the coins
        coins = new Coin[COINS];
        for(int i = 0; i < COINS; i++) {
            coins[i] = new Coin('O', getRandomLocation());
        }

        while(true) {
            // Print scores
            System.out.println("========================================");
            System.out.println(player.getName() + " skoor: " + player.getScore() + " | " + monster.getName() + " skoor: " + monster.getScore());
            System.out.println(" ");

            // Render the playfield
            showLocation(new Player[] {player, monster}, coins, MAX_X, MAX_Y);
            System.out.println(" ");

            // Ask for directions
            System.out.println("Sisesta m2ngija " + player.getName() + " liikumissuund [w,a,s,d,x]");
            player.setDirection(getDirection());
            System.out.println("Sisesta m2ngija " + monster.getName() + " liikumissuund [w,a,s,d,x]");
            monster.setDirection(getDirection());
            System.out.println("---");
            player.move();
            monster.move();

            // Check if any player overlaps any coins
            checkCoins(player);
            checkCoins(monster);

            // Check if all coins are collected
            if (collected == COINS) {
                showLocation(new Player[] {player, monster}, coins, MAX_X, MAX_Y);
                if (player.getScore() > monster.getScore()) {
                    System.out.println("K6ik myndid korjatud. V6itja on " + player.getName());
                } else {
                    System.out.println("K6ik myndid korjatud. V6itja on " + monster.getName());
                }
                break;
            }
        }
    }

    private boolean checkCoins(Player player) {
        for (int i = 0; i < COINS; i++) {
            if (coins[i] != null && coins[i].checkCoin(player)) {
                coins[i] = null;
                collected++;
                return true;
            }
        }
        return false;
    }

    private char getCharInput() {
        return scanner.next().charAt(0);
    }

    private Vector getRandomLocation() {
        return new Vector(random.nextInt(MAX_X), random.nextInt(MAX_Y));
    }

    private Direction getDirection() {
        Direction dir;
        while (true) {
            dir = Direction.fromKey(getCharInput());
            if (dir == null) {
                System.out.println("Vigane suund. V6imalikud suunad: w - yles, a - vasakule, s - alla, d - paremale, x - seisa paigal");
            } else {
                return dir;
            }
        }
    }

    private void showLocation(Player[] players, Coin[] coins, int maxX, int maxY) {
        for(int y = 0; y < maxX; y++) {
            System.out.print("#");
        }
        System.out.println("##");
        for(int y = 0; y < maxY; y++) {
            System.out.print("#");
            for(int x = 0; x < maxX; x++) {
                boolean containsEntity = false;
                for (Player player : players) {
                    if (player.getLocation().getX() == x && player.getLocation().getY() == y) {
                        containsEntity = true;
                        System.out.print(player.getName().charAt(0));
                        break;
                    }
                }
                if (!containsEntity) {
                    for (Coin coin : coins) {
                        if (coin != null) {
                            if (coin.getLocation().getX() == x && coin.getLocation().getY() == y) {
                                containsEntity = true;
                                System.out.print(coin.getSymbol());
                                break;
                            }
                        }
                    }
                }
                if (!containsEntity) {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
        for(int x = 0; x < maxX; x++) {
            System.out.print("#");
        }
        System.out.println("##");
    }
    
}

/*

    This is the initial output:

    ========================================
    A Player skoor: 0 | B Player skoor: 0

    ################################
    #           O                  #
    #                              #
    #          O                   #
    #                           O  #
    #                     A        #
    #    O                         #
    #                      O       #
    #                              #
    #                              #
    #               B              #
    ################################

    Sisesta m2ngija A Player liikumissuund [w,a,s,d,x]
    
*/