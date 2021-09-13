package com.bdlz.DeckC;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        PlayCards cardsPlay = new PlayCards();
        cardsPlay.uniqueCards();
        Players players = new Players();
        players.addPlayers();
    }
}
