package pokemonGame;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//NOTE: PLS IGNORE THE INSTRUCTION PART AND RUN IT 
        
		System.out.println("=========================================");
		System.out.println("[1m**INSTRUCTIONS**[0m");
		System.out.println("=========================================\n");

		// Enter Your Name
		System.out.println("1. [1mEnter Your Name[0m");
		System.out.println("   - At the beginning of the game, you will be prompted to enter your name.\n");

		// Choose Your Pokémon Team
		System.out.println("2. [1mChoose Your Pokémon Team[0m");
		System.out.println("   - You will be shown a list of three random Pokémon.");
		System.out.println("   - Select one Pokémon for your FIRST choice and another for your SECOND choice.");
		System.out.println("   - Enter the respective number (e.g., '1', '2', or '3').\n");

		// View Your Enemies
		System.out.println("3. [1mView Your Enemies (Wild Pokémon)[0m");
		System.out.println("   - Press 'W' to reveal the two Wild Pokémon you will battle.");
		System.out.println("   - Each Wild Pokémon has unique stats such as attack, defense, power, and HP.\n");

		// Battle Setup
		System.out.println("4. [1mBattle Setup[0m");
		System.out.println("   - Choose one Pokémon from your team to face one of the Wild Pokémon.");
		System.out.println("     * Enter '1' or '2' to select your Pokémon.");
		System.out.println("     * Enter '1' or '2' to choose a Wild Pokémon to battle.\n");

		// Battle Mechanics
		System.out.println("5. [1mBattle Mechanics[0m");
		System.out.println("   - Battles begin between your chosen Pokémon and the Wild Pokémon.");
		System.out.println("   - Each Pokémon attacks in turns.");
		System.out.println("   - The battle ends when one Pokémon's HP reaches zero.\n");

		// Second Battle
		System.out.println("6. [1mSecond Battle[0m");
		System.out.println("   - If your first Pokémon is defeated, the second battle begins automatically.");
		System.out.println("   - The second battle will use the Pokémon you didn’t choose for the first round.\n");

		// Catching Wild Pokémon
		System.out.println("7. [1mCatching Wild Pokémon and Earnign free gift[0m");
		System.out.println("   - After defeating a Wild Pokémon, you can attempt to catch it.");
		System.out.println("   - If your Pokémon loses the battle, you cannot catch that Wild Pokémon.");
		System.out.println("   - To catch a Pokémon, choose a Pokéball (e.g., 'pokeball', 'greatball', 'ultraball', or 'masterball').");
		System.out.println("   - The success of catching depends on the ball chosen and the calculations behind it.");
		System.out.println("   - If you succeed in catching any wild pokemon, you will be able to earn golden medals to get free gifts.\n");

		// Scoring System
		System.out.println("8. [1mScoring System[0m");
		System.out.println("   - After the battles, scores for you and your opponent will be displayed.");
		System.out.println("   - Your score is saved automatically for future reference.");
		System.out.println("   - Check the 'TopScoreList' file to view your scores.\n");

		System.out.println("=========================================");
		System.out.println("[1m**GOOD LUCK! LET THE GAME BEGIN!**[0m");
		System.out.println("=========================================");
		
		System.out.println();
		
		
		
		//THE MAIN GAME
		Game PokemonGame = new Game();
		PokemonGame.StartGame();
       
        
       
        
        
        
        
        
        
		
	}//args method
	
	
}//class method



		