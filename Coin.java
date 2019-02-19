/** 
 * Simple coin collectable
 */
public class Coin {

    // The location of the coin
    private Vector location;

    // Symbol is used for displaying the coin
    private char symbol;

    public Coin(char symbol, Vector location) {
        this.symbol = symbol;
        this.location = location;
    }

    public Coin(char symbol) {
        this.symbol = symbol;
        this.location = new Vector(0,0);
    }

    // Check if a player has caught the coin and add score accordingly
    public boolean checkCoin(Player player) {
        if(player.distance(location) == 0) {
            player.addScore();
            System.out.println(player.getName() + " sai myndi k2tte. Skoor: " + player.getScore());
            return true;
        }
        return false;
    }

    /*
     * Getters and setters below
     */

    public Vector getLocation() {
        return location;
    }

    public void setLocation(Vector location) {
        this.location = location;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    
}