public class Proov1 {
    public static void main(String[] arg) {
        Palk kati = new Palk(654, 500);
        System.out.println(Palk.leiaNetopalk(kati.bruto, kati.tulumaksuvabastus));
        System.out.println(Palk.firma_kulu(kati.bruto));
        Palk mati = new Palk(1500, 0);
        System.out.println(Palk.leiaNetopalk(mati.bruto, mati.tulumaksuvabastus));
        System.out.println(Palk.firma_kulu(mati.bruto));
    }
}
