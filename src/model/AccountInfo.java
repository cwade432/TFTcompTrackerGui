/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Apr 24, 2022
 */
package model;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Caleb
 *
 */
public class AccountInfo {
	public String username;
	public double averagePlacement;
	public Stack<TeamComp> comp;
    public String stackString = new String();
    
	// default contructor
	public AccountInfo() {
	}
	
	// Constructor to pass account info to player list
	public AccountInfo(String username, Stack<TeamComp> testStack, int averagePlacement) {
		this.username = username;
		this.comp = testStack;
		this.averagePlacement = averagePlacement;
	}
	
	// ask user to input username
	public String getUsername() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in account name: ");
		username = input.nextLine();
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	// ask user for average placement, will refractor in future to auto get average placement
	public double getAveragePlacement() {
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Enter in average placement: ");
		while(!input.hasNextInt()) {
			String in = input.next();
			System.out.printf("Please enter valid placement: ", in);
		}
		averagePlacement = input.nextInt();
		} while(averagePlacement < 0);
		return averagePlacement;
	}

	public void setAveragePlacement(double averagePlacement) {
		this.averagePlacement = averagePlacement;
	}

	// getting stack of different comps account has used
	public Stack<TeamComp> getComp() {
		return comp;
	}

	public void setComp(Stack<TeamComp> comp) {
		this.comp = comp;
	}
	
	// printing stack in stack order
	public String printStack(Stack<TeamComp> comp) {
	    if (comp.empty()) {
	        return "Comp is empty";
	    }
	    else {
		    TeamComp currentComp = comp.peek();
		    comp.pop();
		    stackString += currentComp;
		    //System.out.println("printStack before push");
		    printStack(comp);
		    comp.push(currentComp);
		    //System.out.println("from printStack() after push");
		    return stackString;
	    }
	}
	
	// Not implemented yet, List is doubled on print
	public Stack <TeamComp> buildTeamComp() {
		int compCount = 0;
		Scanner input = new Scanner(System.in);
		Stack<TeamComp> compStack = new Stack<TeamComp>();
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
		return compStack;
	}
	
	// displaying Account in player list with thier comps
	public String toString() {
		return "\n AccountInfo: Username=" + username + ", Average Placement=" + averagePlacement + ", Comps= [" + printStack(comp);
	}	
}
