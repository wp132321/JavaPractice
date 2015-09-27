/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ Music
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 25.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Music {
	
	private String title;
	private String singer;
	
	/**
	 * @param title
	 * @param singer
	 */
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the singer
	 */
	public String getSinger() {
		return singer;
	}

	/**
	 * @param singer the singer to set
	 */
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString() {
		return String.format("%s [title=%s, singer=%s]", this.getClass().getName(), this.title, this.singer);
	}
}
