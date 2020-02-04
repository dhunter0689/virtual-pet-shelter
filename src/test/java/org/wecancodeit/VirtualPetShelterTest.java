package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {
	String result;
	VirtualPets digiPet1;
	VirtualPets digiPet2;

	@Before
	public void setUp() {
		digiPet1 = new VirtualPets("Java", "Playful and curious puppy ");
		digiPet2 = new VirtualPets("Git", "Mature and dainty dog ");

	}

	@Test
	public void ShouldBeAbleToAddAPetToShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(result, digiPet1);
		VirtualPets retrievedDigiPet = underTest.findDigiPet(digiPet1.getPetsName());
		assertEquals(retrievedDigiPet, digiPet1);
	}

	@Test
	public void ShouldBeAbleToAddASecondPetToShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(result, digiPet1);
		underTest.addPet(result, digiPet2);
		Map<String, VirtualPets> allPets = underTest.getAllPets();
		// assertThat(allPets, containsInAnyOrder(digiPet1, digiPet2));
		assertEquals(2, allPets.size());
	}

	@Test
	public void ShouldAdoptPetFromShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		underTest.addPet(result, digiPet1);
		underTest.adopt(digiPet1.getPetsName());
		VirtualPets adoptedPet = underTest.findDigiPet(digiPet1.getPetsName());
		assertEquals(adoptedPet, result);
	}

}