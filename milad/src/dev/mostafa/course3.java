package dev.mostafa;

import java.util.Scanner;

public class course3 {
    public static void main(String[] args) {
        int result = -999;
        int dayNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number");
        dayNumber = scan.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("montag");
                break;
            case 2:
                System.out.println("dienstag");
                break;
            case 3:
                System.out.println("mitwoch");
                break;
            case 4:
                System.out.println("donerstag");
                break;
            case 5:
                System.out.println("freitag");
                break;
            case 6:
                System.out.println("samestag");
                break;
            case 7:
                System.out.println("sontag");
                break;
            default:
                System.out.println("the number is not tru");
                result = -999;
        }
    }
}