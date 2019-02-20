public class Loan {

    //Laenu andmine
    public static double loan(double balance, Size size){
        if(size == Size.SMALL){
            balance += 1000;
        }
        if(size == Size.MEDIUM){
            balance += 2500;
        }
        if(size == Size.BIG){
            balance += 5000;
        }
        return balance;
    }

    //Laenu suurus
    public static double loanSize(Size size){
        double temp = 0;
        if(size == Size.SMALL){
            temp = 1000;
        }
        if(size == Size.MEDIUM){
            temp = 2500;
        }
        if(size == Size.BIG){
            temp = 5000;
        }
        return temp;
    }
}
