/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ Triangle
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 19.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Triangle extends Figure {

	private int width;
	private int height;
	
	// 중심좌표 없는 생성자 
	public Triangle(int width, int height) {
		super(0, 0);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param centerX
	 * @param centerY
	 */
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	// 도형의 넓이를 계산하여 리턴하는 메소드. 사각형의 넓이는 밑변 * 높이/2이다.
	protected double calcArea() {
		return width * height * 0.5;
	}
	
	// 부모클래스의 printCenter 메소드를 오버라이딩하여 중심좌표 출력 전 도형의 이름을 출력한다.
	@Override
	protected void printCenter() {
		System.out.print("삼각형 ");
		super.printCenter();
	}
}