package util;

import java.util.Scanner;

public class UsrInput  {
    static Scanner input = new Scanner(System.in);

    static public double getWeight(String type) {
        System.out.printf("Enter your %s: ", type);
        try {
            return input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Enter valid input");
        }
        System.exit(0);
        return -1;
    }
}

