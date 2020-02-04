package org.wecancodeit;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();
		VirtualPets java = new VirtualPets("Java ", "playful and curious puppy. ", rand.nextInt(5) + 1,
				rand.nextInt(5) + 1, rand.nextInt(5) + 1, rand.nextInt(5) + 1);
		VirtualPets git = new VirtualPets("Git", "mature and dainty maltese dog.", rand.nextInt(5) + 1,
				rand.nextInt(5) + 1, rand.nextInt(5) + 1, rand.nextInt(5) + 1);
		VirtualPets bash = new VirtualPets("Bash", "aggressive and very protective pit bull.", rand.nextInt(5) + 1,
				rand.nextInt(5) + 1, rand.nextInt(5) + 1, rand.nextInt(5) + 1);

		shelter.addPet("Java", java);
		shelter.addPet("Git", git);
		shelter.addPet("Bash", bash);

		String ready;
		int menuInput = 0;
		boolean playingPets = false;
		System.out.println("Welcome to the Littlest Pet Shop Shelter");
		do {
			System.out.println("\nAre you ready to get to know your pets? (y/n) ");
			ready = input.nextLine();
		} while (!ready.equals("y"));
		playingPets = true;
		while (playingPets) {
			do {
				System.out.println("\nHere are all the pets:\n");
				System.out.println("|Name |Hunger |Fun |Hygiene");
				System.out.println("|-----|-------|----|------|");
				for (VirtualPets digiPet : shelter.getAllPets().values()) {
					System.out.println(digiPet.getPetsName());
				}
				System.out.println("\nWhat would you like to do?\n");
				System.out.println("Enter 1 to feed all pets. ");
				System.out.println("Enter 2 to feed just one pet.");
				System.out.println("Enter 3 to play with one pet.");
				System.out.println("Enter 4 to bathe a pet. ");
				System.out.println("Enter 5 to adopt a pet.");
				System.out.println("Enter 0 to exit.");
				menuInput = input.nextInt();
				input.hasNextLine();

			} while (menuInput != 1 && menuInput != 2 && menuInput != 3 && menuInput != 4 && menuInput != 0);

			if (menuInput == 1) {
				System.out.println("\nYou want to feed all the pets!");
				shelter.feedAllPets();
			}
			if (menuInput == 2) {
				System.out.println("\nYou would like to feed a pet, who would you like to feed? ");
				String petsName = input.nextLine();
				shelter.giveFood(petsName);

			}
			if (menuInput == 3) {
				System.out.println("They are ready to play! ");
				for (VirtualPets digiPet : shelter.getAllPets().values()) {
					System.out.println(digiPet);
				}
				}
				System.out.println("\nWhich pet would you like to play with?");
				String petsName = input.nextLine();
				shelter.playWith(petsName);
				
			}
			if (menuInput == 4) {
				System.out.println("\nWho would you like to give a bath? ");
				String petsName = input.nextLine();
				shelter.giveBath(petsName);

			}
			if (menuInput == 5) {
				System.out.println("\nWho would you like to adopt? ");
				String petsName = input.nextLine();
				shelter.adopt(petsName);
			}
			if (menuInput == 0) {
				System.out.println("Goodbye we will see you again next time!");
				playingPets = false;
			}
			shelter.tick();
		}

	}

