package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요   : Type Casting Pratice
 * 2. 작성일  : 2015. 4. 2.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */
 
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int sadari_up = 9;
		int sadari_down = 10;
		double sadari_height = 5.8;
		
		int diamond_width = 9;
		double diamond_height = 5.4;
		
		double sadari_area, diamond_area;
		double absolute;
		
		System.out.println("<< 도형 넓이 비교 >>");
		
		sadari_area = (sadari_up + sadari_down) * sadari_height / 2;
		diamond_area = diamond_width* diamond_height;
		absolute = sadari_area - diamond_area;
		
		System.out.println("사다리꼴 넓이 : " + sadari_area);
		System.out.println("평행사변형 넓이 : " + diamond_area);
		
		if(absolute < 0) absolute *= -1;
		
		if(absolute == 0 ) {
			System.out.println("두 도형의 넓이가 같습니다.");
		} else {
			System.out.println(String.format("%s이(가) %s 보다 %.1f 더 큽니다.", absolute > 0 ? "사다리꼴" : "평행사변형", absolute > 0 ? "사다리꼴" : "평행사변형", absolute < 0 ? absolute * -1 : absolute));
		}
	}

}