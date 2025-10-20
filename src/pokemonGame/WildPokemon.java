package pokemonGame;

import java.util.List;
import java.util.Random;

public class WildPokemon extends Pokemon {
	
	private String PokemonType;
	

	public WildPokemon(String name, String defendType, String attackType,int power, double hp,	String PokemonType) {
		super(name, defendType, attackType,power,  hp);
		this.PokemonType = PokemonType;
	}
	
	//getter setter
	public String getPokemonType() {
		return PokemonType;
	}

	public void setPokemonType(String PokemonType) {
		this.PokemonType = PokemonType;
	}
	
	//Method 
	
	@Override
    public String battleCry	() {
        return  name + " roars: 'I am a wild Pokémon!'";
    }
	
	
	@Override
	 public String toString() {
	        return "Wild" + super.toString() + ", PokemonType: " + PokemonType;
	    }

	


}
