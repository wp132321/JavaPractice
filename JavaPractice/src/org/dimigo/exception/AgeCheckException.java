/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigoexception
 *    |_ AgeCheckException
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 23.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

@SuppressWarnings("serial")
public class AgeCheckException extends Exception {

	private Movie movie;
	
	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		this.movie = movie;
	}
	
	@Override
	public String getMessage() {
		return String.format("%s은/는 %d세 이상 관람가입니다", movie.getTitle(), movie.getLimitAge());
	}
}
