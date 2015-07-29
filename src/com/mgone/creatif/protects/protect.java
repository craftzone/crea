package com.mgone.creatif.protects;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.mgone.creatif.crea;

public class protect implements org.bukkit.event.Listener  {
	
	
	
	  @EventHandler(priority=org.bukkit.event.EventPriority.NORMAL)
	  public void onBeaconClick(PlayerInteractEvent event)
	  {
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.BEACON) && (!event.getPlayer().hasPermission("beacune.use"))) {
	      event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les beacon a partir du grade décorateur");
	      event.setCancelled(true);
	      return;
	    }
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.CHEST) && (!event.getPlayer().hasPermission("chest.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les coffres dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les coffres a partir du grade électricien");
	      event.setCancelled(true);
	      return;
	    }
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.TRAPPED_CHEST) && (!event.getPlayer().hasPermission("trapchest.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les coffres dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les coffres a partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.ENDER_CHEST) && (!event.getPlayer().hasPermission("enderchest.use"))) {
	    	event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous n'avez pas la permission!");
	        event.setCancelled(true);
	        return;
	      }
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.FURNACE) && (!event.getPlayer().hasPermission("four.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les fours dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les fours partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.BREWING_STAND) && (!event.getPlayer().hasPermission("alambic.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser l'alambic dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les alambic partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.DISPENSER) && (!event.getPlayer().hasPermission("dispenser.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les dispenser dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les dispenser partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }   
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.DROPPER) && (!event.getPlayer().hasPermission("dropper.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les dropper dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les dropper partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }    
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.HOPPER) && (!event.getPlayer().hasPermission("hooper.use"))) {
	    	  if(event.getPlayer().hasPermission("redstone.chat"))  event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser les hooper dans la map 1");
	    	  else event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les hooper partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }   
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.JUKEBOX) && (!event.getPlayer().hasPermission("jukebox.use"))) {
	        event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec le jukebox a partir du grade décorateur");
	        event.setCancelled(true);
	        return;
	      }   
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.ANVIL) && (!event.getPlayer().hasPermission("enchant.use"))) {
	    	event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir a partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }   
	   
	    
	    
	    if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getClickedBlock().getType() == Material.ENCHANTMENT_TABLE) && (!event.getPlayer().hasPermission("enchant.use"))) {
	    	event.getPlayer().sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir a partir du grade électricien");
	        event.setCancelled(true);
	        return;
	      }   
	    
	    
	    
	  }//fin onbeacon
	  
	  
	  
	  @EventHandler
	  public void onBlockBreak(BlockBreakEvent event)
	  {
	    Player player = event.getPlayer();
	    String worldp = event.getPlayer().getWorld().getName();
	    
	    
	    if ((!player.isOp()) && (player.hasPermission("use.qcm"))) {  
	            player.sendMessage("Vous ne pouvez pas construire, Vous devez avoir le grade Apprenti. " +
	            "Tapez " + ChatColor.RED + "/qcm " + ChatColor.RESET + "pour l'avoir");  event.setCancelled(true);
		       return; 
		    }
	    
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.world"))) {
		       if (worldp.equals("world")) event.setCancelled(true);
		    }
	       
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.pixelart"))) {
		       if (worldp.equals("pixelart")) event.setCancelled(true);
		    }
	    
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.plotworld2"))) {
	       if (worldp.equals("plotworld2")) event.setCancelled(true);
	    }
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.plotworld3"))) {
	        if (worldp.equals("plotworld3"))  event.setCancelled(true);
	    }
	 
	  }
	  
	  
	  
	  
	  @EventHandler
	  public void onBlockplace(BlockPlaceEvent event)
	  {
	    Player player = event.getPlayer();
	    String worldp = event.getPlayer().getWorld().getName();
	    
	    if ((!player.isOp()) && (player.hasPermission("use.qcm"))) {
	            player.sendMessage("Vous ne pouvez pas construire, Vous devez avoir le grade Apprenti. " +
	            "Tapez " + ChatColor.RED + "/qcm " + ChatColor.RESET + "pour l'avoir");  event.setCancelled(true); 
		       return; 
		    }
	    
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.world"))) {
		       if (worldp.equals("world")) event.setCancelled(true);
		    }
	       
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.pixelart"))) {
		       if (worldp.equals("pixelart")) event.setCancelled(true);
		    }
	    
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.plotworld2"))) {
	       if (worldp.equals("plotworld2"))  event.setCancelled(true);
	    }
	    
	    if ((!player.isOp()) && (!player.hasPermission("build.plotworld3"))) {
	       if (worldp.equals("plotworld3")) event.setCancelled(true);
	    }
	    
	    
	  }
	  
	  
	  @EventHandler(ignoreCancelled = true, priority = EventPriority.LOWEST)
		public void onPlayerBucketEmpty (PlayerBucketEmptyEvent bucketEvent)
		{
		    Player p = bucketEvent.getPlayer();
		    String worldp = p.getWorld().getName();
		    if (!worldp.equals("pixelart")) return;
		    if(p.isOp()) return;
		    crea.grief.put(p.getName(), p.getName());
		    bucketEvent.setCancelled(true);
		  
		}
	  
	  
	  
	  
	  @EventHandler
	  public void bedrock(BlockBreakEvent event) {
	  Material block = event.getBlock().getType();
	  Player player = event.getPlayer();
	  if (block == Material.BEDROCK) {
	  if(!player.hasPermission("bedrock.use")) {
	  event.setCancelled(true);
	  player.sendMessage(ChatColor.AQUA + "Vous n'avez pas la permission");}
	  }
	  
	  }
	  
	  
	  
	  
	  @EventHandler(priority = EventPriority.HIGH)
	  public void MONSTEREGGS(PlayerInteractEvent event){
	      Player player = event.getPlayer();
	      if (player.isOp() || !((event.getMaterial() == Material.BEDROCK) || (event.getMaterial() == Material.MONSTER_EGG))
	    		  || (event.getMaterial() == Material.FIREWORK) || (event.getMaterial() == Material.COMMAND)) {
	          return;
	      }
	      
	      if(!player.hasPermission("monsteregg.use")) {
	    	  player.sendMessage(ChatColor.AQUA + "Vous n'avez pas la permission");
	          event.setCancelled(true);
	      }

	  }
	  
	  
	  
	  
	  @EventHandler(priority = EventPriority.HIGH)
	  public void redstone(PlayerInteractEvent event){
	      Player player = event.getPlayer();
	      if (player.isOp() || !((event.getMaterial() == Material.REDSTONE) || (event.getMaterial() == Material.REDSTONE_COMPARATOR) || (event.getMaterial() == Material.REDSTONE_COMPARATOR_OFF) 
	    		  || (event.getMaterial() == Material.REDSTONE_COMPARATOR_ON)|| (event.getMaterial() == Material.REDSTONE_TORCH_ON)|| (event.getMaterial() == Material.REDSTONE_TORCH_OFF)   
	    		  || (event.getMaterial() == Material.DIODE)   || (event.getMaterial() == Material.PISTON_BASE)   || (event.getMaterial() == Material.PISTON_STICKY_BASE)   
	    		  
	    		  ) ) {
	          return;
	      }
	      
	      if(!player.hasPermission("redstone.use")) {
	    	  if(player.hasPermission("redstone.chat"))  player.sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser la redstone dans la map 1");
	    	  else player.sendMessage(ChatColor.AQUA + "==>Vous pouvez utiliser la redstone a partir du grade électricien");
	          event.setCancelled(true);
	      }
	  } 
	  
	  
	  
	  @EventHandler(priority = EventPriority.HIGH)
	  public void beacune(PlayerInteractEvent event){
	      Player player = event.getPlayer();
	      if (player.isOp() || !(event.getAction() == Action.RIGHT_CLICK_BLOCK && event.getMaterial() == Material.BEACON )) {
	          return;
	      }
	      
	      if(!player.hasPermission("beacune.use")) {
	    	  player.sendMessage(ChatColor.AQUA + "==>Vous pouvez interagir avec les beacon a partir du grade décorateur");
	          event.setCancelled(true);
	      }

	  }
	  
	  
	  
	  @EventHandler(priority = EventPriority.HIGH)
	  public void raille(PlayerInteractEvent event){
	      Player player = event.getPlayer();
	      if (player.isOp() || !((event.getMaterial() == Material.MINECART) || (event.getMaterial() == Material.RAILS) || (event.getMaterial() == Material.ACTIVATOR_RAIL) 
	    		  || (event.getMaterial() == Material.DETECTOR_RAIL)|| (event.getMaterial() == Material.POWERED_RAIL)|| (event.getMaterial() == Material.BOAT)   
	    		  
	    || (event.getMaterial() == Material.EXPLOSIVE_MINECART) || (event.getMaterial() == Material.HOPPER_MINECART)|| (event.getMaterial() == Material.STORAGE_MINECART)|| (event.getMaterial() == Material.POWERED_MINECART)		  
	    		  
	    		  
	    		  ) ) {
	          return;
	      }
	      
	      
	      if(!player.hasPermission("raille.use")) {
	    	  if(player.hasPermission("redstone.chat"))  player.sendMessage(ChatColor.AQUA + "==>Vous ne pouvez pas utiliser la redstone dans la map 1");
	    	  else player.sendMessage(ChatColor.AQUA + "==>Vous pouvez utiliser la redstone a partir du grade électricien");
	          event.setCancelled(true);
	      }
	      
	      
	  } 
	  
	  
	  @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=false)
	  public void onPlayerDropItem(PlayerDropItemEvent e)
	  {
	    if (e.isCancelled()) { return;
	    }
	    Player p = e.getPlayer();
	    if(!p.hasPermission("drop.use")) {
	      e.setCancelled(true);return; }
	    }
	  
	  
	  
	  @EventHandler
	  public void onDispense(BlockDispenseEvent event) {
	    ItemStack it = event.getItem();
	    Material mat = it.getType();
	    if (mat == Material.POTION || mat == Material.MONSTER_EGG || mat == Material.MONSTER_EGGS || mat == Material.EXP_BOTTLE || mat == Material.FIREBALL || mat == Material.FIREBALL) {
	      event.setCancelled(true);
	    }
	  }
	  
	  
	  
	  @SuppressWarnings("deprecation")
	  @EventHandler
	    public void onjettersnow(PlayerInteractEvent event) {
	      Action action = event.getAction();
	      Player player = event.getPlayer();
	      if ((action == Action.RIGHT_CLICK_AIR) || (action == Action.RIGHT_CLICK_BLOCK) ) {
	        ItemStack it = player.getItemInHand();
	        if ((it.getType() == Material.SNOW_BALL) || (it.getType() == Material.EXP_BOTTLE) || (it.getType() == Material.POTION) || (it.getType() == Material.EYE_OF_ENDER))
	        	
	        	{ event.setCancelled(true); player.sendMessage(ChatColor.AQUA +  "Vous n'avez pas la permission"); 
	        	player.setItemInHand(new ItemStack(0, 1));}



	      }
	    }
	  
	  
	  
	  
	  @SuppressWarnings("deprecation")
	  @EventHandler(priority=EventPriority.HIGH, ignoreCancelled=true)
	    public void onProjectileLaunche(ProjectileLaunchEvent e) {
	    
	  	  if (e.getEntity() instanceof Player) {
	      Player p = (Player)e.getEntity().getShooter();
	      p.sendMessage(ChatColor.AQUA +  "Vous n'avez pas la permission!");
	        e.setCancelled(true); }

	    }
	  
	  
	  
	  
	  @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
	  public void onArrowShoot(EntityShootBowEvent e) {
	    if ((e.getEntity() instanceof Player)) {
	      Player pl = (Player)e.getEntity();
	        e.setCancelled(true);
	        pl.sendMessage(ChatColor.AQUA +  "==>tu est sur un serveur créatif pas sur un serveur pvp, tu trouve pas un peux con ce que tu essaye de faire?");
	    }
	  }
	  
	  
	  @EventHandler
	  public void onBlockSpread(BlockSpreadEvent e)
	  {
		  e.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onBlockIgnite(BlockIgniteEvent e)
	  {
		  e.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onExplosion(EntityExplodeEvent e){
	  e.setCancelled(true);
	  }
	  
	  @EventHandler
	  public void onExplosionPrime(ExplosionPrimeEvent event) {
			if (event.getEntity() instanceof TNTPrimed) {
				event.setCancelled(true);
			}
		}
	  

}
