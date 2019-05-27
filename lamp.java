//test
class Lamp {

    String status;
    int tugevus;

    void toole() {
        status = "põleb";
    }

    void kinni() {
         status = "ei põle";
    }

    void lambistatus() {

        System.out.println("Lamp " + status);
    }

    void tugevus() {
        System.out.println("lambi tugevus on " + tugevus);
    }
}
