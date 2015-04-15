package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 4. 14.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class CarTest {
	
	public static void main(String[] args) {
		
		Car genesis, k7, sm7;
		Car2 genesis_2, k7_2, sm7_2;		
		
		genesis = makeCar("현대자동차", "제네시스", "검정색", 225, 50000000);
		k7 = makeCar("기아자동차", "k7", "흰색", 246, 40000000);
		sm7 = makeCar("삼성자동차", "sm7", "흰색", 200, 38000000);
		
		genesis_2 = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		k7_2 = new Car2("기아자동차", "k7", "흰색", 246, 40000000);
		sm7_2 = new Car2("삼성자동차", "sm7", "흰색", 200, 38000000);
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", genesis.getCompany(), genesis.getCompany(), genesis.getColor(), genesis.getMaxSpeed(), genesis.getPrice()));
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", k7.getCompany(), k7.getCompany(), k7.getColor(), k7.getMaxSpeed(), k7.getPrice()));
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", sm7.getCompany(), sm7.getCompany(), sm7.getColor(), sm7.getMaxSpeed(), sm7.getPrice()));
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", genesis_2.getCompany(), genesis_2.getCompany(), genesis_2.getColor(), genesis_2.getMaxSpeed(), genesis.getPrice()));
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", k7_2.getCompany(), k7_2.getCompany(), k7_2.getColor(), k7_2.getMaxSpeed(), k7_2.getPrice()));
		System.out.println(String.format("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 : %dkm\n가격 : %,d원\n", sm7_2.getCompany(), sm7_2.getCompany(), sm7_2.getColor(), sm7_2.getMaxSpeed(), sm7_2.getPrice()));
	}

	private static Car makeCar(String company, String model, String color, int maxSpeed, int price) {
		Car car = new Car();
		car.setCompany(company);
		car.setModel(model);
		car.setColor(color);
		car.setMaxSpeed(maxSpeed);
		car.setPrice(price);
		
		return car;
	}
}
