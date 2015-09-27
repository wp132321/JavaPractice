/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigoexception
 *    |_ MovieTest
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 23.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			Movie[] movies = {
				new Movie("베테랑", 15),
				new Movie("앤트맨", 12),
				new Movie("사도", 12)
			}; 
			
			int age = 13;
			
			for(Movie movie : movies) {
				try {
					buyTicket(movie, age);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}

	private static void buyTicket(Movie movie, int age) throws AgeCheckException {
		if(age >= movie.getLimitAge()) {
			System.out.println(movie.getTitle() + " 영화 즐감하세용~~");
		} else {
			throw new AgeCheckException(movie);
		}
	}
}
