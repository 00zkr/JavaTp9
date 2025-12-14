package com.example.tp;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Programme de test : crée plusieurs User et tente leur validation.
 * Les erreurs de validation sont écrites dans error.log.
 */
public class MainUser {
    public static void main(String[] args) {
        User[] users = {
            new User("Alice", 30),   // valide
            new User("", 25),        // nom vide → invalide
            new User("Bob", 16)      // âge < 18 → invalide
        };

        for (User u : users) {
            try {
                u.validate();  // peut lancer InvalidUserException
                System.out.println("Utilisateur validé : " + u);
            } catch (InvalidUserException e) {
                // Écrire le message d'erreur dans error.log
                try (FileWriter fw = new FileWriter("error.log", true)) {
                    fw.write("Validation échouée : " + e.getMessage() + System.lineSeparator());
                } catch (IOException ioEx) {
                    System.err.println("Impossible d'écrire dans error.log : " + ioEx.getMessage());
                }
            }
        }
    }
}