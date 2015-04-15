package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car3
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 4. 15.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class Car3 {

	private String company;
	private String model;
	private  String color;
	private int maxSpeed;
	private int price;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param company
	 * @param model
	 * @param color
	 * @param maxSpeed
	 * @param price
	 */
	public Car3(String company, String model, String color, int maxSpeed,
			int price) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	/**
	 * @param company
	 * @param model
	 * @param color
	 * @param maxSpeed
	 */
	public Car3(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * @param company
	 * @param model
	 * @param color
	 */
	public Car3(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	
}
