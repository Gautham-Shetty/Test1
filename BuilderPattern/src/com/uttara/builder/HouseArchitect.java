//Director Class
package com.uttara.builder;

public class HouseArchitect {
	
	private HouseBuilder housebuilder;
	
	public HouseArchitect(HouseBuilder housebuilder,String name)
	{
		this.housebuilder=housebuilder;
		this.housebuilder.setName(name);
	}
	public House getHouse()
	{
		return this.housebuilder.getHouse();
		
	}
    
  public void constructHouse()
  {
	  this.housebuilder.buildBasement();
	  this.housebuilder.buildStructure();
	  this.housebuilder.buildRoof();
	  this.housebuilder.buildInterior();
  }


}
