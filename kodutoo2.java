class kodutoo2 {
    public static void main(String[] args) {

        Auto auto = new Auto();
        System.out.println("---------");
        auto.tootab();
        auto.autostaatus();
        auto.kytusekulu = 1;
        auto.kytusekulu();
        System.out.println("---------");

        auto.kiirendab();
        auto.autostaatus();
        auto.kytusekulu = 30;
        auto.kytusekulu();
        System.out.println("---------");

        auto.stabiilne();
        auto.autostaatus();
        auto.kytusekulu = 12;
        auto.kytusekulu();

    }
}
