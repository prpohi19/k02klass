public class Proov1{
    public static void main(String[] arg){
        Palk Juku = new Palk(750, 500);
        System.out.println(Palk.netopalk(Juku.brutopalk, Juku.tulumaksuvaba));
        System.out.println(Palk.firmaKulud(Juku.brutopalk));
        Palk Anna = new Palk(2200, 0);
        System.out.println(Palk.netopalk(Anna.brutopalk, Anna.tulumaksuvaba));
        System.out.println(Palk.firmaKulud(Anna.brutopalk));
    }
}