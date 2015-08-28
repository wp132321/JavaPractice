/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ SmartPhoneTest
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 28.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 아이폰6과 갤럭시S6를 담은 스마트폰 배열을 생성한다.
		SmartPhone phones [] = {
				new IPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		// 스마트폰 배열에 담긴 스마트폰 객체를 가져와 메서드를 실행시킨다.
		for(SmartPhone phone : phones) {
			
			// 스마트폰 정보 출력.
			System.out.println(phone.toString());
			
			// 스마트폰 전원 켬.
			phone.turnOn();
			
			// 스마트폰의 페이를 이용하여 결제.
			phone.pay();
			
			// 스마트폰의 고유 기능을 사용함.
			phone.useSpecialFunction(phone);
			
			// 스마트폰 전원 끔.
			phone.turnOff();
			
			// 한 줄 띄어주기
			System.out.println();
		}
	}

}
