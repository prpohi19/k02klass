package tund2;

import java.util.Random;

public class Shop {
    private int x, y;
    private String name;
    private TypeOfShop typeOfShop;
    private IsAttackable isAttackable;
    private TypeOfCharacter typeOfCharacter;

    public Shop(String name, TypeOfShop typeOfShop, IsAttackable ia) {
        Random r = new Random();
        x = r.nextInt((10 - 1) + 1) + 1;
        y = r.nextInt((10 - 1) + 1) + 1;
        typeOfCharacter = TypeOfCharacter.NPC;
        Character c = new Character(typeOfCharacter);

        this.typeOfShop = typeOfShop;
        this.name = name;
        this.isAttackable = ia;
    }

    public String toString() {
        return typeOfCharacter + " (Name: '" + name + "' " + typeOfShop + " type & is attackable? " + isAttackable + ")" + " kohal x:" + x + ", y:" + y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void newRandomLocation(){
        Random r = new Random();
        this.x = r.nextInt(10 - 1) + 1;
        this.y = r.nextInt(10 - 1) + 1;
    }
}
