package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 5. 19.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snacks = new Snack[] { new Snack("새우깡", "농심", 1100, 2), new Snack("콘칲", "크라운", 1200, 1), new Snack("허니버터칩", "해태", 1500, 4)};
		
		int total = 0;
		
		for(Snack snack : snacks) {
			snack.printSnack();
			total += snack.calcPrice();
		}
		
		System.out.println(String.format("총 구매 금액 : %,d원", total));
	}

}
