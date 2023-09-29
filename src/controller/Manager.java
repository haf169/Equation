/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import view.Validation;

/**
 *
 * @author MINH TUAN
 */
public class Manager extends Menu<String> {

    static String[] menu = {"Calculate Superlative Equation", "Calculate Quadratic Equation"};
    Algorithm algorithm = new Algorithm();

    public Manager() {
        super("======== EQUATION PROGRAMMING ========", menu);
    }

    @Override
    public void execute(int choice) throws Exception {
        switch (choice) {
            case 1:
                float a = Validation.checkFloat("Enter A: ", 0.0f, Float.MAX_VALUE);
                float b = Validation.checkFloat("Enter B: ", 0.0f, Float.MAX_VALUE);
                algorithm.superlativeEquation(a, b);
                break;
            case 2:
                float m = Validation.checkFloat("Enter A: ", 0.0f, Float.MAX_VALUE);
                float n = Validation.checkFloat("Enter B: ", 0.0f, Float.MAX_VALUE);
                float q = Validation.checkFloat("Enter C: ", 0.0f, Float.MAX_VALUE);
                algorithm.quadraticEquation(m, n, q);
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                this.stop();
        }
    }

}
