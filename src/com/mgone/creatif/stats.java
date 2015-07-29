package com.mgone.creatif;

import java.util.HashMap;
import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.mgone.creatif.database.Pstat;


public class stats implements org.bukkit.event.Listener {
	
	
	public static HashMap<String, Double> timep = new HashMap<String, Double>();
	public static HashMap<String, Double> movep = new HashMap<String, Double>();
	public static HashMap<String, Double> blockplace = new HashMap<String, Double>();
	public static HashMap<String, Double> blockbreak = new HashMap<String, Double>();
	
	//map 2
	public static HashMap<String, Double> timepm2 = new HashMap<String, Double>();
	public static HashMap<String, Double> movepm2 = new HashMap<String, Double>();
	public static HashMap<String, Double> blockplacem2 = new HashMap<String, Double>();
	public static HashMap<String, Double> blockbreakm2 = new HashMap<String, Double>();
	
	
	@EventHandler
	  public void onJoin(PlayerJoinEvent event) 
	  {
	    Player player = event.getPlayer();
	    statslogin(player);
		    
	  }
	
	
	 @EventHandler
	  public void onleave(PlayerQuitEvent event)
	  {
	    Player player = event.getPlayer();
	    statslogout(player);
	    
	  }
	
	
	
	
	@SuppressWarnings("deprecation")
	public static void statslogin(Player player) {
		
		
		if(player.getUniqueId() == null)  { player.sendMessage("§cLa Résolution de l'UUID a échoué, Vos statisques ne seront pas enregsiter!");
		for (Player pop : Bukkit.getOnlinePlayers()) {if(pop.isOp()) pop.sendMessage("§c[Stats debug] §fExcution statstask pour " + player.getName() + " Exception E0");}
		
	     } else {
		
		Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid", player.getUniqueId().toString()).findUnique();

    	
	    if (spstat == null) {
	    	

	    	Pstat pstat = new Pstat();

	    	pstat.setPlayerName(player.getName());	
	    	pstat.setUuid(player.getUniqueId().toString());	
	    	pstat.setFirsjoin(System.currentTimeMillis());
	    	pstat.setJoinp(1);
	    	pstat.setLastjoin(System.currentTimeMillis());
	    	pstat.setLastleave(0);
	    	pstat.setTimep(0);
	    	pstat.setMovep(0);
	    	pstat.setBlockplace(0);
	    	pstat.setBlockbreak(0);
	    	
	    	pstat.setTimepm2(0);
	    	pstat.setMovepm2(0);
	    	pstat.setBlockplacem2(0);
	    	pstat.setBlockbreakm2(0);
	    	
	    	
	    	crea.plugin.getDatabase().save(pstat);
	    	
		    timep.put(player.getName(), (double) 0);
		    movep.put(player.getName(), (double) 0);
		    blockplace.put(player.getName(), (double) 0); 
		    blockbreak.put(player.getName(), (double) 0);
		    
		    timepm2.put(player.getName(), (double) 0);
		    movepm2.put(player.getName(), (double) 0);
		    blockplacem2.put(player.getName(), (double) 0); 
		    blockbreakm2.put(player.getName(), (double) 0);
	    	

	    } else {
	    
	    String pname  = spstat.getPlayerName(); if (!pname.equals(player.getName())) 
	    {player.sendMessage("§cVous avez changer votre pseudo, Mise a jours de vos donner..."); spstat.setPlayerName(player.getName());	 }
	    
	    int nbjoin = spstat.getJoinp(); nbjoin++; spstat.setJoinp(nbjoin);
	    
	    spstat.setLastjoin(System.currentTimeMillis());
	    
	    crea.plugin.getDatabase().save(spstat);
	    
	    
	    timep.put(player.getName(), spstat.getTimep());
	    movep.put(player.getName(), spstat.getMovep());
	    blockplace.put(player.getName(), spstat.getBlockplace()); 
	    blockbreak.put(player.getName(), spstat.getBlockbreak());
	    
	    
	    timepm2.put(player.getName(), spstat.getTimepm2());
	    movepm2.put(player.getName(), spstat.getMovepm2());
	    blockplacem2.put(player.getName(), spstat.getBlockplacem2()); 
	    blockbreakm2.put(player.getName(), spstat.getBlockbreakm2());
	    
	    } //fin spstat not null
	    
	    
	     }//fin if uuid != null
		
	}
	
	
	
	public static void statslogout(Player p) {
    
    if(p.getUniqueId() == null)   return;
		
	Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid", p.getUniqueId().toString()).findUnique();
	String pname  = p.getName();
	
	spstat.setLastleave(System.currentTimeMillis());
	if(timep.get(pname) > spstat.getTimep() ) spstat.setTimep(timep.get(pname));
	if(movep.get(pname) > spstat.getMovep() ) spstat.setMovep(movep.get(pname));
	if(blockplace.get(pname) > spstat.getBlockplace() ) spstat.setBlockplace(blockplace.get(pname));
	if(blockbreak.get(pname) > spstat.getBlockbreak() ) spstat.setBlockbreak(blockbreak.get(pname));
	
	if(timepm2.get(pname) > spstat.getTimepm2() ) spstat.setTimepm2(timepm2.get(pname));
	if(movepm2.get(pname) > spstat.getMovepm2() ) spstat.setMovepm2(movepm2.get(pname));
	if(blockplacem2.get(pname) > spstat.getBlockplacem2() ) spstat.setBlockplacem2(blockplacem2.get(pname));
	if(blockbreakm2.get(pname) > spstat.getBlockbreakm2() ) spstat.setBlockbreakm2(blockbreakm2.get(pname));

	crea.plugin.getDatabase().save(spstat);
	
    timep.remove(p.getName());
    movep.remove(p.getName());
    blockplace.remove(p.getName()); 
    blockbreak.remove(p.getName());
    
    timepm2.remove(p.getName());
    movepm2.remove(p.getName());
    blockplacem2.remove(p.getName()); 
    blockbreakm2.remove(p.getName());
    
		
	}
	
	
	public static void removehorligne() {
		
		
       	for( Iterator<String> i = timep.keySet().iterator(); i.hasNext();){
    		String key = (String)i.next();
    		
    	@SuppressWarnings("deprecation")
		OfflinePlayer p = Bukkit.getOfflinePlayer(key);
    	
		if (!p.isOnline()) {
	    timep.remove(p.getName());
	    movep.remove(p.getName());
	    blockplace.remove(p.getName()); 
	    blockbreak.remove(p.getName());
	    
	    timepm2.remove(p.getName());
	    movepm2.remove(p.getName());
	    blockplacem2.remove(p.getName()); 
	    blockbreakm2.remove(p.getName());
	    
		}
		
                             }
			
		}
	
	
	@SuppressWarnings("deprecation")
	public static void statstask(Player p) {
		
		String pname  = p.getName();
		
		if(timep.containsKey(pname) && movep.containsKey(pname) && blockplace.containsKey(pname) && blockbreak.containsKey(pname)) {
		
		if(p.getUniqueId() != null) {

		Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid", p.getUniqueId().toString()).findUnique();
		
		
		if(timep.get(pname) > spstat.getTimep() ) spstat.setTimep(timep.get(pname));
		if(movep.get(pname) > spstat.getMovep() ) spstat.setMovep(movep.get(pname));
		if(blockplace.get(pname) > spstat.getBlockplace() ) spstat.setBlockplace(blockplace.get(pname));
		if(blockbreak.get(pname) > spstat.getBlockbreak() ) spstat.setBlockbreak(blockbreak.get(pname));
		
		if(timepm2.get(pname) > spstat.getTimepm2() ) spstat.setTimepm2(timepm2.get(pname));
		if(movepm2.get(pname) > spstat.getMovepm2() ) spstat.setMovepm2(movepm2.get(pname));
		if(blockplacem2.get(pname) > spstat.getBlockplacem2() ) spstat.setBlockplacem2(blockplacem2.get(pname));
		if(blockbreakm2.get(pname) > spstat.getBlockbreakm2() ) spstat.setBlockbreakm2(blockbreakm2.get(pname));
		
		crea.plugin.getDatabase().save(spstat);
		//for (Player pop : Bukkit.getOnlinePlayers()) {if(pop.isOp()) pop.sendMessage("§c[Stats debug] §fExcution statstask pour " + pname);}
		
		} else {	
			for (Player pop : Bukkit.getOnlinePlayers()) {if(pop.isOp()) pop.sendMessage("§c[Stats debug] §fExcution statstask pour " + pname + " Exception E2");}
		      }
		
		} else { 	
			for (Player pop : Bukkit.getOnlinePlayers()) {if(pop.isOp()) pop.sendMessage("§c[Stats debug] §fExcution statstask pour " + pname + " Exception E1");}
			} //fin if player not in hmap
			
		}
	
	
	
	public static void databasecheck(Player p) {
		String pname  = p.getName();
		if(!timep.containsKey(pname) || !movep.containsKey(pname) || !blockplace.containsKey(pname) || !blockbreak.containsKey(pname))
			statslogin(p);	
	}
	
	

	
	
	
	
	  @EventHandler
	  public void onBlockBreak(BlockBreakEvent event)
	  {
	    Player p = event.getPlayer();
	    String pname  = p.getName();
	    if(event.isCancelled()) return;
	    
	    if(!blockbreak.containsKey(pname)) return;
	    blockbreak.put(pname, blockbreak.get(pname)+1);
	    
	    if(!blockbreakm2.containsKey(pname)) return;
	    String worldp = event.getPlayer().getWorld().getName();
	    
	    if (worldp.equals("plotworld2")) { 
	    String grade = crea.permission.getPrimaryGroup(p);
		if(grade.contains("visiteur")) return;
		if(grade.contains("apprenti")) return;
		if(grade.contains("macon")) return;
		if(grade.contains("decorateur")) return;
		blockbreakm2.put(pname, blockbreakm2.get(pname)+1);
	    }
	    
	  }
	  
	  
	  @EventHandler
	  public void onBlockplace(BlockPlaceEvent event)
	  {
	    Player p = event.getPlayer();
	    String pname  = p.getName();
	    if(event.isCancelled()) return;
	    
	    if(!blockplace.containsKey(pname)) return;
	    blockplace.put(pname, blockplace.get(pname)+1);
	    
	    if(!blockplacem2.containsKey(pname)) return;
	    String worldp = event.getPlayer().getWorld().getName();
	    
	    if (worldp.equals("plotworld2")) { 
	    String grade = crea.permission.getPrimaryGroup(p);
		if(grade.contains("visiteur")) return;
		if(grade.contains("apprenti")) return;
		if(grade.contains("macon")) return;
		if(grade.contains("decorateur")) return;
		blockplacem2.put(pname, blockplacem2.get(pname)+1);	 	
	    }
	    
	    
	  }
	  
	  
	  
		 @org.bukkit.event.EventHandler
		  public void pmovevent(PlayerMoveEvent e)
		  {
			    Player p = e.getPlayer();
			    String pname  = p.getName();
			    if(p.isInsideVehicle()) return ;
			    if(e.isCancelled()) return;

			    if (e.getFrom().getBlockX() == e.getTo().getBlockX() && e.getFrom().getBlockY() == e.getTo().getBlockY()
			    		&& e.getFrom().getBlockZ() == e.getTo().getBlockZ()) return;
			    
			    String grade = crea.permission.getPrimaryGroup(p);
			    if(grade.contains("visiteur")) return;
			    
			    if(!movep.containsKey(pname)) return;
			    movep.put(pname, movep.get(pname)+1);
			    
			    if(!movepm2.containsKey(pname)) return;
			    String worldp = p.getWorld().getName();
			    
			    if (worldp.equals("plotworld2")) { 
				if(grade.contains("apprenti")) return;
				if(grade.contains("macon")) return;
				if(grade.contains("decorateur")) return;
				movepm2.put(pname, movepm2.get(pname)+1);	 	
			    }

		  }
		 
		 
		 public static void timeptask(){
			  
			 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
						new Runnable() {
							@SuppressWarnings("deprecation")
							public void run() {
								
								for (Player pe : Bukkit.getOnlinePlayers()) {
									String pname  = pe.getName();
									String worldp = pe.getWorld().getName();
									String grade = crea.permission.getPrimaryGroup(pe);
									
									if(!grade.contains("visiteur")) {
									if(timep.containsKey(pname))	timep.put(pname, timep.get(pname)+30); }
									
	
									if (worldp.equals("plotworld2")) { 
									if((grade.contains("electricien")) || (grade.contains("ingenieur")) ||
									(grade.contains("geometre")) || (grade.contains("architecte")) || 
									(grade.contains("animateur")) || (grade.contains("guide")) || 
									(grade.contains("modo")) || (grade.contains("modo-sup")) || 
									(grade.contains("co-admin")) || (grade.contains("admin"))) {
									if(timepm2.containsKey(pname))	timepm2.put(pname, timepm2.get(pname)+30); }
									}
									//for (Player pop : Bukkit.getOnlinePlayers()) {if(pop.isOp()) pop.sendMessage("§c[Stats debug] §fExcution timeptask pour " + pname);}
								}
								
							}
							
              }, 0, 30 * 20);
		 }
		 
		 
		 
		 public static void savestattask(){
			  
			 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
						new Runnable() {
							@SuppressWarnings("deprecation")
							public void run() {
								
								removehorligne();
								
								for (Player pe : Bukkit.getOnlinePlayers()) {
									statstask(pe);
								}
								
							}
							
              }, 0, 600 * 20);
		 }
		 
		 
		 
		 
		 public static void taskdatabasecheck(){
			  
			 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
						new Runnable() {
							@SuppressWarnings("deprecation")
							public void run() {
								
								for (Player pe : Bukkit.getOnlinePlayers()) {
									databasecheck(pe);
								}
								
							}
							
              }, 0, 60 * 20);
		 }
	
	

}
