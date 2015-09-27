/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonChart
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 25.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Music> musics = new ArrayList<Music>();
		
		musics.add(new Music("바람이나 좀 쐐", "개리"));
		musics.add(new Music("보통연애", "박경"));
		musics.add(new Music("취향저격", "iKON"));
		
		musics.add(1, new Music("레옹", "이유갓지"));
	}

	public static void printList(List<Music> list) {
		for(Music music : list) {
			System.out.println(music);
		}
	}
}
