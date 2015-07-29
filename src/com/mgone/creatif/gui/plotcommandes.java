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

import com.mgone.creatif.utils;

public class plotcommandes implements Listener {
	
	public static Inventory GUIplot = null;
	static ItemStack currentGUIplotItem = null;
	static List<String> lores = new ArrayList<String>();
	
	
	public static Inventory displayGUIplot()
	 {
		
		
		

		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)0);
	     ItemMeta meta20 = currentGUIplotItem.getItemMeta();
	     meta20.setDisplayName("§6\u25C6 /plotme auto \u25C6");
	     lores.add("§f- §e/p auto : §fObtenir la parcelle");
	     lores.add("  §flibre la plus proche.");
	     lores.add("§8Apprenti et +");
	     meta20.setLore(lores);
	     currentGUIplotItem.setItemMeta(meta20);
	     GUIplot.setItem(10,utils.removeAttributes(currentGUIplotItem));
	     lores.clear();	
	     
	     

		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)1);
	     ItemMeta meta21 = currentGUIplotItem.getItemMeta();
	     meta21.setDisplayName("§6\u25C6 /plotme home \u25C6");
	     lores.add("§f- §e/p home : §fte téléporte a ta parcelle");
	     lores.add("  §fet /p home:1 , /p home:2 ... si tu as");
	     lores.add("  §fplusieurs parcelles.");
	     lores.add("§8Apprenti et +");
	     meta21.setLore(lores);
	     currentGUIplotItem.setItemMeta(meta21);
	     GUIplot.setItem(11,utils.removeAttributes(currentGUIplotItem));
	     lores.clear();	
	     
	     
	     
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)2);
		ItemMeta meta22 = currentGUIplotItem.getItemMeta();
		meta22.setDisplayName("§6\u25C6 /plotme list \u25C6");
		lores.add("§f- §e/p list : §flistes de tes parcelles.");
		lores.add("§8Apprenti et +");
		meta22.setLore(lores);
		currentGUIplotItem.setItemMeta(meta22);
		GUIplot.setItem(12,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)3);
		ItemMeta meta23 = currentGUIplotItem.getItemMeta();
		meta23.setDisplayName("§6\u25C6 /plotme info \u25C6");
		lores.add("§f- §e/p i : §fAffiche les info de la");
		lores.add("  §fparcelle sur laquelle tu te trouve.");
		lores.add("§8Apprenti et +");
		meta23.setLore(lores);
		currentGUIplotItem.setItemMeta(meta23);
		GUIplot.setItem(13,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)4);
		ItemMeta meta24 = currentGUIplotItem.getItemMeta();
		meta24.setDisplayName("§6\u25C6 /plotme clear \u25C6");
		lores.add("§f- §e/p clear : §fRemettre a 0 son terrain.");
		lores.add("§8Apprenti et +");
		meta24.setLore(lores);
		currentGUIplotItem.setItemMeta(meta24);
		GUIplot.setItem(14,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)5);
		ItemMeta meta25 = currentGUIplotItem.getItemMeta();
		meta25.setDisplayName("§6\u25C6 /plotme tp \u25C6");
		lores.add("§f- §e/p tp A;B : §fse téléporter à une parcelle.");
		lores.add("  §fgrâce à son numéro. Exemple :/p tp -2;0");
		lores.add("§8Apprenti et +");
		meta25.setLore(lores);
		currentGUIplotItem.setItemMeta(meta25);
		GUIplot.setItem(15,utils.removeAttributes(currentGUIplotItem));
		lores.clear();

		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)6);
		ItemMeta meta26 = currentGUIplotItem.getItemMeta();
		meta26.setDisplayName("§6\u25C6 /plotme add joueur \u25C6");
		lores.add("§f- §e/p add joueur : §fAjouter");
		lores.add("  §fun joueur a ta parcelle.");
		lores.add("§9Maçon et +");
		meta26.setLore(lores);
		currentGUIplotItem.setItemMeta(meta26);
		GUIplot.setItem(16,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)7);
		ItemMeta meta29 = currentGUIplotItem.getItemMeta();
		meta29.setDisplayName("§6\u25C6 /plotme remove joueur \u25C6");
		lores.add("§f- §e/p remove joueur : §fSupprimer");
		lores.add("  §fun joueur de ta parcelle.");
		lores.add("§9Maçon et +");
		meta29.setLore(lores);
		currentGUIplotItem.setItemMeta(meta29);
		GUIplot.setItem(19,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)8);
		ItemMeta meta30 = currentGUIplotItem.getItemMeta();
		meta30.setDisplayName("§6\u25C6 /plotme claim \u25C6");
		lores.add("§f- §e/p claim : §fclaim la parcelle libre");
		lores.add("  §fsur laquelle tu te trouve.");
		lores.add("§9Maçon et +");
		meta30.setLore(lores);
		currentGUIplotItem.setItemMeta(meta30);
		GUIplot.setItem(20,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		

		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)9);
		ItemMeta meta31 = currentGUIplotItem.getItemMeta();
		meta31.setDisplayName("§6\u25C6 /plotme biome \u25C6");
		lores.add("§f- §e/p biome : §fAffiche le biome de la");
		lores.add("  §fparcelle sur laquelle tu te trouve.");
		lores.add("§3Décorateur et +");
		meta31.setLore(lores);
		currentGUIplotItem.setItemMeta(meta31);
		GUIplot.setItem(21,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)10);
		ItemMeta meta32 = currentGUIplotItem.getItemMeta();
		meta32.setDisplayName("§6\u25C6 /plotme biomelist \u25C6");
		lores.add("§f- §e/p biomelist : §fAffiche la liste de biomes.");
		lores.add("§3Décorateur et +");
		meta32.setLore(lores);
		currentGUIplotItem.setItemMeta(meta32);
		GUIplot.setItem(22,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)11);
		ItemMeta meta33 = currentGUIplotItem.getItemMeta();
		meta33.setDisplayName("§6\u25C6 /plotme biom \u25C6");
		lores.add("§f- §e/p biome (biome) : §fchange le biome de");
		lores.add("    §fla parcelle sur laquelle tu te trouve.");
		lores.add("§3Décorateur et +");
		meta33.setLore(lores);
		currentGUIplotItem.setItemMeta(meta33);
		GUIplot.setItem(23,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)12);
		ItemMeta meta34 = currentGUIplotItem.getItemMeta();
		meta34.setDisplayName("§6\u25C6 /plotme deny \u25C6");
		lores.add("§f- §e/p deny joueur : §finterdir a un");
		lores.add("  §fjoueur d`entrer dans ta parcelle.");
		lores.add("§1Electricien et +");
		meta34.setLore(lores);
		currentGUIplotItem.setItemMeta(meta34);
		GUIplot.setItem(24,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		currentGUIplotItem = new ItemStack(Material.STAINED_CLAY, 1, (short)13);
		ItemMeta meta35 = currentGUIplotItem.getItemMeta();
		meta35.setDisplayName("§6\u25C6 /plotme undeny \u25C6");
		lores.add("§f- §e/p undeny joueur : §flever l`interdiction");
		lores.add("  §fa un joueur d`entrer dans ta parcelle.");
		lores.add("§1Electricien et +");
		meta35.setLore(lores);
		currentGUIplotItem.setItemMeta(meta35);
		GUIplot.setItem(25,utils.removeAttributes(currentGUIplotItem));
		lores.clear();
		
		
		
	     //wood door
		currentGUIplotItem = new ItemStack(Material.WOOD_DOOR, 1);
	     ItemMeta meta53 = currentGUIplotItem.getItemMeta();
	     meta53.setDisplayName("§c§l\u27A1 Retour");
	     currentGUIplotItem.setItemMeta(meta53);
	     GUIplot.setItem(44,utils.removeAttributes(currentGUIplotItem));
	     lores.clear();
		     

		
		
		return GUIplot;
	 }
	
	
	
	 Player p = null;
		String invetaryname = null;
		
		
		 @EventHandler(priority=EventPriority.MONITOR)
		  public void guiClick(InventoryClickEvent event) {
			 

		   invetaryname = event.getInventory().getName();
		   p = ((Player)event.getWhoClicked());
		   
		   
		   if (!invetaryname.contains("§6\u2739 §d§lCommandes Plotme §6\u2739")) return;
		   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
		   event.setCancelled(true); 
		      
			 
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 0))
	         {
	           p.closeInventory();
	           p.performCommand("p auto");
	         }
			 
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 1))
	         {
	           p.closeInventory();
	           p.performCommand("p home");
	         }
			 
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 2))
	         {
	           p.closeInventory();
	           p.performCommand("p list");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 3))
	         {
	           p.closeInventory();
	           p.performCommand("p i");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 4))
	         {
	           p.closeInventory();
	           p.performCommand("p clear");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 5))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 6))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 7))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 8))
	         {
	           p.closeInventory();
	           p.performCommand("p claim");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 9))
	         {
	           p.closeInventory();
	           p.performCommand("p biome");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 10))
	         {
	           p.closeInventory();
	           p.performCommand("p biomelist");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 11))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 12))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }
			 
			 if ((event.getCurrentItem().getType() == Material.STAINED_CLAY) && (event.getCurrentItem().getDurability() == 13))
	         {
	           //p.closeInventory();
	           //p.performCommand("");
	         }

			 
			 
			    if (event.getCurrentItem().getType() == Material.WOOD_DOOR) {
			        p.playSound(p.getLocation(), Sound.DOOR_OPEN, 2.0F, 13.0F);
			        p.closeInventory();
			        p.openInventory(menu.displayGUImenu());
			      }
			 
			 
		 }
	 
	
	

}
