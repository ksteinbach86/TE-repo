package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// For-Each or foreach
		int[] nums = {45, 3, 17};
		int sum = 0;
		for (int i = 0; i < nums.length && sum < 47; i++) {
			System.out.println("Element at index " + i + " is " + nums[i]);
			sum += nums[i];
		}

		for (int num : nums) {
			System.out.println("Num is " + num);
		}


		//		System.out.println("####################");
//		System.out.println("       LISTS");
//		System.out.println("####################");


		List<String> pokemons = new ArrayList<String>();

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		System.out.println("pokemons has " + pokemons.size() +  " elements");
		pokemons.add("Charizard");
		pokemons.add("Raichu");
		pokemons.add("Filler");

		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}

		pokemons.set(2, "Pikachu");
		for (int i = 0; i < pokemons.size(); i++) {
			System.out.println(pokemons.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		pokemons.add(1,"Squirtle");
		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}
		System.out.println("Pikachu is at offset " + pokemons.indexOf("Pikachu"));
		pokemons.add(pokemons.indexOf("Raichu")+1, "Voltorb");
		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}
		pokemons.remove("Voltorb");
		System.out.println("");
		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		Collections.sort(pokemons);

		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}

		if (pokemons.indexOf("Radish") >= 0) {
			pokemons.add(pokemons.indexOf("Radish"), "Voltorb");
		}

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(31);
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println(numbers.get(0).toString());


		System.out.println("####################");
		System.out.println("Stacks");
		System.out.println("####################");

		// LIFO - Last in First out
		Stack<String> choices = new Stack<String>();
		choices.push("Take the train");
		choices.push("Do the laundry");
		choices.push("Mow the lawn");
		System.out.println(choices.pop());
		for (String choice : choices) {
			System.out.println("Next: "+choice);
		}

		Stack<Integer> sizes = new Stack<>();
		sizes.push(42);

		System.out.println("####################");
		System.out.println("Queues");
		System.out.println("####################");

		// FIFO - First In First Out
		Queue<String> customers = new LinkedList<String>();
		customers.offer("Grayson");
		customers.offer("Angel");
		customers.offer("Mikey");
		customers.offer("Andrew");
		Scanner scanner = new Scanner(System.in);
		String newCustomer;
		while (!customers.isEmpty()) {
			System.out.println("Next: " + customers.poll());
			System.out.print("Add person: ");
			newCustomer = scanner.nextLine();
			if (!newCustomer.equals("")) {
				customers.offer(newCustomer);
			}
		}

		customers.







		//pokemons.sort
		//pokemons.

//		System.out.println("####################");
//		System.out.println("Lists allow duplicates");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Lists allow elements to be inserted in the middle");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Lists allow elements to be removed by index");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Find out if something is already in the List");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Find index of item in List");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Lists can be turned into an array");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Lists can be sorted");
//		System.out.println("####################");
//
//
//		System.out.println("####################");
//		System.out.println("Lists can be reversed too");
//		System.out.println("####################");
//
//


	}
}
