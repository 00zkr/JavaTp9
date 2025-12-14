package com.example.tp;

/**
 * Représente un utilisateur avec nom et âge, et se valide.
 */
public class User {
    private String nom;
    private int age;

    /**
     * Constructeur principal.
     * @param nom nom de l'utilisateur
     * @param age âge en années
     */
    public User(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    /**
     * Valide les attributs de l'utilisateur.
     * @throws InvalidUserException si le nom est vide ou l'âge < 18
     */
    public void validate() throws InvalidUserException {
        // Vérifier que le nom n'est pas null ou vide
        if (nom == null || nom.trim().isEmpty()) {
            throw new InvalidUserException("Nom d'utilisateur invalide");
        }
        // Vérifier que l'âge est au moins 18 ans
        if (age < 18) {
            throw new InvalidUserException("Utilisateur mineur (âge=" + age + ")");
        }
    }

    @Override
    public String toString() {
        return String.format("User[nom=%s, age=%d]", nom, age);
    }
}