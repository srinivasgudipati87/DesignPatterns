package com.designpatterns.behaviour.template;

import com.designpatterns.behaviour.template.WoddenHouse;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HouseTemplate houseType = new WoddenHouse();
		
		houseType.buildHouse(); System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();


	}

}
