package com.mgone.creatif.database;

import com.avaje.ebean.validation.NotEmpty;
import com.avaje.ebean.validation.NotNull;

@javax.persistence.Entity
@javax.persistence.Table(name="playerstat")
public class Pstat {
	
	
  @javax.persistence.Id
  private int id;
  
  @com.avaje.ebean.validation.Length(max=45)
  @NotEmpty
  private String playerName;
  
  @NotEmpty
  private String uuid;
 
  @NotNull
  private double timep;
 
  @NotNull
  private int joinp;
  

  @NotNull
  private double firsjoin;
  


  @NotNull
  private double lastjoin;
  

  @NotNull
  private double lastleave;
  

  @NotNull
  private double movep;
  
  
  @NotNull
  private double blockplace;
  
  
  @NotNull
  private double blockbreak;
  
  
  @NotNull
  private double timepm2;
  
  
  @NotNull
  private double movepm2;
  
  
  @NotNull
  private double blockplacem2;
  
  
  @NotNull
  private double blockbreakm2;
  

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
  
  public double getTimep() {
    return timep;
  }
  
  public void setTimep(double timep) {
    this.timep = timep;
  }
  
  public int getJoinp() {
    return joinp;
  }
  
  public void setJoinp(int joinp) {
    this.joinp = joinp;
  }
  
  public double getFirsjoin() {
    return firsjoin;
  }
  
  public void setFirsjoin(double firsjoin) {
    this.firsjoin = firsjoin;
  }
  
  public double getLastjoin() {
    return lastjoin;
  }
  
  public void setLastjoin(double lastjoin) {
    this.lastjoin = lastjoin;
  }
  

public double getLastleave() {
	    return lastleave;
}
	  
 public void setLastleave(double lastleave) {
	    this.lastleave = lastleave;
}

public double getMovep() {
	    return movep;
}
	  
public void setMovep(double movep) {
	    this.movep = movep;
}
	  
public double getBlockplace() {
    return blockplace;
}
  
public void setBlockplace(double blockplace) {
    this.blockplace = blockplace;
}
 

public double getBlockbreak() {
    return blockbreak;
}
  
public void setBlockbreak(double blockbreak) {
    this.blockbreak = blockbreak;
}



public double getTimepm2() {
    return timepm2;
}
  
  public void setTimepm2(double timepm2) {
    this.timepm2 = timepm2;
}
  

public double getMovepm2() {
	    return movepm2;
}
	  
public void setMovepm2(double movepm2) {
	    this.movepm2 = movepm2;
}

  
public double getBlockplacem2() {
	    return blockplacem2;
}
	  
public void setBlockplacem2(double blockplacem2) {
	   this.blockplacem2 = blockplacem2;
}

public double getBlockbreakm2() {
    return blockbreakm2;
}
  
public void setBlockbreakm2(double blockbreakm2) {
    this.blockbreakm2 = blockbreakm2;
}



}
