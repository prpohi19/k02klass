package com.company;

import java.util.Scanner;


public class Main {

    public static boolean play = true;

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double balance = 1500;
        int activeLoan = 0;
        double loanSize = 0;

        System.out.println("Casino de Erkki tervitab teid!");
        System.out.println("Loodame et õnn on teiega!");
        while(play = true){
            System.out.println("----------------------------------------");
            System.out.println("Teie kontol on " +  String.format("%.2f", balance) + " eurot.");
            System.out.println("Laenu suurus: " + String.format("%.2f", loanSize) + " eurot.");
            System.out.println("Millistele panustele soovite mängida ");
            System.out.println("Valikud: 0 - Abi; 1 kuni 5 - Mängimise valikud; 10 kuni 12 - Laenud; 13 - Laenu tagasi maksmine; 99 - Lahku");
            System.out.println("Sisestage oma valik: ");
            int betChoice = scanner.nextInt();

            while(betChoice == 0){
                betting.help();
                break;
            }

            while(betChoice == 1){
                balance = betting.bet(balance, 2, 0.25, 0.5);
                break;
            }

            while(betChoice == 2){
                balance = betting.bet(balance, 4, 0.5, 0.5);
                break;
            }

            while(betChoice == 3){
                balance = betting.bet(balance, 6,1,1);
                break;
            }

            while(betChoice == 4){
                balance = betting.bet(balance, 12, 2, 1);
                break;
            }

            while(betChoice == 5){
                balance = betting.bet(balance, 24,6,1);
                break;
            }

            while(betChoice == 10){
                if(activeLoan != 1) {
                    balance = Loan.loan(balance, Size.SMALL);
                    activeLoan = 1;
                    loanSize = Loan.loanSize(Size.SMALL);
                }else{
                    System.out.println("Teil on juba laen võetud!");
                }
                break;
            }

            while(betChoice == 11){
                if(activeLoan != 1) {
                    balance = Loan.loan(balance, Size.MEDIUM);
                    activeLoan = 1;
                    loanSize = Loan.loanSize(Size.MEDIUM);
                }else{
                    System.out.println("Teil on juba laen võetud!");
                }
                break;
            }

            while(betChoice == 12){
                if(activeLoan != 1) {
                    balance = Loan.loan(balance, Size.BIG);
                    activeLoan = 1;
                    loanSize = Loan.loanSize(Size.BIG);
                }else{
                    System.out.println("Teil on juba laen võetud!");
                }
                break;
            }

            while(betChoice == 13){
                double loanInterest = loanSize*0.25;
                if(activeLoan == 1) {
                    if(balance > (loanSize + loanInterest)){
                        balance -= (loanSize + loanInterest);
                        System.out.println("Laen tagasi makstud!");
                        activeLoan = 0;
                        loanSize = 0;
                    }else{
                        System.out.println("Teil pole piisavalt raha et tagasi maksta!");
                    }
                }else{
                    System.out.println("Teil pole laenu!");
                }
                break;
            }

            if(balance <= 0){
                System.out.println("----------------------------------------");
                System.out.println("Teil sai raha otsa!");
                betting.gameOver();
                break;
            }

            if(betChoice == 99){
                System.out.println("----------------------------------------");
                System.out.println("Te kõnnite minema " + String.format("%.2f", balance) + " euroga!");
                betting.gameOver();
                break;
            }
        }
    }
}
