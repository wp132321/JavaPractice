package org.dimigo.basic;

public class Condition {
	
	static String TYPE_BUS = "고속버스";
	static String TYPE_CAR = "경차";
	static String TYPE_OTHERS = "그 외";

	static int PAY_BUS = 850;
	static int PAY_CAR = 300;
	static int PAY_OTHERS = 600;
	
	static int EXTRA_BUS = 300;
	static int EXTRA_OTHERS = 200;
	
	public static void main(String[] args) {
		calculatePay(TYPE_BUS, 10);
		calculatePay(TYPE_CAR, 10);
		calculatePay(TYPE_OTHERS, 10);
		
		calculatePay(TYPE_BUS, 25);
		calculatePay(TYPE_CAR, 25);
		calculatePay(TYPE_OTHERS, 25);
	}
	
	static void calculatePay(String CarType, int mileage) {
		int PAY, TotalPay;
		
		if(CarType.equals(TYPE_BUS)) {
			PAY = PAY_BUS;
		} else if(CarType.equals(TYPE_CAR)) {
			PAY = PAY_CAR;
		} else {
			PAY = PAY_OTHERS;
		}
		
		TotalPay = PAY;
		
		if(mileage > 10) {
			TotalPay +=  (Math.ceil((mileage / 10))) * (CarType.equals(TYPE_BUS) ? EXTRA_BUS : EXTRA_OTHERS);
		}
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + mileage + "km");
		System.out.println("차종 : " + CarType);
		System.out.println("통행료 : " + TotalPay + "원");
		System.out.println("");
		
	}

}
