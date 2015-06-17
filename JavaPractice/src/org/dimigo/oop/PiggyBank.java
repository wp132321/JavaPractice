/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ PiggyBank
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 6. 16.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class PiggyBank {

	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		System.out.println(String.format("%s %d원 넣음", member.getMemberName(), amount));
		balance += amount;
	}
	
	public static void printBalance() {
		System.out.println(String.format("돼지저금통 총 금액 : %d원", balance));
	}
	
	public static void stealMoney(FamilyMember member, int amount) {
		System.out.println(String.format("%s %d원 몰래 빼감", member.getMemberName(), amount));
		balance -= amount;
	}
}
