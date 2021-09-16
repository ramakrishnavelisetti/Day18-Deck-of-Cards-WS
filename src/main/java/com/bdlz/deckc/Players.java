package com.bdlz.deckc;

import java.util.Scanner;

public class Players {

    int playerCount;
    public void addPlayers() {
        System.out.println("Add No.of Players Between 2 and 4");
        Scanner sc = new Scanner(System.in);
        playerCount = sc.nextInt();
        if(playerCount >= 2 && playerCount <= 4){
            System.out.println("No.of Players are : " + playerCount);
        } else{
            System.out.println("Invalid input Enter between 2 to 4 ");
            addPlayers();
        }
    }
    public void playerSequence() {
        for (int i = 1; i <= playerCount; i++) {
            System.out.println("Player" + i);
        }
    }
}
