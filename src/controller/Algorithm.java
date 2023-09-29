/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.lang.model.SourceVersion;
import model.IEquation;
import view.Validation;

/**
 *
 * @author MINH TUAN
 */
public class Algorithm implements IEquation {

    @Override
    public List<Float> superlativeEquation(float a, float b) {

        List<Float> resultList = new ArrayList<>();

        float x = (float) -b / a;
        System.out.println("Solution: x = " + x);

        System.out.print("Number is Odd: ");
        if (!Validation.checkOdd(a) && !Validation.checkOdd(b) && !Validation.checkOdd(x)) {
        }

        System.out.print("\nNumber is Even: ");
        if (!Validation.checkEven(a) && !Validation.checkEven(b) && !Validation.checkEven(x)) {
        }

        System.out.print("\nNumber is Perfect Square: ");
        if (!Validation.checkSquareNumber(a) && !Validation.checkSquareNumber(b) && !Validation.checkSquareNumber(x)) {
        }

        System.out.println();

        return resultList;
    }

    @Override
    public List<Float> quadraticEquation(float a, float b, float c) {
        List<Float> resultList = new ArrayList<>();

        float x = (float) b * b - 4 * a * c;

        if (a == 0) {
            superlativeEquation(a, b);
        } else {
            if (x > 0) {
                System.out.println("Solution: x1 = " + (-b + Math.sqrt(x)) / (2 * a) + " and x2 = " + (-b - Math.sqrt(x)) / (2 * a));
            } else if (x == 0) {
                System.out.println("Solution: x1 = x2 = " + -b / (2 * a));
            } else {
                System.out.println("Unsolution equation");
            }
        }
        
        System.out.print("Number is Odd: ");
        if (!Validation.checkOdd(a) && !Validation.checkOdd(b) && !Validation.checkOdd(c) && !Validation.checkOdd(x)) {
        }

        System.out.print("\nNumber is Even: ");
        if (!Validation.checkEven(a) && !Validation.checkEven(b) && !Validation.checkEven(c) && !Validation.checkEven(x)) {
        }

        System.out.print("\nNumber is Perfect Square: ");
        if (!Validation.checkSquareNumber(a) && !Validation.checkSquareNumber(b) && !Validation.checkSquareNumber(c) && !Validation.checkSquareNumber(x)) {
        }
        
        System.out.println();
        
        return resultList;

    }

}
