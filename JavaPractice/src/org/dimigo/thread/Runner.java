/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *    |_ Runner
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 11. 6.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Runner extends Thread {

	private String name;
	
	public Runner(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " 출발");
		
		int race = 100;
		
		while(true) {	
			System.out.println(name + " " + race + " 미터");
			
			if(race == 0) {
				System.out.println(name + " 골인");
				break;
			}
			
			try {
				Thread.sleep(1000);
				race -= 10;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
