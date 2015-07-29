package com.mgone.creatif;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitScheduler;

public class signs implements org.bukkit.event.Listener  {
	BukkitScheduler scheduler = Bukkit.getServer().getScheduler();	
	
	  @EventHandler
		public void signuse(PlayerInteractEvent e){		

			if (e.getAction() == Action.RIGHT_CLICK_BLOCK){
				final Player p = e.getPlayer();
				Block block = e.getClickedBlock();
				BlockState state = block.getState();
						
				if (state instanceof Sign){
					Sign sign  = (Sign)state;
						
						
						if (sign.getLine(0).equalsIgnoreCase(ChatColor.GREEN + "[Apprenti]")) {
							if(p.hasPermission("use.qcm")) {
						crea.qcm.remove(p.getName());
						crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup apprenti");
						crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "spawn " + p.getName());
						
						final Location loc = p.getLocation();
						Firework firework = p.getWorld().spawn(loc, Firework.class);
						FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
						data.addEffects(FireworkEffect.builder().withColor(Color.AQUA).with(Type.BALL_LARGE).build());
						data.setPower(1);
						firework.setFireworkMeta(data);
						
						scheduler.scheduleSyncDelayedTask(crea.plugin, new Runnable() {
					        @Override
					        public void run() {
					        	
								Firework firework2 = p.getWorld().spawn(loc, Firework.class);
								FireworkMeta data2 = (FireworkMeta) firework2.getFireworkMeta();
								data2.addEffects(FireworkEffect.builder().withColor(Color.FUCHSIA).with(Type.CREEPER).build());
								data2.setPower(1);
								firework2.setFireworkMeta(data2);

					        }
					    },10L);
						
					    
					    
						  scheduler.scheduleSyncDelayedTask(crea.plugin, new Runnable() {
					        @Override
					        public void run() {
					        	
								Firework firework2 = p.getWorld().spawn(loc, Firework.class);
								FireworkMeta data2 = (FireworkMeta) firework2.getFireworkMeta();
								data2.addEffects(FireworkEffect.builder().withColor(Color.GREEN).with(Type.CREEPER).build());
								data2.setPower(1);
								firework2.setFireworkMeta(data2);

					        }
					    },20L);
					    

						    scheduler.scheduleSyncDelayedTask(crea.plugin, new Runnable() {
					        @Override
					        public void run() {
					        	
								Firework firework2 = p.getWorld().spawn(loc, Firework.class);
								FireworkMeta data2 = (FireworkMeta) firework2.getFireworkMeta();
								data2.addEffects(FireworkEffect.builder().withColor(Color.PURPLE).with(Type.STAR).build());
								data2.setPower(1);
								firework2.setFireworkMeta(data2);

					        }
					    },30L);
					    

					    
						   scheduler.scheduleSyncDelayedTask(crea.plugin, new Runnable() {
					        @Override
					        public void run() {
					        	
								Firework firework2 = p.getWorld().spawn(loc, Firework.class);
								FireworkMeta data2 = (FireworkMeta) firework2.getFireworkMeta();
								data2.addEffects(FireworkEffect.builder().withColor(Color.BLUE).with(Type.BURST).build());
								data2.setPower(1);
								firework2.setFireworkMeta(data2);

					        }
					    },40L);

						
						Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "Félicitation " + ChatColor.GOLD + p.getName() + ChatColor.AQUA + " est maintenant Apprenti");
						Bukkit.getServer().broadcastMessage("§d@Console: §6Tu seras sur-exploité/sous-payé.");
						
							} else p.sendMessage("euh vous avez déja réussis le QCM..."); 
						}  
						
						
						
						
						
						
						if (sign.getLine(0).equalsIgnoreCase(ChatColor.RED + "[Règlement]"))
							p.sendMessage(ChatColor.AQUA + "==>http://goo.gl/M4RPQk");
						
						if (sign.getLine(0).equalsIgnoreCase(ChatColor.GOLD + "[Tutorial]"))
							p.sendMessage(ChatColor.AQUA + "==>http://goo.gl/Ahd0Di");
					
						
				}
				
			}
			
	}
	  
	  
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onSignChange(SignChangeEvent event)
	  {
	    if (!event.isCancelled()) {
	      SignChangeEvent sign = event;
	      Player player = event.getPlayer();
	      if (sign.getLine(0).equalsIgnoreCase(ChatColor.RED + "[Règlement]") && !player.hasPermission("signs.create"))
	      {
	        player.sendMessage(ChatColor.RED + "quesque tu fou!!");
	        event.setCancelled(true);
	        sign.getBlock().breakNaturally();
	        return;
	      }
	    }
	    
	    if (!event.isCancelled()) {
	        SignChangeEvent sign = event;
	        Player player = event.getPlayer();
	        if (sign.getLine(0).equalsIgnoreCase(ChatColor.GOLD + "[Tutorial]") && !player.hasPermission("signs.create"))
	        {
	          player.sendMessage(ChatColor.RED + "quesque tu fou!!");
	          event.setCancelled(true);
	          sign.getBlock().breakNaturally();
	          return;
	        }
	      }
	    
	    if (!event.isCancelled()) {
	        SignChangeEvent sign = event;
	        Player player = event.getPlayer();
	        if (sign.getLine(0).equalsIgnoreCase(ChatColor.GREEN + "[Apprenti]") && !player.hasPermission("signs.create"))
	        {
	          player.sendMessage(ChatColor.RED + "quesque tu fou!!");
	          event.setCancelled(true);
	          sign.getBlock().breakNaturally();
	          return;
	        }
	      }
	    
	  }
	

}
