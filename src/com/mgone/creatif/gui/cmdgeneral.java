package com.mgone.creatif.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
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

public class cmdgeneral implements Listener {
	
	public static Inventory GUIcmdg = null;
	static ItemStack currentGUIcmdgItem = null;
	static List<String> lores = new ArrayList<String>();
	
	public static Inventory displayGUIcmdg()
	 {
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)0);
	     ItemMeta meta20 = currentGUIcmdgItem.getItemMeta();
	     meta20.setDisplayName("§6\u25C6 Retour au lobby \u25C6");
	     lores.add("§f- §e/lobby : §fRetour au lobby");
	     lores.add("§7Visiteur et +");
	     meta20.setLore(lores);
	     currentGUIcmdgItem.setItemMeta(meta20);
	     GUIcmdg.setItem(10,utils.removeAttributes(currentGUIcmdgItem));
	     lores.clear();	
	     
	     

		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)1);
	     ItemMeta meta21 = currentGUIcmdgItem.getItemMeta();
	     meta21.setDisplayName("§6\u25C6 Retour au spawn \u25C6");
	     lores.add("§f- §e/spawn : §fRetour au spawn");
	     lores.add("§7Visiteur et +");
	     meta21.setLore(lores);
	     currentGUIcmdgItem.setItemMeta(meta21);
	     GUIcmdg.setItem(11,utils.removeAttributes(currentGUIcmdgItem));
	     lores.clear();	
	     
	     
	     
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)2);
		ItemMeta meta22 = currentGUIcmdgItem.getItemMeta();
		meta22.setDisplayName("§6\u25C6 /list \u25C6");
		lores.add("§f- §e/list : §fListe des joueurs connectés.");
		lores.add("§8Apprenti et +");
		meta22.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta22);
		GUIcmdg.setItem(12,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)3);
		ItemMeta meta23 = currentGUIcmdgItem.getItemMeta();
		meta23.setDisplayName("§6\u25C6 /Stats \u25C6");
		lores.add("§f- §e/Stats : §fVoir vos statistiques");
		lores.add("§8Apprenti et +");
		meta23.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta23);
		GUIcmdg.setItem(13,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)4);
		ItemMeta meta24 = currentGUIcmdgItem.getItemMeta();
		meta24.setDisplayName("§6\u25C6 /clear \u25C6");
		lores.add("§f- §e/ci : §fVider son inventaire.");
		lores.add("§8Apprenti et +");
		meta24.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta24);
		GUIcmdg.setItem(14,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)5);
		ItemMeta meta25 = currentGUIcmdgItem.getItemMeta();
		meta25.setDisplayName("§6\u25C6 /ptime day \u25C6");
		lores.add("§f- §e/ptime : §fMettre le jour.");
		lores.add("  §fPS: le jour sera que pour vous");
		lores.add("  §fet pas pour les autres joueurs");
		lores.add("§9Maçon et +");
		meta25.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta25);
		GUIcmdg.setItem(15,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();

		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)6);
		ItemMeta meta26 = currentGUIcmdgItem.getItemMeta();
		meta26.setDisplayName("§6\u25C6 /ptime night\u25C6");
		lores.add("§f- §e/ptime : §fMettre la nuit.");
		lores.add("  §fPS: la nuit sera que pour vous");
		lores.add("  §fet pas pour les autres joueurs");
		lores.add("§9Maçon et +");
		meta26.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta26);
		GUIcmdg.setItem(16,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)7);
		ItemMeta meta29 = currentGUIcmdgItem.getItemMeta();
		meta29.setDisplayName("§6\u25C6 /speed \u25C6");
		lores.add("§f- §e/speed : §fVitesse 2 en fly");
		lores.add("§3Décorateur et +");
		meta29.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta29);
		GUIcmdg.setItem(19,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)8);
		ItemMeta meta30 = currentGUIcmdgItem.getItemMeta();
		meta30.setDisplayName("§6\u25C6 /tpyes , /tpaccept \u25C6");
		lores.add("§f- §e/tpyes : §faccepter");
		lores.add("  §fune demande de tp.");
		lores.add("§8Apprenti et +");
		meta30.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta30);
		GUIcmdg.setItem(20,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		

		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)9);
		ItemMeta meta31 = currentGUIcmdgItem.getItemMeta();
		meta31.setDisplayName("§6\u25C6 /tpno , /tpdeny \u25C6");
		lores.add("§f- §e/tpno : §fRefuser");
		lores.add("  §fune demande de tp.");
		lores.add("§8Apprenti et +");
		meta31.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta31);
		GUIcmdg.setItem(21,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)10);
		ItemMeta meta32 = currentGUIcmdgItem.getItemMeta();
		meta32.setDisplayName("§6\u25C6 /tpa \u25C6");
		lores.add("§f- §e/tpa joueur : §fDemander un.");
		lores.add("  §ftp vers un joueur.");
		lores.add("§9Maçon et +");
		meta32.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta32);
		GUIcmdg.setItem(22,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)11);
		ItemMeta meta33 = currentGUIcmdgItem.getItemMeta();
		meta33.setDisplayName("§6\u25C6 /tpahere \u25C6");
		lores.add("§f- §e/tpahere joueur : §fDemander un joueur");
		lores.add("  §fpour se tp vers vous.");
		lores.add("§9Maçon et +");
		meta33.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta33);
		GUIcmdg.setItem(23,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)12);
		ItemMeta meta34 = currentGUIcmdgItem.getItemMeta();
		meta34.setDisplayName("§6\u25C6 /back \u25C6");
		lores.add("§f- §e/back : §fvous téléporter à votre");
		lores.add("  §fdernière position plus rapidement.");
		lores.add("§bIngenieur et +");
		meta34.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta34);
		GUIcmdg.setItem(24,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		currentGUIcmdgItem = new ItemStack(Material.STAINED_GLASS, 1, (short)13);
		ItemMeta meta35 = currentGUIcmdgItem.getItemMeta();
		meta35.setDisplayName("§6\u25C6 /helpop \u25C6");
		lores.add("§f- §e/helpop message : §fcontacter un membre du");
		lores.add("  §fstaff sur tous les serveurs.");
		lores.add("§4§lATTENTION: §fa utiliser que en cas §dd'urgence");
		lores.add("§fet lorsque aucun membre du staff est connecté");
		lores.add("§fsur le créatif, §cvous serez sanctionné sévèrement");
		lores.add("§csi vous ne respectez pas ceçi");
		lores.add("§7Visiteur et +");
		meta35.setLore(lores);
		currentGUIcmdgItem.setItemMeta(meta35);
		GUIcmdg.setItem(25,utils.removeAttributes(currentGUIcmdgItem));
		lores.clear();
		
		
		
		
		
	     
	     
	     
	   //wood door
			currentGUIcmdgItem = new ItemStack(Material.WOOD_DOOR, 1);
		     ItemMeta meta53 = currentGUIcmdgItem.getItemMeta();
		     meta53.setDisplayName("§c§l\u27A1 Retour");
		     currentGUIcmdgItem.setItemMeta(meta53);
		     GUIcmdg.setItem(44,utils.removeAttributes(currentGUIcmdgItem));
		     lores.clear();
			     

			
			
			return GUIcmdg;
		
	 }
	
	
	
	
	Player p = null;
	String invetaryname = null;
	
	
	 @EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		 

	   invetaryname = event.getInventory().getName();
	   p = ((Player)event.getWhoClicked());
	   
	   
	   if (!invetaryname.contains("§6\u2739 §d§lCommande Générales §6\u2739")) return;
	   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
	   event.setCancelled(true); 
	      
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 0))
         {
			 
		   ByteArrayOutputStream b = new ByteArrayOutputStream();
		   DataOutputStream out = new DataOutputStream(b);
           p.closeInventory();
           try {
           	   out.writeUTF("Connect");
           	   out.writeUTF("lobby");
           	   } catch (IOException ex) { }
           	   p.sendPluginMessage(crea.plugin, "BungeeCord", b.toByteArray());
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 1))
         {
           p.closeInventory();
           p.performCommand("spawn");
         }
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 2))
         {
           p.closeInventory();
           p.performCommand("list");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 3))
         {
           p.closeInventory();
           p.performCommand("stats");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 4))
         {
           p.closeInventory();
           p.performCommand("ci");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 5))
         {
           p.closeInventory();
           if(p.hasPermission("crea.journuit"))
           crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "ptime day " + p.getName());
           else p.sendMessage("§cVous devez avoir le grade Maçon ou +");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 6))
         {
           p.closeInventory();
           if(p.hasPermission("crea.journuit"))
           crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "ptime night " + p.getName());
           else p.sendMessage("§cVous devez avoir le grade Maçon ou +");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 7))
         {
           p.closeInventory();
           if(p.hasPermission("crea.speed"))
        	crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "speed fly 2 " + p.getName());
           else p.sendMessage("§cVous devez avoir le grade Décorateur ou +");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 8))
         {
           p.closeInventory();
           p.performCommand("tpyes");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 9))
         {
           p.closeInventory();
           p.performCommand("tpno");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 10))
         {
           //p.closeInventory();
           //p.performCommand("");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 11))
         {
           //p.closeInventory();
           //p.performCommand("");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 12))
         {
           p.closeInventory();
           p.performCommand("back");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 13))
         {
           //p.closeInventory();
           //p.performCommand("");
         }
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS) && (event.getCurrentItem().getDurability() == 14))
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
