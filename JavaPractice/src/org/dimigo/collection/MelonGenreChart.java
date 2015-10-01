/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *    |_ MelonGenreChart
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 9. 25.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> musics = new HashMap<String, List<Music>>();
		
		System.out.println("-- << 멜론 차트 >> --");
		
		musics.put("발라드", new ArrayList<Music>(Arrays.asList(
				new Music("내 첫사랑", "베리굿"), 
				new Music("또 다시 사랑", "임창정"),
				new Music("부산에 가면", "박진영"))));

		musics.put("댄스", new ArrayList<Music>(Arrays.asList(
				new Music("커피", "유재환, 김예림"),
				new Music("다 잘될거야", "쿨"))));
		
		printMap(musics);
		
		System.out.println("-- << 발라드 3위 곡 변경 >> --");
		musics.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		
		printMap(musics);
		
		System.out.println("-- << 발라드 1위 곡 삭제 >> --");
		musics.get("발라드").remove(0);
		
		printMap(musics);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		musics.clear();
		
		printMap(musics);
	}

	public static void printMap(Map<String, List<Music>> musics) {

		for(String key : musics.keySet()) {
			int cnt = 0;
			System.out.println("[" + key + "]");
			
			for(Music music : musics.get(key)) {
				System.out.println(String.format("%d. %s", ++cnt, music));
			}
		}
		
		System.out.println();
	}
}
