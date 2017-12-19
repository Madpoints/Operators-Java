package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result++;
        System.out.println(previousResult + "++ = " + result);

        boolean isFalse = false;
        if (!isFalse)
            System.out.println("It is not true");
        else
            System.out.println("It is true");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("High Score!");

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than the high score but less than 100");

        if (topScore > 90 || secondScore <= 90)
            System.out.println("One of these is true");

        boolean isCar = true;
        if (isCar = true)
            System.out.println("This should'nt happen");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("is true");
        else
            System.out.println("is false");

        double twenty = 20d;
        double eighty = 80d;
        double value = (twenty + eighty) * 25d;
        double remainder = value % 40d;

        if (remainder <= 20)
            System.out.println("Total was over the limit");

    }
}
