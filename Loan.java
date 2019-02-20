package com.company;

public class Loan {

    //Laenu andmine
    public static double loan(double temp, Size size){
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
