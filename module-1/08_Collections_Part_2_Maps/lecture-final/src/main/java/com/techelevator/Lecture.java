package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();


		Set<String> sisters = new HashSet<String>();


		sisters.add("Angelica");
		sisters.add("Eliza");
		sisters.add("Peggy");
		if (sisters.add("Eliza")) {
			System.out.println("Added Eliza");
		}
		else {
			System.out.println("Eliza already there");
		}
		if (sisters.contains("George")) {
			System.out.println("Has George");
		}
		else {
			System.out.println("No George");
		}

		sisters.add("George");
		for (String sister : sisters) {
			System.out.println(sister);
		}


		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		Map<String, String> nameToZip = new HashMap<>();
		nameToZip.put("Ben Langhinrichs", "44115");
		nameToZip.put("Dan Shaw", "44107");
		nameToZip.put("Jacob Chafin", "44012");
		nameToZip.put("Angel Scott", "44128");
		nameToZip.remove("Dan Shaw");




		System.out.println("Jacob Chafin is in the " + nameToZip.get("Jacob Chafin") + " zip code");


		System.out.println("Angel Scott is in the " + nameToZip.get("Angel Scott") + " zip code");
		if (nameToZip.containsKey("Dan Shaw")) {
			System.out.println("Dan Shaw exists!");
		}
		else {
			System.out.println("Dan Shaw? Who dat?");
		}

		//System.out.println("Dan Shaw is in the " + nameToZip.get("Dan Shaw") + " zip code");
		Set<String> keys = nameToZip.keySet();
		for (String key : keys) {
			System.out.println(key);
			System.out.println(" lives in zip code ");
			System.out.println(nameToZip.get(key));
			System.out.println(key + " lives in zip code " + nameToZip.get(key));
		}
		System.out.println();
		System.out.println("Now, the complicated bit");
		System.out.println();

		// For-each loop using a special method from the map to iterate through pairs
		for (Map.Entry<String, String> pair : nameToZip.entrySet()) {

			// "pair" (the ietarator) is the key-value pair

			// get key from pair
			System.out.println("Key: "+pair.getKey());
			System.out.println("Value: "+pair.getValue());
			System.out.println(pair.getKey() + " lives in zip code " + pair.getValue());
			System.out.println(pair);
		}

		// The value in a Map can be an object. An object is an instance of a class.
		// We created a new class (see Person.java) to use here
		Map<Integer, Person> people = new HashMap<>();

		// Create a temporary for names
		String[] peopleArray = new String[] {"Tony", "Maria"};

		// We are using an Integer as a key, so "num" is our incrementor
		int num = 0;

		// Looping through temp array to grab names, building a Person object from them,
		// and adding to the "people" map which has <Integer, Person>
		for (String name : peopleArray) {
			// Create an object using a custom constructor
			Person person = new Person(name, 10000.00);

			// Use pre-increment for num, then add to map
			people.put(++num, person);
		}


		num = people.size();
		peopleArray = new String[] {"Frankie", "Anita"};

		// Add parallel temp array for net worth doubles
		double[] potsOfMoney = new double[] {1000000, 100.50};
		for (int i = 0; i < peopleArray.length; i++) {
			// Create an object using a custom constructor with elements from two
			// parallel arrays
			Person person = new Person(peopleArray[i], potsOfMoney[i]);
			people.put(++num, person);
		}

		// Loop through "people" may with special Map.Entry logic
		for (Map.Entry<Integer, Person> entry : people.entrySet()) {
			// The value is an object, so get it with getValue()
			Person person = entry.getValue();
			// "so and so has a net worth of xxx"
			System.out.println(person.getFullName() + " has a net worth of " + person.getNetWorth());
			System.out.println(person);
		}

		//Map<Boolean, String> myMap;


	}

}
