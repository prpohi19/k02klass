package tund2;

import java.util.Scanner;

public class Main {

    public void moveIt(Character c, Direction newDirection){
        c.changeDirection(newDirection);
        c.move();
    }

    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);

        Character raimo = new Character(TypeOfCharacter.PLAYER);
        Character koletis = new Character(TypeOfCharacter.MONSTER);
        Shop teleportShop1 = new Shop("Sepp", TypeOfShop.INSTANTteleport, IsAttackable.NO);
        Shop teleportShop2 = new Shop("Jupp", TypeOfShop.INSTANTteleport, IsAttackable.YES);
        Main m = new Main();

        koletis.setX(2);
        koletis.setY(1);

        System.out.println(raimo + "\n" + koletis + "\n" + teleportShop1 + "\n" + teleportShop2);

        //while ((raimo.getX() != koletis.getX()) || ( raimo.getY() != koletis.getY())){
        while ((raimo.getX() != koletis.getX()) || (raimo.getY() != koletis.getY())){
            System.out.println("* Sisesta " + raimo.typeOfCharacter + " liikumise suund:");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("up")) { m.moveIt(raimo, Direction.UP); }
            if (input.equals("down")) { m.moveIt(raimo, Direction.DOWN); }
            if (input.equals("right")) { m.moveIt(raimo, Direction.RIGHT); }
            if (input.equals("left")) { m.moveIt(raimo, Direction.LEFT); }
            if (input.equals("")) { raimo.move(); }

            if((raimo.getX() == teleportShop1.getX() && raimo.getY() == teleportShop1.getY())){
                raimo.newRandomLocation();
                teleportShop1.newRandomLocation();
                System.out.println(teleportShop1 + "\n" + teleportShop2);
            }
            if((raimo.getX() == teleportShop2.getX() && raimo.getY() == teleportShop2.getY())) {
                raimo.newRandomLocation();
                teleportShop2.newRandomLocation();
                System.out.println(teleportShop1 + "\n" + teleportShop2);
            }

            System.out.println(raimo);
            System.out.println(koletis);

            if ((raimo.getX() == koletis.getX()) && (raimo.getY() == koletis.getY())){
                break;
            }

            System.out.println("* Sisesta " + koletis.typeOfCharacter + " liikumise suund:");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("up")) { koletis.changeDirection(Direction.UP); koletis.move(); }
            if (input.equals("down")) { koletis.changeDirection(Direction.DOWN); koletis.move(); }
            if (input.equals("right")) { koletis.changeDirection(Direction.RIGHT); koletis.move(); }
            if (input.equals("left")) { koletis.changeDirection(Direction.LEFT); koletis.move(); }
            if (input.equals("")) { koletis.move(); }

            System.out.println(raimo);
            System.out.println(koletis);
        }

        System.out.println("Wohoo! Samal ruudul");

        /*raimo.changeDirection(Direction.RIGHT);
        while (raimo.getX() != 5){ raimo.move(); }
        raimo.changeDirection(Direction.UP);
        while (raimo.getY() != 5){ raimo.move(); }

        koletis.changeDirection(Direction.LEFT);
        while (koletis.getX() != -10) { koletis.move(); }
        koletis.changeDirection(Direction.DOWN);
        while (koletis.getY() != -10) { koletis.move(); }

        System.out.println(raimo + "\n" + koletis);

        System.out.println(raimo.distanceFrom(koletis));*/


    }
}
