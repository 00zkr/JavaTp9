package com.example.tp;

/**
 * Exception levée lors de la validation d'un utilisateur invalide.
 */
public class InvalidUserException extends Exception {
    /**
     * Construire l’exception avec un message explicite.
     * @param message description de l'erreur de validation
     */
    public InvalidUserException(String message) {
        super(message);
    }
}