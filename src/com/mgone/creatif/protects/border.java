package com.mgone.creatif.protects;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;



public class border implements org.bukkit.event.Listener {
	
	

	
	
	
	 @org.bukkit.event.EventHandler
	  public void pmovevent(PlayerMoveEvent event)
	  {
	    Player p = event.getPlayer();
	    double pX = p.getLocation().getBlockX();
	    double pY = p.getLocation().getBlockY();
	    double pZ = p.getLocation().getBlockZ();
	    String worldp = event.getPlayer().getWorld().getName();   
	    
	   
	    if (pY > 200.0D) {
	    	if(p.isOp()) return;
	        p.teleport(p.getLocation().add(0.0D, -10.0D, 0.0D));
	        p.sendMessage("§4Vous avez dépasser la limite de la map en hauteur");
	    }
	    
	    
	    
	    if (worldp.equals("plotworld")) {  
	    		
		    if (pX > 3015.0D) {
		    	 p.teleport(p.getLocation().add(-10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pX < -3015.0D) {
		    	 p.teleport(p.getLocation().add(10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    } 
		    
		    
		    if (pZ > 3015.0D) {
		    	 p.teleport(p.getLocation().add(0.0D, 0.0D, -10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pZ < -3015.0D) {
		    	 p.teleport(p.getLocation().add(0.0D, 0.0D, 10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }	
	    }
	    
	    
	    if (worldp.equals("plotworld2")) {  
    		
		    if (pX > 1000.0D) {
		    	p.teleport(p.getLocation().add(-10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pX < -1000.0D) {
		    	p.teleport(p.getLocation().add(10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    } 
		    
		    
		    if (pZ > 1000.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, -10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pZ < -1000.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, 10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }	
	    }

	    
	    
	    if (worldp.equals("plotworld3")) {  
    		
		    if (pX > 2000.0D) {
		    	p.teleport(p.getLocation().add(-10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pX < -2000.0D) {
		    	p.teleport(p.getLocation().add(10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    } 
		    
		    
		    if (pZ > 2000.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, -10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pZ < -2000.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, 10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }	
	    }

	    
	    
	    if (worldp.equals("pixelart")) {  
    		
		    if (pX > 1500.0D) {
		    	p.teleport(p.getLocation().add(-10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pX < -1500.0D) {
		    	p.teleport(p.getLocation().add(10.0D, 0.0D, 0.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    } 
		    
		    
		    if (pZ > 1500.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, -10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }
		    if (pZ < -1500.0D) {
		    	p.teleport(p.getLocation().add(0.0D, 0.0D, 10.0D));
		        p.sendMessage("§4Vous avez dépasser la limite de la map");
		    }		
	    }

	  }


	 
	/* @org.bukkit.event.EventHandler
	  public void pspeed(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    if(p.isInsideVehicle()) return ; 
	  
	    if (crea.cheateur.containsKey(p.getName())) return;
	    
	    if(e.getTo().getX() - e.getFrom().getX() > 4 || e.getFrom().getX() - e.getTo().getX() > 4 ||
	    e.getTo().getZ() - e.getFrom().getZ() > 4 || e.getFrom().getZ() - e.getTo().getZ() > 4) {
	    	
	    	crea.cheateur.put(p.getName(),p.getLocation());
	    	for (Player pe : Bukkit.getOnlinePlayers()) {
	        	if(pe.hasPermission("warn.cheat")) { 
	        		pe.sendMessage("§4§lSuspect de cheat: " + "§6" + p.getName() + " §fjoueur en speed >6");
	        		pe.playSound(pe.getLocation(), Sound.GHAST_SCREAM, 30.0F, 10.0F);}
	        	}
	    	
	    }
	    
	    
	  } */
	    
	    

	
	
}
