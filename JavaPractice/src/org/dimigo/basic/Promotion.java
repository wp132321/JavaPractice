package org.dimigo.basic;

public class Promotion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay = 1700000;
		int employees = 3;
		int shopsCount = 1500;
		
		System.out.println("<< 디미베네 연간 급여 >>");
		System.out.println(String.format("%s : %,d원", "월 평균 급여", pay));
		System.out.println(String.format("%s : %,d명", "점포 내 직원 수", employees));
		System.out.println(String.format("%s : %,d개", "점포 수", shopsCount));
		System.out.println(String.format("%s : %,d원", "연간 인건비", (long)pay * 12 * employees * shopsCount));
		
	}

}
