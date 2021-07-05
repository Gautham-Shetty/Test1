//Tester Class
package com.uttara.builder;

import java.util.ArrayList;

public class BuilderPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HouseBuilder icehouse=new IceHouse();
         HouseArchitect architect=new HouseArchitect(icehouse,"Gautham Empire");
         architect.constructHouse();
         House house=architect.getHouse();
         System.out.println(house);
         HouseBuilder woodenhouse =new WoodenHouse();
         architect=new HouseArchitect(woodenhouse,"Gautham Wooden Estates");
         architect.constructHouse();
         house=architect.getHouse();
         System.out.println(house);
        
         
         
	
	
	}

}
