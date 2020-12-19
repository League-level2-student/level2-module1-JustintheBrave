package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> list = new ArrayList <String>();
		//2. Add five Strings to your list
		list.add("hi");
		list.add("hello");
		list.add("greetings");
		list.add("whats up");
		list.add("Jutins");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 5; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < 5; i++) {
			if(i%2==0) {
				System.out.println(list.get(i));
			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < 5; i++) {
			if(list.get(i).contains("e")) {
				System.out.println(list.get(i));
			}
		}
	}
}
