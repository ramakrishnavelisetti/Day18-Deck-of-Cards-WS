package com.bdlz.deckc;

public class PlayCards {
   static String[][] cards = new String[4][13];
   static String[] suit = {"Club", "Diamond", "Heart", "Spade"};
   static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "King", "Queen", "Jack"};
    public static void initializeCards() {
        System.out.println("Initializing the Cards");
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cards[i][j] = (suit[i] + " -> " + rank[j]);
                System.out.println(cards[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void shuffleCards() {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                int m = (int)(Math.random() * cards.length);
                int n = (int)(Math.random() * cards[i].length);
                String temp = cards[i][j];
                cards[i][j] = cards[m][n];
                cards[m][n] = temp;
            }
        }
    }
}