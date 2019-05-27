//test
class kodutoo2 {
    public static void main(String[] args) {

        Lamp laelamp = new Lamp();

        laelamp.toole();
        laelamp.tugevus = 50;

        laelamp.lambistatus();
        laelamp.tugevus();

        System.out.println("Muudame inpute");

        laelamp.tugevus = 25;
        laelamp.kinni();

        laelamp.lambistatus();
        laelamp.tugevus();

    }
}