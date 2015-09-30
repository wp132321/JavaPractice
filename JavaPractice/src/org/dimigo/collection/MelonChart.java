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
		
		System.out.println("-- << 멜론 차트 >> --");
		
		musics.add(new Music("바람이나 좀 쐐", "개리"));
		musics.add(new Music("보통연애", "박경"));
		musics.add(new Music("취향저격", "iKON"));
		
		printList(musics);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		musics.add(1, new Music("레옹", "이유갓지"));
		
		printList(musics);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		musics.set(2, new Music("맙소사", "황태지"));
		
		printList(musics);

		System.out.println("-- << 4위 곡 삭제 >> --");
		musics.remove(3);
		
		printList(musics);
		
		System.out.println("<< 전체 리스트 삭제 >>");
		musics.clear();
		
		printList(musics);
	}

	public static void printList(List<Music> list) {
		int cnt = 0;
		
		for(Music music : list) {
			System.out.println(String.format("%d. %s", ++cnt, music));
		}
		
		System.out.println();
	}
}
