package com.mgone.creatif.joinp;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.mgone.creatif.crea;
import com.mgone.creatif.database.Ipcheck;
import com.mgone.creatif.database.Penligne;

public class joindb implements org.bukkit.event.Listener  {
	
	
	 @EventHandler
	  public void onJoinEnligne(PlayerJoinEvent event)
	  {
		    Player player = event.getPlayer();
		    String pname = player.getName();

		 Penligne penligne = crea.plugin.getDatabase().find(Penligne.class).where().ieq("playerName", pname).findUnique();
		 
		 if (penligne != null)	crea.plugin.getDatabase().delete(penligne);
			 
			 Penligne spenligne = new Penligne();
			 spenligne.setPlayerName(pname);
			 spenligne.setTimep(System.currentTimeMillis()); 
			 crea.plugin.getDatabase().save(spenligne);
			 
	if(player.getUniqueId() == null) return ;
	String ipp = player.getAddress().getHostString();
	int ipcheck = crea.plugin.getDatabase().find(Ipcheck.class).where().ieq("ip", ipp).ieq("uuid", player.getUniqueId().toString()).findRowCount();
	
	if (ipcheck != 0) return;
		
		Ipcheck sipcheck = new Ipcheck();
		sipcheck.setPlayerName(pname);
		sipcheck.setUuid(player.getUniqueId().toString());
		sipcheck.setTIp(ipp);
		sipcheck.setTimep(System.currentTimeMillis());
		sipcheck.setIsbanp(0);
		sipcheck.setIsmutep(0);
		crea.plugin.getDatabase().save(sipcheck);


	  }
	 
	 
	 @EventHandler
	  public void onleave(PlayerQuitEvent event)
	  {
	    Player player = event.getPlayer();
	    String pname = player.getName();
	    
		 Penligne penligne = crea.plugin.getDatabase().find(Penligne.class).where().ieq("playerName", pname).findUnique();
		 
		 if (penligne != null)	crea.plugin.getDatabase().delete(penligne);
	    
	    
	  }
	 
	 
	 public static void enligne(Player player) {
		 String pname = player.getName();
		 
		 Penligne penligne = crea.plugin.getDatabase().find(Penligne.class).where().ieq("playerName", pname).findUnique();
		 
		 if (penligne == null) {
		 
		 Penligne spenligne = new Penligne();
		 spenligne.setPlayerName(pname);
		 spenligne.setTimep(System.currentTimeMillis()); 
		 crea.plugin.getDatabase().save(spenligne); }
		 
	 }
	 
	 public static void srbootpurge(Player p) {
		 Penligne penligne = crea.plugin.getDatabase().find(Penligne.class).where().ieq("playerName", p.getName()).findUnique();
		 
		 if (penligne != null)	crea.plugin.getDatabase().delete(penligne);
		 
	 }
	 

	 
		public static void sremovehorligne() {
			
			List<Penligne> penligne = new ArrayList<Penligne>();
			penligne = crea.plugin.getDatabase().find(Penligne.class).findList();
			
			if (penligne.size() == 0) return;
			
		      for (int i = 0; i < penligne.size();i++){
		    	  @SuppressWarnings("deprecation")
				OfflinePlayer poffline = Bukkit.getOfflinePlayer(penligne.get(i).getPlayerName());
		    	  if(!poffline.isOnline()) crea.plugin.getDatabase().delete(penligne);

		       }


				
		}
		
		
		
		
		
		
		
		
		
		
		 public static void taskenligne(){
			  
			 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
						new Runnable() {
							@SuppressWarnings("deprecation")
							public void run() {
								sremovehorligne();
								for (Player pe : Bukkit.getOnlinePlayers()) {
									enligne(pe);
									
								}
								
							}
							
	          }, 0, 60 * 20);
		 }
		 
		 
		 
		 public static void taskremoveeligne(){
			  
			 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
						new Runnable() {
							public void run() {
								sremovehorligne();
								
							}
							
	          }, 0, 600 * 20);
		 } 
	

}
