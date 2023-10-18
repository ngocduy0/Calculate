/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Validation;
import model.Circle;
import model.Rectangle;
import model.Triangle;


public class Main {
    private static Validation validation = new Validation();
    public static void main(String[] args) {
        Validation vl = new Validation();
         Rectangle rectangle = vl.inputRectangle();
        Circle circle = vl.inputCircle();
        Triangle trigle = vl.inputTriangle();

        vl.display(trigle, rectangle, circle);
    }
    }

