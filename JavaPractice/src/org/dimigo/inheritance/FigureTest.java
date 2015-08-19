/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ FigureTest
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 19.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 반지름이 5인 원 객체를 생성한다.
		Circle c = new Circle(5);
		
		// 중심좌표가 (10, 10)이고 밑변이 5, 높이가 8인 삼각형 객체를 생성한다.
		Triangle t = new Triangle(10, 10, 5, 8);
		
		// 중심좌표가 (20, 20)이고 밑변이 5, 높이가 8인 사각형 객체를 생성한다.
		Rectangle r = new Rectangle(20, 20, 5, 8);

		// 도형들의 넓이를 출력한다.
		System.out.println(String.format("원의 넓이 : %.1f", c.calcArea()));
		System.out.println(String.format("삼각형 넓이 : %.1f", t.calcArea()));
		System.out.println(String.format("사각형 넓이 : %.1f", r.calcArea()));
		
		System.out.println();
		
		// 도형들의 중심좌표를 출력한다.
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println();
		
		System.out.println("-- 중심좌표 이동 (x, y축 5씩)\n");
		
		// 도형들의 중심좌표를 이동한다.
		c.moveFigure(5,  5);
		t.moveFigure(5,  5);
		r.moveFigure(5,  5);
		
		// 도형들의 중심좌표를 생성한다.
		c.printCenter();
		t.printCenter();
		r.printCenter();
	}

}
