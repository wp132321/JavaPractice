/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ IdolGroup
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 5. 27.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] group = {"빅뱅", "2NE1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "탑", "승리", "대성"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리", "그외"}
		};
		
		for(int i = 0; i < group.length; i++) {
			printMembers(group[i], members[i]);
		}
	}
	
	static void printMembers(String groupName, String[] groupMembers) {
		System.out.println(String.format("<< %s 멤버 >>", groupName));
		
		for(String member : groupMembers) {
			System.out.println(member);
		}
		
		System.out.println();
	}
}
