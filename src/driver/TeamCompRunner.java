
/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Apr 24, 2022
 */
package driver;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

import model.AccountInfo;
import model.TeamComp;

/**
 * @author Caleb
 *
 */
public class TeamCompRunner {
	public static void main(String[] args) {
		int compCount = 0;
		Scanner input = new Scanner(System.in);
		AccountInfo account = new AccountInfo();
		Stack<TeamComp> compStack = new Stack<TeamComp>();
		LinkedList<AccountInfo> playerList = new LinkedList<AccountInfo>();
		
		// Inserting LtDutchman into list
		String dutchmanItem[] = {"Rapid Fire Cannon", "Giant Slayer"};
		String dutchmanAugment[] = {"Smoke Bomb", "Spell Blade", "Payday"};
		TeamComp dutchmanComp = new TeamComp("Talon", dutchmanItem, dutchmanAugment, 3);
		Stack<TeamComp> compStack2 = new Stack<TeamComp>();
		compStack2.push(dutchmanComp);
		AccountInfo dutchmanAccount = new AccountInfo("LtDutchman", compStack2, 5);
		playerList.push(dutchmanAccount);
		// end inserting player into list
		
		// Inserting tycoon432 into list
		String tycoonItem[] = {"Static Shiv", "Ghost Blade"};
		String tycoonAugment[] = {"Hyper Roll", "Backfoot", "Weakspot"};
		TeamComp tycoonComp = new TeamComp("Jinx", tycoonItem, tycoonAugment, 3);
		Stack<TeamComp> compStack3 = new Stack<TeamComp>();
		compStack3.push(tycoonComp);
		AccountInfo account2 = new AccountInfo("tycoon432", compStack3, 3);
		playerList.push(account2);
		// end inserting player into list
		
		// getting user input for comps and account
		System.out.print("How many comps to enter: ");
		int numComps = input.nextInt();
		while(compCount < numComps) {
			TeamComp comp = new TeamComp();
			comp.getCharacters();		
			comp.getItems();
			comp.getAugments();
			comp.getPlacement();			
			System.out.println("Added: " + comp);
			compStack.push(comp);
			compCount++;
		}
		
		System.out.println("Comp stack added: " + compStack);
		account.getUsername();
		account.setComp(compStack);
		account.getAveragePlacement();
		playerList.push(account);
		// End getting comps and player account
			
		System.out.println("Player: " + account.username + " added");	
		System.out.println("\n=== Player list ===");
		System.out.println(playerList);
			
		// Insertion sort does not work as expected, will continue to work on it
			System.out.println("\n=== Insertion sort ===");
			insertionSort(playerList);
	}
	
	public static void insertionSort(LinkedList<AccountInfo> sortingList) {
	for(AccountInfo s : sortingList) {
		double key = s.averagePlacement;
		int i = sortingList.size() - 1;
		while((i > -1) && (s.averagePlacement > key)) {
			double total = s.averagePlacement + 1;
			total = s.averagePlacement;
			i--;
		}
		double wins = s.averagePlacement + 1;
		wins = key;
		System.out.println(" Username: " + s.username + ", average comp ranking: " + key);
		}
	}
}

