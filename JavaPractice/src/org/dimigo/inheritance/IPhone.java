/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ IPhone
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 28.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class IPhone extends SmartPhone {

	/**
	 * 기본 생성자
	 */
	public IPhone() {
		super();
	}

	/**
	 * @param model 모델명
	 * @param company 제조사
	 * @param price 가격
	 */
	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}

	// 결제 방식을 print하고 SuperClass의 pay메서드를 호출한다.
	@Override
	public void pay() {
		System.out.print("애플 페이");
		super.pay();
	}
	
	// 애플의 고유기능인 AirDrop을 이용한다.
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
