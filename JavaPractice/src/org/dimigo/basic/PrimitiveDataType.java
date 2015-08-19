package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 * 
 * 1. 개요   : Data Type Practice
 * 2. 작성일  : 2015. 4. 2.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */
 
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "IU";
		boolean isMan = false;
		int age = 23;
		double height = 161.8d;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + (isMan? "남성" : "여성"));
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}

}