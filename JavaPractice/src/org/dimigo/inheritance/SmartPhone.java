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
	
	private String model;
	private String company;
	private int price;
	
	
	public SmartPhone() {
		super();
	}

	/**
	 * @param model
	 * @param company
	 * @param price
	 */
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void pay() {
		System.out.println("로 결제합니다");
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof IPhone) {
			((IPhone) phone).useAirDrop();
		} else if(phone instanceof Galaxy) {
			((Galaxy) phone).useWirelessCharging();
		}
	}
	
	public String toString() {
		return String.format("모델명 : %s, 제조사 : %s, 가격 : %,d원", model, company, price);
	}
}
