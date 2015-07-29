package com.mgone.creatif.database;

import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

@javax.persistence.Entity
@javax.persistence.Table(name="penligne")
public class Penligne {
	
	  @javax.persistence.Id
	  private int id;
	  
	  @com.avaje.ebean.validation.Length(max=45)
	  @NotEmpty
	  private String playerName;
	  
	  
	  @NotNull
	  private double timep;
	  
	  
	  
	  public int getId()
	  {
	    return id;
	  }
	  
	  public void setId(int id) {
	    this.id = id;
	  }
	
	  
	  
	  public String getPlayerName() {
		   return playerName;
	  }
		  
	   public void setPlayerName(String playerName) {
		    this.playerName = playerName;
	  }
	   
	   
	   public double getTimep() {
		    return timep;
		}
		  
		public void setTimep(double timep) {
		    this.timep = timep;
		 }
	

}
