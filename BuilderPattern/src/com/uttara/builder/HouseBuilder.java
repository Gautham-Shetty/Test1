//Builder interface

package com.uttara.builder;

import java.io.Serializable;

public interface HouseBuilder {

	 public void buildBasement();
	 public void buildStructure();
	 public void buildRoof();
	 public void buildInterior();
	 public House getHouse();
	 
	 public void setName(String name);
	 public String getName();
	 
	
}
