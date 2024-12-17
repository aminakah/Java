package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static int factorielle(int n) {
            int resultat = 1;
            for (int i = 1; i <= n; i++) {
                resultat *= i;
            }
            return resultat;
        }

        public static void main(String[] args) {
            int nombre = 5;
            System.out.println("La factorielle de " + nombre + " est : " + factorielle(nombre));
        }
    }

