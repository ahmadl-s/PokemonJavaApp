package pokemonGame;

import java.util.Scanner;

public class Catch {
    Scanner input = new Scanner(System.in);

    public void Catching(WildPokemon wildPokemon, Player player) {
        String userBall = null;
        boolean validBall = false;

        // Loop until a valid ball is selected
        while (!validBall) {
            System.out.println("Choose a Ball to catch the Wild Pokemon \n"
                    + "[pokeball, greatball, ultraball, masterball]: ");
            userBall = input.nextLine();

            if (isValidBall(userBall)) {
                validBall = true;
            } else {
                System.out.println("\nInvalid choice! Please choose a valid ball.");
            }
        }

        // Calculate catching probability
        int pokeballCatch = wildPokemon.getPower() - poking(wildPokemon);
        int goldenSand = 0, goldenChip = 0;

        switch (userBall.toLowerCase()) {
            case "pokeball":
                goldenSand = 3;
                goldenChip = 1;
                break;
            case "greatball":
                goldenSand = 4;
                goldenChip = 2;
                break;
            case "ultraball":
                goldenSand = 6;
                goldenChip = 3;
                break;
            case "masterball":
                goldenSand = 6;
                goldenChip = 6;
                break;
        }

        if (isSuccessfulCatch(pokeballCatch, userBall)) {
            System.out.println("You Caught the Pokémon!");
            System.out.printf("\n   Oops! The wild Pokémon dropped %d golden sand and %d golden chips.%n",
                    goldenSand, goldenChip);
            player.setGoldenSand(goldenSand);
            player.setGoldenChip(goldenChip);
        } else {
            System.out.println("You didn't catch the Pokémon.");
        }

        // Add on: Convert to golden medals
        int totalMedals = player.getGoldenSand() + player.getGoldenChip();
        player.setMedals(totalMedals);

        System.out.println("\nGoldenSand and GoldenChip converted to Medals. Your Medals = " + player.getMedals());

        // Check for free gift
        handleFreeGift(player);
    }

    private boolean isValidBall(String ball) {
        return ball.equalsIgnoreCase("pokeball") || ball.equalsIgnoreCase("greatball") ||
                ball.equalsIgnoreCase("ultraball") || ball.equalsIgnoreCase("masterball");
    }

    private boolean isSuccessfulCatch(int pokeballCatch, String ball) {
        switch (ball.toLowerCase()) {
            case "pokeball":
                return pokeballCatch > 60;
            case "greatball":
                return pokeballCatch > 50;
            case "ultraball":
                return pokeballCatch > 35;
            case "masterball":
                return pokeballCatch > 25;
            default:
                return false;
        }
    }


    //ADD ON feature: free gift
    private void handleFreeGift(Player player) {
        int Medals = player.getMedals();
        String userChoice = "";

        // Ask the player if they want the gift
        while (true) {
            System.out.println("Do you want to receive a gift with your Golden Medals? (Y/N): ");
            userChoice = input.nextLine().trim().toUpperCase();

            if (userChoice.equals("Y")) {
                // Process the gift based on golden medals
                if (Medals >= 5 && Medals <= 6) {
                    System.out.println("GIFT: SURPRISE! YOU GET EXTRA 3 GOLDEN MEDALS");
                    player.setMedals(Medals + 3);
                } else if (Medals >= 7 && Medals <= 9) {
                    System.out.println("GIFT:SURPRISE! YOU GET EXTRA 5 GOLDEN MEDALS");
                    player.setMedals(Medals + 5);
                } else if (Medals >= 10 && Medals <= 12) {
                    System.out.println("GIFT:SURPRISE! YOU GET EXTRA 7 GOLDEN MEDALS");
                    player.setMedals(Medals + 7);
                } else {
                    System.out.println("Sorry, you don't have enough Golden Medals to receive a gift.");
                }
                break;
            } else if (userChoice.equals("N")) {
                System.out.println("You chose not to receive a gift. Proceeding...");
                break;
            } else {
                System.out.println("Invalid input! Please enter 'Y' for Yes or 'N' for No.");
            }
        }

        // Displaying the final golden medal count
        System.out.println("Your total Golden Medals: " + player.getMedals());
    }


    public int poking(WildPokemon wp) {
        switch (wp.getPokemonType().toLowerCase()) {
            case "common":
                return 30;
            case "rare":
                return 20;
            case "legend":
                return 10;
            default:
                return 0;
        }
    }
}
