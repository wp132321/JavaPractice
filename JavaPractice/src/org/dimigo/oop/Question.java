package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 5. 12.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class Question {

	private static Scanner sc;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		makeQuestion("a, b, c, ?", "d");
		makeQuestion("자바를 만든 사람은?", "제임스 고슬링");
		makeQuestion("C언어를 만든 사람은?", "데니스 리치");
	}
	
	private static void makeQuestion(String question, String answer) {
		System.out.println(question);
		if(sc.nextLine().equals(answer)) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
	}
}
