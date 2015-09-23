/**
 * 
 */
package org.dimigoexception;

/**
 * <pre>
 * org.dimigoexception
 *    |_ Movie
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 23.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Movie {

	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
}
