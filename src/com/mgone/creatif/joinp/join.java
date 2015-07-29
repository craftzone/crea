package com.mgone.creatif.joinp;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.mgone.creatif.crea;
import com.mgone.creatif.utils;
import com.mgone.creatif.gui.Plotexpired;
import com.mgone.creatif.gui.menu;

public class join implements org.bukkit.event.Listener  {
	
	
	 @EventHandler
	  public void onJoin(PlayerJoinEvent event)
	  {
	    Player player = event.getPlayer();
	    
	    
	    player.getInventory().clear();
		@SuppressWarnings("deprecation")
		ItemStack servers2 = new ItemStack(399);
	    ItemMeta serversMeta2 = servers2.getItemMeta();
	    serversMeta2.setDisplayName("§c§l\u25C6 Guide \u25C6");
	    serversMeta2.setLore(Arrays.asList("§a+ Clic droit pour ouvrir +"));
	    servers2.setItemMeta(serversMeta2);
	    player.getInventory().setItem(0, servers2); //(inv being player.getInventory();)
	    
    	if((player.hasPermission("use.qcm")) && !(player.isOp())) {
    		player.teleport(player.getWorld().getSpawnLocation());
    	} 
	    
    	
    	if(player.hasPermission("warn.pub") && crea.pubeur.size() > 0) {
	    	
	    	player.sendMessage("§3==>Joueurs mute pour pub a verifier §ftapez /pub");
	    	
	    }
	    
    	if(!utils.McVersion(player)) player.sendMessage("§4§lChanger en version 1.8 vous pouvez crash a tout moment a cause des block non reconnu");
	  }
	 
	 
	 @EventHandler
	  public void onleave(PlayerQuitEvent event)
	  {
	    Player player = event.getPlayer();
	    if (crea.qcm.containsKey(player.getName())) crea.qcm.remove(player.getName());
	  }
	  
	 @EventHandler
	  public void onlick(PlayerKickEvent event)
	  {
	    Player player = event.getPlayer();
	    if (crea.qcm.containsKey(player.getName())) crea.qcm.remove(player.getName());
	  }
	  
	  
	  
	  	@EventHandler
	    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event)  {
	
	  		Player player = event.getPlayer();
	  		
	  		if(event.getMessage().equals("/quitqcm")) return ;
	  		
	        if (crea.qcm.containsKey(player.getName()) ) { 
   player.sendMessage("§4Vous ne pouvez pas taper des commandes dans le QCM, §aPour quittez le QCM tapez §6/quitqcm"); 
	        	event.setCancelled(true);  }

	    } 
	  
	  	
	  	

		 @EventHandler
		 public void onInteract(PlayerInteractEvent e) {
			  
		if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {		  
			  
		Player p = e.getPlayer();	  

	
		if (p.getItemInHand().getType().equals(Material.NETHER_STAR)) {
			 p.openInventory(menu.displayGUImenu());
			 p.playSound(p.getLocation(), Sound.WOLF_BARK, 30.0F, 10.0F);	
		}
		
		if (p.getItemInHand().getType().equals(Material.CACTUS) && p.hasPermission("plot.exp")) {
			 p.openInventory(Plotexpired.displayEXPmenu());
		}
		
		
		}} 
		
		 

		 

		 
		 
		 

		 

			

}
