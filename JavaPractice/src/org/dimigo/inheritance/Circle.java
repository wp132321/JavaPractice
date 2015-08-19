/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ Circle
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 19.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class Circle extends Figure {
	
	private int radius;

	// 중심좌표 없는 생성자.
	public Circle(int radius) {
		super(0,0);
		this.radius = radius;
	}
	
	/**
	 * @param centerX
	 * @param centerY
	 */
	public Circle(int centerX, int centerY) {
		super(centerX, centerY);
		// TODO Auto-generated constructor stub
	}
	
	/* 도형의 넓이를 계산하여 리턴하는 메소드.
	 * 원의 넓이는 파이 * 반지름의 제곱이다.
	 * 파이의 값은 Math클래스의 PI를 사용한다.
	 */
	protected double calcArea() {
		return Math.PI * radius * radius;
	}
	
	// 부모클래스의 printCenter 메소드를 오버라이딩하여 중심좌표 출력 전 도형의 이름을 출력한다.
	@Override
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}
