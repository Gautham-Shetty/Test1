//Concrete Builder for Type 1 Product

package com.uttara.builder;

public class IceHouse implements HouseBuilder {
	
	private House house;
	
	 public IceHouse()
	 {
		 this.house=new House();
	 }
//Concrete Builder for one type of product
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Ice basement");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Ice blocks");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Ice dome");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Ice carving");
	}
	public void setName(String name)
	{
		house.setName(name);
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return house.getName();
	}

}
