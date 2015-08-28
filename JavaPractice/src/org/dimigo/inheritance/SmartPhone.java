/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_ SmartPhone
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 8. 28.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class SmartPhone {
	
	// 스마트폰의 모델명
	private String model;
	
	// 스마트폰의 제조사
	private String company;
	
	// 스마트폰의 가격
	private int price;
	
	
	// 기본 생성자
	public SmartPhone() {
		super();
	}

	/**
	 * @param model 모델명
	 * @param company 제조사
	 * @param price 가격
	 */
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	// 스마트폰의 전원을 켜는 메서드
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	// 스마트폰의 전원을 끄는 메서드
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	// 기본 결제 메시지 출력(자식 클래스에서 페이명 출력 후 호출)
	public void pay() {
		System.out.println("로 결제합니다");
	}
	
	// SmartPhone 객체를 매개변수로 받아 제조사에 따라 고유기능을 실행한다.
	public void useSpecialFunction(SmartPhone phone) {
		
		// 받은 매개변수가 IPhone클래스일 경우
		if(phone instanceof IPhone) {
			
			// IPhone의 고유기능인 AirDrop을 사용한다.
			((IPhone) phone).useAirDrop();
			
			// 받은 매개변수가 Galaxy클래스일 경우
		} else if(phone instanceof Galaxy) {
			
			// Galaxy의 고유기능인 무선충전을 사용한다.
			((Galaxy) phone).useWirelessCharging();
		}
	}
	
	// 모델명과 제조사, 가격을 포함한 스마트폰 기본 정보를 출력한다.
	public String toString() {
		return String.format("모델명 : %s, 제조사 : %s, 가격 : %,d원", model, company, price);
	}
}
