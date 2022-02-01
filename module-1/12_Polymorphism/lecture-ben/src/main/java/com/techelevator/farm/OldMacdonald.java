package com.techelevator.farm;

import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		//Object[] = new Object[5];

		Cat ruthie = new Cat("Ruthie");

		Cat cat = new Cat();

//		FarmAnimal animal = new FarmAnimal("Animal", "Noise");
//		Cow myCow = (Cow) animal;

		//Singable sing = new Singable();

		Singable[] singables = new Singable[] { ruthie, cat, new Cow(), new Chicken(),
				new Pig(), new Tractor(), new Spouse(), new PoppingCorn() };

		for (Singable thing : singables) {
			String name = thing.getName();
			String sound = thing.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}

//		Sellable[] sellables = new Sellable[] {new Chicken(), new Egg(), new PoppingCorn() };
//		for (Sellable sellable : sellables) {
//			System.out.print("Step right up and get your " + sellable.getName());
//			System.out.println(", only $" + sellable.getPrice());
//		}

		Object[] stuffOnFarm = new Object[] { ruthie, new Chicken(), new Cat("Tasha"),
											new Egg(), new Tractor(), new PoppingCorn(), new Cow() };

		for (Object thing : stuffOnFarm) {
			Sellable sellableThing;
			if (Sellable.class.isInstance(thing)) {
				sellableThing = (Sellable) thing;
				System.out.print("Step right up and get your " + sellableThing.getName());
				System.out.println(", only $" + sellableThing.getPrice());
			}

		}




	}
}