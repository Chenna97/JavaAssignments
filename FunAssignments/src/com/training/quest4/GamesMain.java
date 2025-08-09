package com.training.quest4;

public class GamesMain {

	public static void main(String[] args) {
		
		IGames indoorGames = () -> {
            System.out.println("Indoor Games:");
            System.out.println("Chess");
            System.out.println("Carrom");
            System.out.println("Table Tennis");
            System.out.println();
        };

        // Lambda for Outdoor Games
        IGames outdoorGames = () -> {
            System.out.println("Outdoor Games:");
            System.out.println("Cricket");
            System.out.println("Football");
            System.out.println("Basketball");
            System.out.println();
        };
        
        indoorGames.showGames();
        outdoorGames.showGames();

	}

}
