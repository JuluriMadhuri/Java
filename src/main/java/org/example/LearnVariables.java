package org.example;

public class LearnVariables {
    public static void main(String[] args) {
        int myFirstNumber = 10;
        System.out.println(myFirstNumber);
        myFirstNumber = 20;
        System.out.println(myFirstNumber);
        int mySecondNumber = 45;
        int myThirdNumber = 57;
        int sum = myThirdNumber + myFirstNumber + mySecondNumber;
        System.out.println(sum);
        int myLastOne = 1000 - sum;
        System.out.println(myLastOne);
    }
}
