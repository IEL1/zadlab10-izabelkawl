/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class test extends zad3 {
     public static void test() {
        try {
            zad3();
        } catch (ArithmeticException e) {
            System.out.println("Zlapany " + e);
        }
    }
}
