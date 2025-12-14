package com.example.tp;

/**
 * Programme de test pour la classe Calculator.
 * Illustre l'utilisation de try–catch–finally pour gérer les exceptions.
 */
public class MainCalc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            // Tentative d'une division valide
            System.out.println("10 / 2 = " + calc.div(10, 2));

            // Tentative d'une division par zéro → déclenche ArithmeticException
            System.out.println("10 / 0 = " + calc.div(10, 0));

        } catch (ArithmeticException ex) {
            // Capturer l'exception et afficher le message d’erreur
            System.err.println("Erreur de calcul : " + ex.getMessage());

        } finally {
            // Ce bloc s'exécute toujours, que l'exception soit levée ou non
            System.out.println("Fin du calcul.");
        }
    }
}