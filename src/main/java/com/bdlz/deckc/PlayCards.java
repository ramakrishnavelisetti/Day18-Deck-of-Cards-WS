package com.bdlz.deckc;


public class PlayCards {
    public void initializeCards() {
    String[][] cards = new String[4][13];
        String[] suit = {"Club", "Diamond", "Heart", "Spade"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "King", "Queen", "Jack"};
        System.out.println("Initializing the Cards");
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cards[i][j] = (suit[i] + " -> " + rank[j]);
                System.out.println(cards[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}