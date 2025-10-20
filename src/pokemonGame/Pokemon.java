package pokemonGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokemon {
	protected String name;
	private String defendType;
	private String attackType;
	private int power;
	private double hp;
	
	
	
	//constructor
	public Pokemon(String name, String defendType, String attackType,int power, double hp) {
		super();
		this.name = name;
		this.defendType = defendType;
		this.attackType = attackType;
		this.power = power;
		this.hp = hp;
		}
	
	//setter and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefend() {
		return defendType;
	}

	public void setDefend(String defendType) {
		this.defendType = defendType;
	}

	public String getAttack() {
		return attackType;
	}

	public void setAttack(String attackType) {
		this.attackType = attackType;
	}
	public void setPower(int power) {
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}
	
	//Method 
	public String battleCry() {
        return name + " says: 'Ready for battle!'";
    }


	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", defend=" + defendType + ", attack=" + attackType + ", power=" + power + ", hp=" + hp
				+ "]";
	}
	
	
	
	
	
	
	
	
	
}
