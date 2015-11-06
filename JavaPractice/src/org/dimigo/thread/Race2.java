/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *    |_ Race
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 11. 6.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Race2 {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Start!!");
		
		new Runner("홍길동").start();
		new Runner("홍길순").start();
		
		System.out.println("Main Thread End!!");
	}

}
