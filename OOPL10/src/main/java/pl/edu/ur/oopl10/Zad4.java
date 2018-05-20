/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.Random;

/**
 *
 * @author Izabela
 */
public class Zad4 {

    static void zad4() {
        double wynik;
        double a, b;
        Random rand = new Random();

        try {
            System.out.println("Losowanie 2 liczb z zakresu (-10;10)");
            a = rand.nextInt(20) - 10;
            System.out.println("Pierwsza liczba: " + a);
            b = rand.nextInt(20) - 10;
            System.out.println("Druga liczba: " + b);
            wynik = a / b;
            System.out.println("Dzielenie pierwszej przez drugą: " + wynik);
        } catch (Exception e) {
            System.out.println("Nie można dzielić przez 0");
        }
    }
}
