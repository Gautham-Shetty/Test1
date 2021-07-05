//Concrete Builder for Type 2 Product
package com.uttara.builder;

public class WoodenHouse implements HouseBuilder {
	
	
	private House house;
	
	 public WoodenHouse()
	 {
		 this.house=new House();
	 }

	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden basement");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Wooden blocks");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Wooden dome");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Wooden carving");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		house.setName(name);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return house.getName();
	}
	
}
