package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez : ");
        
        int total = 100;
        int pieces1 = 1;
        int pieces5 = 5;
        int pieces10 = 10;
        int pieces20 = 20;
        int pieces50 = 50;

        System.out.print("pièces de 1 cent ? ");
        int nbrPieces1 = clavier.nextInt();
        System.out.print("pièces de 5 cents ? ");
        int nbrPieces5 = clavier.nextInt();
        System.out.print("pièces de 10 cents ? ");
        int nbrPieces10 = clavier.nextInt();
        System.out.print("pièces de 20 cents ? ");
        int nbrPieces20 = clavier.nextInt();
        System.out.print("pièces de 50 cents ? ");
        int nbrPieces50 = clavier.nextInt();

        int valeurPieces1 = pieces1 * nbrPieces1;
        int valeurPieces5 = pieces5 * nbrPieces5;
        int valeurPieces10 = pieces10 * nbrPieces10;
        int valeurPieces20 = pieces20 * nbrPieces20;
        int valeurPieces50 = pieces50 * nbrPieces50;

        int somme = valeurPieces1 + valeurPieces5 + valeurPieces10 + valeurPieces20 + valeurPieces50;
        int manque = somme - total;
        int reste = somme - total;

        if (somme == total) {
            System.out.println("Vous avez exactement de quoi vous payer le café-crème !");
        }
        else if (somme < total) {
                System.out.println("Il vous manque " + Math.abs(manque) + " centimes pour le café-crème !");
            }
            else {
                System.out.println("Il vous restera " + reste + " centimes après votre café-crème !");
        }
    }
}