package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 * 
 * 1. 개요   : 
 * 2. 작성일  : 2015. 4. 14.
 * </pre>
 *
 * @author  : Ion_kr / 2321 이명현
 * @version : 1.0
 * @Git     : http://github.com/wp132321
 */

public class Car {

	private String company;
	private String model;
	private  String color;
	private int maxSpeed;
	private int price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String Company) {
		company = Company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String Model) {
		model = Model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String Color) {
		color = Color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int MaxSpeed) {
		maxSpeed = MaxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int Price) {
		price = Price;
	}
}
