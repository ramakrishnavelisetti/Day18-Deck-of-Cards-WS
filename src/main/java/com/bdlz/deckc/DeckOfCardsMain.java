package com.bdlz.deckc;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        PlayCards playCards = new PlayCards();
        playCards.initializeCards();
        playCards.shuffleCards();
        Players players = new Players();
        players.addPlayers();
        players.playerSequence();
    }
}
