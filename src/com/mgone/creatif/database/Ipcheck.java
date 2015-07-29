package com.mgone.creatif.database;

import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

@javax.persistence.Entity
@javax.persistence.Table(name="ipcheck")
public class Ipcheck {
	
	 @javax.persistence.Id
	  private int id;
	  
	  @com.avaje.ebean.validation.Length(max=45)
	  @NotEmpty
	  private String playerName;
	  
	  
	  @NotEmpty
	  private String uuid;
	  
	  
	  @NotEmpty
	  private String ip;
	  
	  
	  @NotNull
	  private double timep;
	  
	  
	  @NotNull
	  private int isbanp;
	  

	  @NotNull
	  private int ismutep;
	  
	
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
	  
	  public String getUuid() {
	    return uuid;
	  }
	  
	  public void setUuid(String uuid) {
	    this.uuid = uuid;
	  }
	  
	  
	  public String getIp() {
		    return ip;
	  }
		  
	   public void setTIp(String ip) {
		    this.ip = ip;
	  }
	  
	  
	  public double getTimep() {
	    return timep;
	  }
	  
	  public void setTimep(double timep) {
	    this.timep = timep;
	  }
	  
	  
	  public int getIsbanp() {
		    return isbanp;
	  }
		  
	   public void setIsbanp(int isbanp) {
		    this.isbanp = isbanp;
	  }
	   
	   
		  public int getIsmutep() {
			    return ismutep;
		  }
			  
		   public void setIsmutep(int ismutep) {
			    this.ismutep = ismutep;
		  }
		   
}
