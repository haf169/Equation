/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author MINH TUAN
 */
public class Validation {

    public Validation() {
    }

    final static Scanner scanner = new Scanner(System.in);

    // Kiem tra kdl int  
    public static int checkInt(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }
                value = Integer.parseInt(scanner.nextLine());
                if (value < minRange || value > maxRange) {
                    System.out.println("Invalid input! Value must be between " + minRange + " and " + maxRange + ". Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again");
            }
        } while (value < minRange || value > maxRange);

        return value;
    }

    public static float checkFloat(String msg, float minRange, float maxRange) {
        if (minRange > maxRange) {
            float temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        float value = Float.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }
                value = Float.parseFloat(scanner.nextLine());
                if (value < minRange || value > maxRange) {
                    System.out.println("Invalid input! Value must be between " + minRange + " and " + maxRange + ". Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again");
            }
        } while (value < minRange || value > maxRange);

        return value;
    }

    public static boolean checkOdd(float n) {
        if (n % 2 == 1) {
            System.out.print(n + " ");
            return true;
        } else {
            return false;
        }

    }

    public static boolean checkEven(float n) {
        if (n % 2 == 0) {
            System.out.print(n + " ");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkSquareNumber(float n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            System.out.print(n + " ");
            return true;
        } else {
            return false;
        }
    }

}
