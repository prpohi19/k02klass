public class Main {

    public static void main(String[] args){
        Koer k1=new Koer("Täpi", 2);
        Koer k2=new Koer("Näpi", 9);

        System.out.println("1. koera vanus inimese aastates: " + k1.koeraAastates());
        System.out.println("2. koera vanus inimese aastates: " + k2.koeraAastates());

    }
}