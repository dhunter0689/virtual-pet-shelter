package org.wecancodeit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


	Map<String, VirtualPets> shelter = new HashMap<String, VirtualPets>();


	public VirtualPetShelter() {
		// TODO Auto-generated constructor stub
	
	}
	

	public Map<String, VirtualPets> getAllPets() {
		return shelter;
	}
	
	public void addPet(String digiPet, VirtualPets petsName) {
		shelter.put(digiPet, petsName);

	}

	public VirtualPets findDigiPet(String petsName) {
		return shelter.get(petsName);
	}

	public void adopt(String petsName) {
		shelter.remove(petsName);
	}

	public void feedAllPets() {
		for (VirtualPets digiPet : shelter.values()) {
			digiPet.giveFood();
		}
	}

	public void giveFood (String petsName){
		shelter.get(petsName).giveFood();
	}

	public void playWith(String petsName) {
		shelter.get(petsName).playWith();

	}

	public void giveBath(String petsName) {
		shelter.get(petsName).giveBath();
	}

	public void giveNap(String petsName) {
		shelter.get(petsName).giveNap();
	}

	public void tick() {

		for (VirtualPets digiPet : shelter.values()) {
			digiPet.increaseHunger();
			digiPet.decreaseFun();
			digiPet.decreaseHygiene();
			digiPet.decreaseEnergy();

		}

		
	}

}