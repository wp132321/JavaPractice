/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ Figure
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 19.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Figure {
	
	private int centerX;
	private int centerY;
	
	/**
	 * @param centerX
	 * @param centerY
	 */
	public Figure(int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	// 도형의 넓이를 계산하는 메소드. 부모클래스이므로 0을 리턴한다.
	protected double calcArea() {
		return 0.0;
	}
	
	// 도형의 중심좌표를 출력하는 메소드.
	protected void printCenter() {
		System.out.println(String.format("중심좌표 : (%d, %d)", centerX, centerY));
	}
	
	// 도형을 이동하는 메소드.
	protected void moveFigure(int x, int y) {
		centerX += x;
		centerY += y;
	}
}
