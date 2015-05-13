package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 5. 13.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class Score {

	static int total;
	static StringBuilder sb = new StringBuilder("<< 점수 출력 >>\n");
	private static Scanner sc;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		addScore("국어", sc.nextInt());
		
		System.out.println("수학 점수 입력 => ");
		addScore("수학", sc.nextInt());
		
		System.out.println("영어 점수 입력 => ");
		addScore("영어", sc.nextInt());
		
		sb.append(String.format("%s : %d점 \n", "총점", total));
		sb.append(String.format("%s : %.1f점 \n", "평균", total/3.0));
		
		System.out.println(sb);
	}

	private static void addScore(String subject, int Score) {
		total += Score;
		sb.append(String.format("%s 점수 : %d 점\n", subject, Score));
	}
}
