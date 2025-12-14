package com.example.tp;

import java.io.*;
import java.util.*;

/**
 * Classe utilitaire pour lire un fichier de nombres entiers.
 */
public class FileUtil {

    /**
     * Lit toutes les lignes du fichier spécifié, convertit chacune
     * en Integer, et renvoie la liste des valeurs valides.
     *
     * @param path chemin vers le fichier (par ex. "numbers.txt")
     * @return liste des entiers lus (vide en cas d’erreur)
     */
    public static List<Integer> readNumbers(String path) {
        List<Integer> list = new ArrayList<>();

        // try-with-resources : le BufferedReader sera fermé automatiquement
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            // Parcours ligne par ligne jusqu’à la fin du fichier
            while ((line = reader.readLine()) != null) {
                line = line.trim();            // suppression des espaces en début/fin
                if (line.isEmpty()) continue;  // ignorer les lignes vides

                // Conversion de la chaîne en entier
                list.add(Integer.parseInt(line));
            }

        } catch (IOException e) {
            // Gestion des erreurs d’E/S (fichier introuvable, permission…)
            System.err.println("I/O error: " + e.getMessage());

        } catch (NumberFormatException e) {
            // Gestion des lignes non convertibles en entier
            System.err.println("Format invalide dans le fichier: " + e.getMessage());
        }

        // Retourne la liste (peut être partiellement remplie)
        return list;
    }
}