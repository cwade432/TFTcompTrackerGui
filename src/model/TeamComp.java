/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Apr 24, 2022
 */
package model;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Caleb
 *
 */
public class TeamComp {
	public String characters; 
	public String[] items = new String[2];    
	public String[] augments = new String[3];
	public int placement; 
	
	// Default constructor
	public TeamComp() {
	}
	
	public TeamComp(String characters, String items[], String augments[], int placement) {
		this.characters = characters;
		this.items = items;
		this.augments = augments;
		this.placement = placement;
	}
	
	// Get user input for characters
	public String getCharacters() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter character: ");
		characters = input.nextLine();
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	// Get user input for items
	public String[] getItems() {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < items.length; i++) {
			System.out.print("Enter in item: ");
				items[i] = input.nextLine();
		}
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	// Get user input for augments
	public String[] getAugments() {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < augments.length; i++) {
			System.out.print("Enter in augments: ");
			augments[i] = input.nextLine();
		}
		return augments;
	}

	public void setAugments(String[] augments) {
		this.augments = augments;
	}

	// Get user input for placement, uses input validation
	public int getPlacement() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter placement: ");
			while (!input.hasNextInt()) {
				String in = input.next();
				System.out.printf("Please enter valid placement: ", in);
			}
			placement = input.nextInt();
		} while(placement < 0);
		return placement;
	}

	public void setPlacement(int placement) {
		this.placement = placement;
	}

	// Print team comp
	public String toString() { 
		return "\n  Team Comp: [characters=" + characters + ", items=" + Arrays.toString(items) + ", augments="
				+ Arrays.toString(augments) + ", placement=" + placement + "]";
	}
}
