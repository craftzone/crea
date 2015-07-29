package com.mgone.creatif.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
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
import org.bukkit.inventory.meta.SkullMeta;

import com.mgone.creatif.crea;
import com.mgone.creatif.stats;
import com.mgone.creatif.utils;

public class gradegui implements Listener {
	
	public static Inventory GUIgrade = null;
	static ItemStack currentGUIgradeItem = null;
	static List<String> lores = new ArrayList<String>();
	
	
	Player p = null;
	String invetaryname = null;

	public static Inventory displaygrademenu(Player player)
	 {
		
		GUIgrade = Bukkit.createInventory(null, 45, "§bStats§d&§bGrades");
		
		String grade = crea.permission.getPrimaryGroup(player);
		String pgrade = "Inconnu";
		String pname  = player.getName();
		
		String grademacon ="Aquis";
		
		String gradedecorateur ="Aquis";
		String gradedecorateur1 ="";
		String gradedecorateur2 ="";
		
		String gradeelectricien ="Aquis";
		
		String gradeingenieur ="Aquis";
		String gradeingenieur1 ="";
		String gradeingenieur2 ="";
		
		String gradegeometre ="Aquis";
		String gradegeometre1 ="";
		String gradegeometre2 ="";
		String gradegeometre3 ="";
		
		Double time1 = stats.timep.get(pname);
		long bc1 = Math.round(stats.blockbreak.get(pname));
		long bp1 = Math.round(stats.blockplace.get(pname));
		long move1 = Math.round(stats.movep.get(pname));
		
		Double time2 = stats.timepm2.get(pname);
		long bc2 = Math.round(stats.blockbreakm2.get(pname));
		long bp2 = Math.round(stats.blockplacem2.get(pname));
		long move2 = Math.round(stats.movepm2.get(pname));
		
		if(grade.contains("visiteur") || grade.contains("apprenti")) {
		if((108000 - time1) > 0) grademacon = utils.calculateTime(108000 - time1); else grademacon = "Patientez quelques instants";
		
		if((288000 - time1) > 0) gradedecorateur = utils.calculateTime(288000 - time1); else gradedecorateur = utils.calculateTime(0);
		if((100000-bc1) > 0) gradedecorateur1 = (100000-bc1) + " Bloc cassés"; else gradedecorateur1 ="0 Bloc cassés";
		if((100000-bp1) > 0) gradedecorateur2 = (100000-bp1) + " Bloc posés"; else gradedecorateur2 ="0 Bloc posés";
		
		if((1000000-move1) > 0) gradeelectricien = (1000000-move1) + " Déplacement"; else gradeelectricien = "0 Déplacement";
		
		if((90000 - time2) > 0) gradeingenieur = utils.calculateTime(90000 - time2); else gradeingenieur = utils.calculateTime(0);
		if((100000-bc2) > 0) gradeingenieur1 = (100000-bc2) + " Bloc cassés"; else gradeingenieur1 = "0 Bloc cassés";
		if((100000-bp2) > 0) gradeingenieur2 = (100000-bp2) + " Bloc posés"; else gradeingenieur2 = "0 Bloc posés";
		
		if((180000 - time2) > 0) gradegeometre = utils.calculateTime(180000 - time2); else gradegeometre = utils.calculateTime(0);
		if((100000-bc2) > 0) gradegeometre1 = (100000-bc2) + " Bloc cassés"; else gradegeometre1 = "0 Bloc cassés";
		if((100000-bp2) > 0) gradegeometre2 = (100000-bp2) + " Bloc posés"; else gradegeometre2 = "0 Bloc posés";
		if((2000000-move2) > 0) gradegeometre3 = (2000000-move2) + " Déplacement"; else gradegeometre3 = "0 Déplacement";
		
		pgrade ="Maçon";
		}
		
		
		if(grade.contains("macon")) {

			if((288000 - time1) > 0) gradedecorateur = utils.calculateTime(288000 - time1); else gradedecorateur = utils.calculateTime(0);
			if((100000-bc1) > 0) gradedecorateur1 = (100000-bc1) + " Bloc cassés"; else gradedecorateur1 ="0 Bloc cassés";
			if((100000-bp1) > 0) gradedecorateur2 = (100000-bp1) + " Bloc posés"; else gradedecorateur2 ="0 Bloc posés";
			
			if((1000000-move1) > 0) gradeelectricien = (1000000-move1) + " Déplacement"; else gradeelectricien = "0 Déplacement";
			
			if((90000 - time2) > 0) gradeingenieur = utils.calculateTime(90000 - time2); else gradeingenieur = utils.calculateTime(0);
			if((100000-bc2) > 0) gradeingenieur1 = (100000-bc2) + " Bloc cassés"; else gradeingenieur1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradeingenieur2 = (100000-bp2) + " Bloc posés"; else gradeingenieur2 = "0 Bloc posés";
			
			if((180000 - time2) > 0) gradegeometre = utils.calculateTime(180000 - time2); else gradegeometre = utils.calculateTime(0);
			if((100000-bc2) > 0) gradegeometre1 = (100000-bc2) + " Bloc cassés"; else gradegeometre1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradegeometre2 = (100000-bp2) + " Bloc posés"; else gradegeometre2 = "0 Bloc posés";
			if((2000000-move2) > 0) gradegeometre3 = (2000000-move2) + " Déplacement"; else gradegeometre3 = "0 Déplacement";
			
			pgrade ="Décorateur";
			}
		
		
		
		if(grade.contains("decorateur")) {
			
			if((1000000-move1) > 0) gradeelectricien = (1000000-move1) + " Déplacement"; else gradeelectricien = "0 Déplacement";
			
			if((90000 - time2) > 0) gradeingenieur = utils.calculateTime(90000 - time2); else gradeingenieur = utils.calculateTime(0);
			if((100000-bc2) > 0) gradeingenieur1 = (100000-bc2) + " Bloc cassés"; else gradeingenieur1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradeingenieur2 = (100000-bp2) + " Bloc posés"; else gradeingenieur2 = "0 Bloc posés";
			
			if((180000 - time2) > 0) gradegeometre = utils.calculateTime(180000 - time2); else gradegeometre = utils.calculateTime(0);
			if((100000-bc2) > 0) gradegeometre1 = (100000-bc2) + " Bloc cassés"; else gradegeometre1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradegeometre2 = (100000-bp2) + " Bloc posés"; else gradegeometre2 = "0 Bloc posés";
			if((2000000-move2) > 0) gradegeometre3 = (2000000-move2) + " Déplacement"; else gradegeometre3 = "0 Déplacement";
			
			pgrade ="Electricien";
			}
		
		
		
		
if(grade.contains("electricien")) {
			
			if((90000 - time2) > 0) gradeingenieur = utils.calculateTime(90000 - time2); else gradeingenieur = utils.calculateTime(0);
			if((100000-bc2) > 0) gradeingenieur1 = (100000-bc2) + " Bloc cassés"; else gradeingenieur1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradeingenieur2 = (100000-bp2) + " Bloc posés"; else gradeingenieur2 = "0 Bloc posés";
			
			if((180000 - time2) > 0) gradegeometre = utils.calculateTime(180000 - time2); else gradegeometre = utils.calculateTime(0);
			if((100000-bc2) > 0) gradegeometre1 = (100000-bc2) + " Bloc cassés"; else gradegeometre1 = "0 Bloc cassés";
			if((100000-bp2) > 0) gradegeometre2 = (100000-bp2) + " Bloc posés"; else gradegeometre2 = "0 Bloc posés";
			if((2000000-move2) > 0) gradegeometre3 = (2000000-move2) + " Déplacement"; else gradegeometre3 = "0 Déplacement";
			
			pgrade ="Ingénieur";
			}



if(grade.contains("ingenieur")) {
	
	if((180000 - time2) > 0) gradegeometre = utils.calculateTime(180000 - time2); else gradegeometre = utils.calculateTime(0);
	if((100000-bc2) > 0) gradegeometre1 = (100000-bc2) + " Bloc cassés"; else gradegeometre1 = "0 Bloc cassés";
	if((100000-bp2) > 0) gradegeometre2 = (100000-bp2) + " Bloc posés"; else gradegeometre2 = "0 Bloc posés";
	if((2000000-move2) > 0) gradegeometre3 = (2000000-move2) + " Déplacement"; else gradegeometre3 = "0 Déplacement";
	
	pgrade ="Géomètre";
	}
		
if(grade.contains("geometre")) { pgrade ="Architecte"; }
		
		//Maçon
		currentGUIgradeItem = new ItemStack(Material.CARPET, 1, (short)3);
	    ItemMeta meta0 = currentGUIgradeItem.getItemMeta();
	    meta0.setDisplayName("§9\u2605 §lMaçon §9\u2605");
	    lores.add("§7Requis: §f30 heures de jeux sur le créatif.");
	    lores.add("§7Passage dans: §e" + grademacon);
	    meta0.setLore(lores);
	    currentGUIgradeItem.setItemMeta(meta0);
	    GUIgrade.setItem(20,utils.removeAttributes(currentGUIgradeItem));
	    lores.clear();
		
	    
	        //deco
	  		currentGUIgradeItem = new ItemStack(Material.CARPET, 1, (short)9);
	  	    ItemMeta meta1 = currentGUIgradeItem.getItemMeta();
	  	    meta1.setDisplayName("§3\u2605 §lDécorateur §3\u2605");
	  	    lores.add("§7Requis: §f80 heures de jeux sur le créatif");
	  	    lores.add("§f100.000 blocks posés ET cassés §a(Map 1)");
	  	    lores.add("§7Passage dans: §e" + gradedecorateur);
	  	    if(!gradedecorateur.equalsIgnoreCase("Aquis")) {
	  	    lores.add("§e" + gradedecorateur1);
	  	    lores.add("§e" + gradedecorateur2);
	  	    }
	  	    meta1.setLore(lores);
	  	    currentGUIgradeItem.setItemMeta(meta1);
	  	    GUIgrade.setItem(21,utils.removeAttributes(currentGUIgradeItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	   //Electricien
	  		currentGUIgradeItem = new ItemStack(Material.CARPET, 1, (short)11);
	  	    ItemMeta meta2 = currentGUIgradeItem.getItemMeta();
	  	    meta2.setDisplayName("§1\u2605 §1Electricien §1\u2605");
	  	    lores.add("§7Requis: §fAvoir le grade décorateur");
	  	    lores.add("§f1.000.000 de déplacement. §a(Map 1)");
	  	    lores.add("§7Passage dans: §e" + gradeelectricien);
	  	    meta2.setLore(lores);
	  	    currentGUIgradeItem.setItemMeta(meta2);
	  	    GUIgrade.setItem(22,utils.removeAttributes(currentGUIgradeItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	   //Ingnieur
	  		currentGUIgradeItem = new ItemStack(Material.CARPET, 1, (short)10);
	  	    ItemMeta meta3 = currentGUIgradeItem.getItemMeta();
	  	    meta3.setDisplayName("§b\u2605 §bIngénieur §b\u2605");
	  	    lores.add("§7Requis: §f25 heures de jeux sur le créatif");
	  	    lores.add("§fet 100.000 blocks posés/cassés §b(Map 2)");
	  	    lores.add("§7Passage dans: §e" + gradeingenieur);
	  	  if(!gradeingenieur.equalsIgnoreCase("Aquis")) {
		  	    lores.add("§e" + gradeingenieur1);
		  	    lores.add("§e" + gradeingenieur2);
		  	    }
	  	    meta3.setLore(lores);
	  	    currentGUIgradeItem.setItemMeta(meta3);
	  	    GUIgrade.setItem(23,utils.removeAttributes(currentGUIgradeItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	//Geometre
	  		currentGUIgradeItem = new ItemStack(Material.CARPET, 1, (short)4);
	  	    ItemMeta meta4 = currentGUIgradeItem.getItemMeta();
	  	    meta4.setDisplayName("§3\u2605 §1Géomètre §3\u2605");
	  	    lores.add("§7Requis: §f50 heures de jeux sur le créatif");
	  	    lores.add("§fet 100.000 blocks posés/cassés.");
	  	    lores.add("§fet 2.000.000 de déplacement. §b(Map 2)");
	  	    lores.add("§7Passage dans: §e" + gradegeometre);
	  	  if(!gradegeometre.equalsIgnoreCase("Aquis")) {
		  	    lores.add("§e" + gradegeometre1);
		  	    lores.add("§e" + gradegeometre2);
		  	    lores.add("§e" + gradegeometre3);
		  	    }
	  	    meta4.setLore(lores);
	  	    currentGUIgradeItem.setItemMeta(meta4);
	  	    GUIgrade.setItem(24,utils.removeAttributes(currentGUIgradeItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	  currentGUIgradeItem = new ItemStack(Material.PAPER, 1);
		     ItemMeta meta36 = currentGUIgradeItem.getItemMeta();
		     meta36.setDisplayName("§a\u25C6 Avantages des Grades \u25C6");
		     lores.add("§3\u27A1Clic ici pour voir les détails.");
		     meta36.setLore(lores);
		     currentGUIgradeItem.setItemMeta(meta36);
		     GUIgrade.setItem(37,utils.removeAttributes(currentGUIgradeItem));
		     lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	    
	  	    
	  	    
	  	     currentGUIgradeItem = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
	  	     SkullMeta meta42 = (SkullMeta) currentGUIgradeItem.getItemMeta();
		     meta42.setDisplayName("§b§l\u25C6 " + player.getName() + " \u25C6");
		     meta42.setOwner(pname);
		     lores.add("§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=");
		     lores.add("§7Temps: §e" + utils.calculateTime(stats.timep.get(pname)));
		     lores.add("§7Bloc cassés: §e" + bc1);
		     lores.add("§7Bloc posés: §e" + bp1);
		     lores.add("§7Déplacement: §e" + move1);
		     lores.add("§7Grade: §e" + grade);
		     lores.add("§7Grade suivant: §e" + pgrade);
		     lores.add("§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=");
		     if((grade.contains("electricien")) || (grade.contains("ingenieur")) ||
						(grade.contains("geometre")) || (grade.contains("architecte")) || 
						(grade.contains("animateur")) || (grade.contains("guide")) || 
						(grade.contains("modo")) || (grade.contains("modo-sup")) || 
						(grade.contains("co-admin")) || (grade.contains("admin"))) {
		     lores.add("§fStats de la §d2eme MAP");
		     lores.add("§7Temps: §e" + utils.calculateTime(stats.timepm2.get(pname)));
		     lores.add("§7Bloc cassés: §e" + bc2);
		     lores.add("§7Bloc posés: §e" + bp2);
		     lores.add("§7Déplacement: §e" + move2);
		     lores.add("§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6=§a=§6="); }
		     meta42.setLore(lores);
		     currentGUIgradeItem.setItemMeta(meta42);
		     GUIgrade.setItem(42,currentGUIgradeItem);
		     lores.clear();
	  	    
	  	    
	  	    
	  	     //wood door
			currentGUIgradeItem = new ItemStack(Material.WOOD_DOOR, 1);
		     ItemMeta meta53 = currentGUIgradeItem.getItemMeta();
		     meta53.setDisplayName("§c§l\u27A1 Retour");
		     currentGUIgradeItem.setItemMeta(meta53);
		     GUIgrade.setItem(44,utils.removeAttributes(currentGUIgradeItem));
		     lores.clear();
	
	
	    return GUIgrade;
	 }
	
	
	@EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		 

	   invetaryname = event.getInventory().getName();
	   p = ((Player)event.getWhoClicked());
	   
	   
	   if (!invetaryname.contains("§bStats§d&§bGrades")) return;
	   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
	   event.setCancelled(true); 
	   
	   
	   if (event.getCurrentItem().getType() == Material.WOOD_DOOR) {
	        event.setCancelled(true);
	        p.playSound(p.getLocation(), Sound.DOOR_OPEN, 2.0F, 13.0F);
	        p.closeInventory();
	        p.openInventory(menu.displayGUImenu()); }
	    
	        else if(event.getCurrentItem().getType() == Material.PAPER)
	        { 
	            p.closeInventory();
	            p.openInventory(shop.displayshopmenu());

	        
	      } else {
	    	p.closeInventory();  
	    	p.openInventory(displaygrademenu(p)); 
	      }
	   
	   
	}
	
	

}
