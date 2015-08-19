package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 * 
 * 1. 개요   : 반복문 Practice
 * 2. 작성일  : 2015. 4. 2.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */
 
public class Loop {

	/**
	 * 2015. 03. 26. THUR
	 * 2321 이명현
	 */
	
	public static void main(String[] args) {
		int max = 10;

		for(int i = 0; i <= max; i++) {
			for(int j = 0; j <= max; j++) {
				if(i == j) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			} System.out.println();
		}
	}

}
