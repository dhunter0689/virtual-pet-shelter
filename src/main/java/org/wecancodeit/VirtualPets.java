package org.wecancodeit;

import java.util.Random;

public class VirtualPets {
	// holds name and description of the pets
	private Random rand = new Random();
	private String petsName;
	private String petsDescription;
	private int hunger;
	private int fun;
	private int hygiene;
	private int energy;
	

	public static final int MAX_HUNGER = 7;

	public static final int MAX_ENERGY = 8;

	public static final int MAX_FUN = 6;

	public static final int MAX_HYGIENE = 5;

	public static final int MIN_ALL = 0;
	
	

	public VirtualPets(String petsName, String petsDescription) {
		this.petsName = petsName;
		this.petsDescription = petsDescription;
	}

	public String getPetsName() {
		return petsName;
	}

	public void setPetsName(String petsName) {
		this.petsName = petsName;
	}

	public String getPetsDescription() {
		return petsDescription;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getHunger() {
		return hunger;
	}

	public void setFun(int fun) {
		this.fun = fun;
	}

	public int getFun() {
		return fun;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getEnergy() {
		return energy;
	}

	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}

	public int getHygiene() {
		return hygiene;
	}

	public VirtualPets(String petsName, String petsDescription, int hunger, int fun, int hygiene, int energy) {
		this.petsName = "Java";
		this.petsDescription = "playful and curious beagle puppy.";
		hunger = MAX_HUNGER / 2;
		fun = MAX_FUN / 2;
		hygiene = MAX_HYGIENE / 2;
		energy = MAX_ENERGY / 2;

		this.petsName = "Git";
		this.petsDescription = "mature and dainty maltese dog.";
		this.setHunger(5);
		;
		this.setFun(5);
		this.setHygiene(5);
		this.setEnergy(5);

		this.petsName = "Bash";
		this.petsDescription = "aggressive and very protective pit bull.";
		this.setHunger(5);
		this.setFun(5);
		this.setHygiene(5);
		this.setEnergy(5);

	}

	

	public boolean isAlive() {
		if (hunger <= MIN_ALL || fun <= MIN_ALL || energy <= MIN_ALL) {
			return false;
		}

		return true;
	}

	public void giveFood() {
		hunger -= 5;
		energy += 3;
	}
	
	public void playWith() {
		fun += 4;
		energy -= 2;
		hygiene -= 3;
		hunger += 3;
	}
	
	public void giveBath() {
		hygiene += 5;
		energy += 1;
	}
	
	public void giveNap() {
		energy += 4;
		hunger += 1;
	}

	public void decreaseEnergy() {
		energy -= ((rand.nextInt(2) +1));
		
	}

	public void decreaseHygiene() {
		hygiene -=(rand.nextInt(2) +1);
		
	}

	public void decreaseFun() {
		fun -=(rand.nextInt(2) +1);
		
	}

	public void increaseHunger() {
	hunger +=(rand.nextInt(2) +1);
		
	}
}
//hold to pets name description and default attributes