package com.mgone.creatif.blockg;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;


public class Blockg implements Listener {
	


	@SuppressWarnings("deprecation")
	@EventHandler
	  public void onBlockplace(BlockPlaceEvent event){
		    Block block = event.getBlock();
		    ItemStack item = event.getItemInHand();
		    if(event.isCancelled()) return;
		    if(!item.getItemMeta().hasDisplayName()) return;
		    
		    if(item.getItemMeta().getDisplayName().equals("§6§lGranite")) block.setTypeIdAndData(1, (byte)1, true);
		    if(item.getItemMeta().getDisplayName().equals("§6§lPolished Granite")) block.setTypeIdAndData(1, (byte)2, true);
		    if(item.getItemMeta().getDisplayName().equals("§6§lDiorite")) block.setTypeIdAndData(1, (byte)3, true);
		    if(item.getItemMeta().getDisplayName().equals("§6§lPolished Diorite")) block.setTypeIdAndData(1, (byte)4, true);
		    if(item.getItemMeta().getDisplayName().equals("§6§lAndesite")) block.setTypeIdAndData(1, (byte)5, true);
		    if(item.getItemMeta().getDisplayName().equals("§6§lPolished Andesite")) block.setTypeIdAndData(1, (byte)6, true);
		    
		    if(item.getItemMeta().getDisplayName().equals("§6§lWet Sponge")) block.setTypeIdAndData(19, (byte)1, true);
	
		  
	  }
		     

}
