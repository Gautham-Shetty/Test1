//Product class

package com.uttara.builder;

public class House implements HousePlan {
	private String basement;
	private String structure;
	private String roof;
	private String interior;
	private String name;
	@Override
	public void setBasement(String basement) {
		// TODO Auto-generated method stub
		this.basement=basement;
	}
	@Override
	public void setStructure(String structure) {
		// TODO Auto-generated method stub
		this.structure=structure;
	}
	@Override
	public void setRoof(String roof) {
		// TODO Auto-generated method stub
		this.roof=roof;
	}
	@Override
	public void setInterior(String interior) {
		// TODO Auto-generated method stub
		this.interior=interior;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "House named "+name+" having "+basement+ " "+structure+" "+roof+" "+interior;
	}
	
	
	

}
