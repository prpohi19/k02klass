package kodutoo02;

public class Main {



    public static void main(String[] args) {
        addNumbers addNumbers = new addNumbers();
        RandomNumber rand1 = new RandomNumber();
        RandomNumber rand2 = new RandomNumber();
        rand1.generateNumber();
        rand2.generateNumber();
        System.out.println(rand1.nr);
        System.out.println(rand2.nr);
        System.out.println();
        System.out.println();
        addNumbers.Calculate(rand1.nr, rand2.nr);
        System.out.println(addNumbers.answer);

    }

}
