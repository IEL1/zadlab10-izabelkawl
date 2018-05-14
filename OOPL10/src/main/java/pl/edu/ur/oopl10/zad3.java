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
public class zad3 extends java.lang.Exception{

    static void zad3() {
        int dzl, dzk, wynik;
        try {
            dzl = 12;
            dzk = 0;
            wynik = dzl / dzk;
        } catch (ArithmeticException e)  {
            System.out.println("Dzielenie przez 0");
        }
    }
}
