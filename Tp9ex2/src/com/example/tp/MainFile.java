package com.example.tp;

import java.util.*;

/**
 * Programme de test pour FileUtil.readNumbers.
 */
public class MainFile {
    public static void main(String[] args) {
        // Appel de la méthode de lecture sur "numbers.txt"
        List<Integer> nums = FileUtil.readNumbers("numbers.txt");

        // Affichage simple du résultat
        System.out.println("Nombres lus : " + nums);
    }
}