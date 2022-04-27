/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Apr 25, 2022
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;
import model.AccountInfo;
import model.TeamComp;

/**
 * @author Caleb
 *
 */
class TeamCompUnitTest {

	@Test
	//Testing adding values to TeamComp
	void testCreateComp() {
		// ARRANGE
		String[]  items = {"item1", "item2"};
		String[] augments = {"augment1", "augment2", "augment3"};
		TeamComp testComp = new TeamComp("Test Character", items, augments, 1);
		boolean actual;
		// ACT
		actual = testComp != null;
		// ASSERT
		assertTrue(actual);
	}
	
	@Test
	// Testing adding values to AccountInfo
	void testCreateAccount() {
		// ARRANGE
		String[]  items = {"item1", "item2"};
		String[] augments = {"augment1", "augment2", "augment3"};
		TeamComp testComp = new TeamComp("Test Character", items, augments, 1);
		Stack<TeamComp> compStack = new Stack<TeamComp>();
		compStack.push(testComp);
		AccountInfo account = new AccountInfo("ipatchez", compStack, 1);
		boolean actual;
		// ACT
		actual = account != null;
		// ASSERT
		assertTrue(actual);
	}
	
	@Test
	// Testing printing comp in stack order
	void testPrintingCompStack() {
		// ARRANGE
		String[]  items1 = {"item1", "item2"};
		String[] augments1 = {"augment1", "augment2", "augment3"};
		TeamComp testComp1 = new TeamComp("Test Character", items1, augments1, 1);
		String[]  items2 = {"item3", "item4"};
		String[] augments2 = {"augment4", "augment5", "augment6"};
		TeamComp testComp2 = new TeamComp("Test Character", items2, augments2, 1);
		AccountInfo account = new AccountInfo();
		String comp1 = testComp1.toString();
		String comp2 = testComp2.toString();
		String actual, expected;
		expected = comp2 + comp1;
		Stack<TeamComp> compStack = new Stack<TeamComp>();
		compStack.push(testComp1);
		compStack.push(testComp2);
		// ACT
		actual = account.printStack(compStack);
		// ASSERT
		assertEquals(expected, actual);
	}
}
