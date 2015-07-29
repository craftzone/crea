package com.mgone.creatif.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.mgone.creatif.crea;
import com.mgone.creatif.utils;

public class block_18 implements Listener {
	
	public static Inventory GUI18 = null;
	static ItemStack currentGUI18Item = null;
	static List<String> lores = new ArrayList<String>();
	
	
	Player p = null;
	String invetaryname = null;

	public static Inventory display18menu()
	 {
		
		
		//granite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)1);
	     ItemMeta meta1 = currentGUI18Item.getItemMeta();
	     meta1.setDisplayName("§6§lGranite");
	     currentGUI18Item.setItemMeta(meta1);
	     GUI18.setItem(19,currentGUI18Item);
	     lores.clear();
		
		
	   //Polished Granite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)2);
	     ItemMeta meta2 = currentGUI18Item.getItemMeta();
	     meta2.setDisplayName("§6§lPolished Granite");
	     currentGUI18Item.setItemMeta(meta2);
	     GUI18.setItem(20,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
	     
	     
	   //§6§lDiorite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)3);
	     ItemMeta meta3 = currentGUI18Item.getItemMeta();
	     meta3.setDisplayName("§6§lDiorite");
	     currentGUI18Item.setItemMeta(meta3);
	     GUI18.setItem(21,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
	     
	     
	   //§6§lPolished Diorite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)4);
	     ItemMeta meta4 = currentGUI18Item.getItemMeta();
	     meta4.setDisplayName("§6§lPolished Diorite");
	     currentGUI18Item.setItemMeta(meta4);
	     GUI18.setItem(22,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
	     
	     
	   //§6§lAndesite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)5);
	     ItemMeta meta5 = currentGUI18Item.getItemMeta();
	     meta5.setDisplayName("§6§lAndesitee");
	     currentGUI18Item.setItemMeta(meta5);
	     GUI18.setItem(23,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
	     
	     
	   //§6§lPolished Andesite
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)6);
	     ItemMeta meta6 = currentGUI18Item.getItemMeta();
	     meta6.setDisplayName("§6§lPolished Andesite");
	     currentGUI18Item.setItemMeta(meta6);
	     GUI18.setItem(24,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
	     
	     
	     
	   //§6§lWet Sponge
		 currentGUI18Item = new ItemStack(Material.WOOL, 1, (short)7);
	     ItemMeta meta7 = currentGUI18Item.getItemMeta();
	     meta7.setDisplayName("§6§lWet Sponge");
	     currentGUI18Item.setItemMeta(meta7);
	     GUI18.setItem(25,utils.removeAttributes(currentGUI18Item));
	     lores.clear();
		
	     
	   //wood door
			currentGUI18Item = new ItemStack(Material.WOOD_DOOR, 1);
		     ItemMeta meta53 = currentGUI18Item.getItemMeta();
		     meta53.setDisplayName("§c§l\u27A1 Retour");
		     currentGUI18Item.setItemMeta(meta53);
		     GUI18.setItem(44,utils.removeAttributes(currentGUI18Item));
		     lores.clear();
		
		
		
		
	     return GUI18;
	 }
	
	
	
	
	 @EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		 

	   invetaryname = event.getInventory().getName();
	   p = ((Player)event.getWhoClicked());
	   if (!invetaryname.contains("§5\u2663 Block 1.8 \u2663")) return;
	   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
	   event.setCancelled(true); 
	   
	   
	 
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 1))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:1 1 name:&6&lGranite");
	   

	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 2))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:2 1 name:&6&lPolished_Granite");
	   
	   
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 3))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:3 1 name:&6&lDiorite");
	   
	   
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 4))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:4 1 name:&6&lPolished_Diorite");
	   
	   
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 5))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:5 1 name:&6&lAndesite");
	   
	   
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 6))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " wool:6 1 name:&6&lPolished_Andesite");
	   
	   
	   
	   
	   
	   if ((event.getCurrentItem().getType() == Material.WOOL) && (event.getCurrentItem().getDurability() == 7))
		   crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "give " + p.getName() + " sponge 1 name:&6&lWet_Sponge");
		   
		   
		   
		   
	   p.closeInventory();
		   
	   if (event.getCurrentItem().getType() == Material.WOOD_DOOR) {
	        p.playSound(p.getLocation(), Sound.DOOR_OPEN, 2.0F, 13.0F);
	        p.openInventory(menu.displayGUImenu());
	      }
	   
	   
		
	 }
}
