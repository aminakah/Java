package org.example;

public class MathUtils {

    /**
     * Calcule le factoriel d'un nombre entier positif.
     * @param n le nombre dont on veut calculer le factoriel
     * @return le factoriel de n
     * @throws IllegalArgumentException si n est négatif
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Le nombre doit être positif ou nul.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
