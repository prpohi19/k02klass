class Auto {

    String status;
    int kytusekulu;

    void tootab() {
        status = "Auto pandi tööle";
    }

    void kiirendab() {
         status = "Auto kiirendab";
    }

    void stabiilne() {
         status = "Auto sõidab stabiilselt";
    }

    void autostaatus() {
        System.out.println(status);
    }

    void kytusekulu() {
        System.out.println("Kütusekulu on " + kytusekulu + " liitrit");
    }
}
