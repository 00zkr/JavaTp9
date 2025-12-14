package com.example.tp;

/**
 * Fournit les opérations arithmétiques de base.
 * La méthode div lève une ArithmeticException en cas de division par zéro.
 */
public class Calculator {

    /** Additionne deux nombres. */
    public double add(double a, double b) {
        // Aucun cas d'erreur ici ; simplement retourner la somme
        return a + b;
    }

    /** Soustrait b de a. */
    public double sub(double a, double b) {
        return a - b;
    }

    /** Multiplie deux nombres. */
    public double mul(double a, double b) {
        return a * b;
    }

    /**
     * Divise a par b.
     * @throws ArithmeticException si b vaut zéro
     */
    public double div(double a, double b) {
        // Vérification de la condition d'erreur : division par zéro
        if (b == 0) {
            // Lancer une exception pour informer l'appelant du problème
            throw new ArithmeticException("Division par zéro impossible");
        }
        // Si b != 0, effectuer la division
        return a / b;
    }
}