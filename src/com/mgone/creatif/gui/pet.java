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


public class pet implements Listener {
	
	public static Inventory GUIpet = null;
	static ItemStack currentGUIpetItem = null;
	static List<String> lores = new ArrayList<String>();
	Player p = null;
	String invetaryname = null;

	public static Inventory displaypetmenu()
	 {
		
		//Poulet
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)93);
	    ItemMeta meta0 = currentGUIpetItem.getItemMeta();
	    meta0.setDisplayName("§lPoulet");
	    lores.add("§8Apprenti et +");
	    meta0.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta0);
	    GUIpet.setItem(0,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();

	    
	        //Vache
	  		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)92);
	  	    ItemMeta meta9 = currentGUIpetItem.getItemMeta();
	  	    meta9.setDisplayName("§lVache");
	  	    lores.add("§9Maçon et +");
	  	    meta9.setLore(lores);
	  	    currentGUIpetItem.setItemMeta(meta9);
	  	    GUIpet.setItem(1,utils.removeAttributes(currentGUIpetItem));
	  	    lores.clear();
	    
	    
	    
		//Cochon
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)90);
	    ItemMeta meta1 = currentGUIpetItem.getItemMeta();
	    meta1.setDisplayName("§lCochon");
	    lores.add("§9Maçon et +");
	    meta1.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta1);
	    GUIpet.setItem(2,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    
	    
	    
	    
	        //Mouton
	  		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)91);
	  	    ItemMeta meta10 = currentGUIpetItem.getItemMeta();
	  	    meta10.setDisplayName("§lMouton");
	  	    lores.add("§9Maçon et +");
	  	    meta10.setLore(lores);
	  	    currentGUIpetItem.setItemMeta(meta10);
	  	    GUIpet.setItem(3,utils.removeAttributes(currentGUIpetItem));
	  	    lores.clear();
	    
	  	    
	  	    //Ocelot
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)98);
		    ItemMeta meta12 = currentGUIpetItem.getItemMeta();
		    meta12.setDisplayName("§lOcelot");
		    lores.add("§3Décorateur et +");
		    meta12.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta12);
		    GUIpet.setItem(4,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();  
	  	    
	  	    
		    //Calamar
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)94);
		    ItemMeta meta2x = currentGUIpetItem.getItemMeta();
		    meta2x.setDisplayName("§lCalamar");
		    lores.add("§3Décorateur et +");
		    meta2x.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta2x);
		    GUIpet.setItem(5,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    
		    //Loup
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)95);
		    ItemMeta meta11 = currentGUIpetItem.getItemMeta();
		    meta11.setDisplayName("§lLoup");
		    lores.add("§3Décorateur et +");
		    meta11.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta11);
		    GUIpet.setItem(6,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //Villageois
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)120);
		    ItemMeta meta14 = currentGUIpetItem.getItemMeta();
		    meta14.setDisplayName("§lVillageois");
		    lores.add("§1Electricien et +");
		    meta14.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta14);
		    GUIpet.setItem(7,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
	  	    
		    
		    //Chauve-souris
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)65);
		    ItemMeta meta27 = currentGUIpetItem.getItemMeta();
		    meta27.setDisplayName("§lChauve-souris"); 
		    lores.add("§1Electricien et +");
		    meta27.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta27);
		    GUIpet.setItem(8,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
	  	    
	  	    
	    
	    //Zombie
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)54);
	    ItemMeta meta2 = currentGUIpetItem.getItemMeta();
	    meta2.setDisplayName("§lZombie");
	    lores.add("§1Electricien et +");
	    meta2.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta2);
	    GUIpet.setItem(9,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    

	    
	        //Creeper
	  		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)50);
	  	    ItemMeta meta18 = currentGUIpetItem.getItemMeta();
	  	    meta18.setDisplayName("§lCreeper");
	  	    lores.add("§bIngenieur et +");
	  	    meta18.setLore(lores);
	  	    currentGUIpetItem.setItemMeta(meta18);
	  	    GUIpet.setItem(10,utils.removeAttributes(currentGUIpetItem));
	  	    lores.clear();
	    
	    
	    
	  	    //Squelette
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)51);
		    ItemMeta meta19 = currentGUIpetItem.getItemMeta();
		    meta19.setDisplayName("§lSquelette");
		    lores.add("§bIngenieur et +");
		    meta19.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta19);
		    GUIpet.setItem(11,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
	    
	    
		    //Araignée
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)52);
		    ItemMeta meta20 = currentGUIpetItem.getItemMeta();
		    meta20.setDisplayName("§lAraignée");
		    lores.add("§bIngenieur et +");
		    meta20.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta20);
		    GUIpet.setItem(12,utils.removeAttributes(currentGUIpetItem));
		    lores.clear(); 
		    
		    
		    //Araignée bleu
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)59);
		    ItemMeta meta21 = currentGUIpetItem.getItemMeta();
		    meta21.setDisplayName("§lAraignée bleu");
		    lores.add("§eGéomètre et +");
		    meta21.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta21);
		    GUIpet.setItem(13,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //Cheveaux
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)100);
		    ItemMeta meta15 = currentGUIpetItem.getItemMeta();
		    meta15.setDisplayName("§lCheval");
		    lores.add("§eGéomètre et +");
		    meta15.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta15);
		    GUIpet.setItem(14,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //blaze
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)61);
		    ItemMeta meta13x = currentGUIpetItem.getItemMeta();
		    meta13x.setDisplayName("§lBlaze");
		    lores.add("§eGéomètre et +");
		    meta13x.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta13x);
		    GUIpet.setItem(15,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //enderman
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)58);
		    ItemMeta meta29 = currentGUIpetItem.getItemMeta();
		    meta29.setDisplayName("§lEnderman"); 
		    lores.add("§6Architecte et +");
		    meta29.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta29);
		    GUIpet.setItem(16,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //magma
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)62);
		    ItemMeta meta24 = currentGUIpetItem.getItemMeta();
		    meta24.setDisplayName("§lCube de magma");
		    lores.add("§6Architecte et +");
		    meta24.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta24);
		    GUIpet.setItem(17,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
		    
		    //Silverfish
			currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)60);
		    ItemMeta meta25 = currentGUIpetItem.getItemMeta();
		    meta25.setDisplayName("§lSilverfish"); 
		    lores.add("§6Architecte et +");
		    meta25.setLore(lores);
		    currentGUIpetItem.setItemMeta(meta25);
		    GUIpet.setItem(18,utils.removeAttributes(currentGUIpetItem));
		    lores.clear();
		    
	/*	    
	    
	    //Mushroom
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)96);
	    ItemMeta meta13 = currentGUIpetItem.getItemMeta();
	    meta13.setDisplayName("§lMushroom");
	    lores.add("§dPack Ferme");
	    meta13.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta13);
	    GUIpet.setItem(13,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();

	    
	    //pigeombie
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)57);
	    ItemMeta meta22 = currentGUIpetItem.getItemMeta();
	    meta22.setDisplayName("§lCochon zombie"); 
	    lores.add("§5Pack Monstre");
	    meta22.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta22);
	    GUIpet.setItem(22,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    
	    //slime
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)55);
	    ItemMeta meta23 = currentGUIpetItem.getItemMeta();
	    meta23.setDisplayName("§lSlime");
	    lores.add("§5Pack Monstre");
	    meta23.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta23);
	    GUIpet.setItem(23,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    
	    

	    
	    //Power Creeper
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)50);
	    ItemMeta meta28 = currentGUIpetItem.getItemMeta();
	    meta28.setDisplayName("§lPower Creeper");
	    meta28.addEnchant(Enchantment.ARROW_FIRE, 10, true);
	    lores.add("§cPack Fly");
	    meta28.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta28);
	    GUIpet.setItem(28,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    


	    
	    
	    //Wither
		currentGUIpetItem = new ItemStack(Material.NETHER_STAR);
	    ItemMeta meta36 = currentGUIpetItem.getItemMeta();
	    meta36.setDisplayName("§lWither"); 
	    lores.add("§4Pack Ultimate");
	    meta36.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta36);
	    GUIpet.setItem(36,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    
	    
	    //Golem de fer
		currentGUIpetItem = new ItemStack(Material.PUMPKIN, 1);
	    ItemMeta meta37 = currentGUIpetItem.getItemMeta();
	    meta37.setDisplayName("§lGolem de fer"); 
	    lores.add("§4Pack Ultimate");
	    meta37.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta37);
	    GUIpet.setItem(37,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();
	    
	    
	    //witch
		currentGUIpetItem = new ItemStack(Material.MONSTER_EGG, 1, (short)66);
	    ItemMeta meta38 = currentGUIpetItem.getItemMeta();
	    meta38.setDisplayName("§lWitch"); 
	    lores.add("§4Pack Ultimate");
	    meta38.setLore(lores);
	    currentGUIpetItem.setItemMeta(meta38);
	    GUIpet.setItem(38,utils.removeAttributes(currentGUIpetItem));
	    lores.clear();

	    
	    */
	    
	    
	     
	     //petmenu
	     currentGUIpetItem = new ItemStack(Material.BOOKSHELF, 1);
	     ItemMeta meta45 = currentGUIpetItem.getItemMeta();
	     meta45.setDisplayName("§bPetOptions");
	     lores.add("§fChanger les caractéristiques de votre pet");
	     meta45.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta45);
	     GUIpet.setItem(45,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();

	     //Renommer
	     currentGUIpetItem = new ItemStack(Material.NAME_TAG, 1);
	     ItemMeta meta46 = currentGUIpetItem.getItemMeta();
	     meta46.setDisplayName("§bRenommer votre Pet");
	     lores.add("§fTapez /pet name nom_désirer");
	     meta46.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta46);
	     GUIpet.setItem(46,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	     
	     
	     
	     //Chevaucher
	     currentGUIpetItem = new ItemStack(Material.SADDLE, 1);
	     ItemMeta meta47 = currentGUIpetItem.getItemMeta();
	     meta47.setDisplayName("§bChevaucher votre Pet");
	     lores.add("§fMonter sur votre pet");
	     meta47.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta47);
	     GUIpet.setItem(47,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	     
	     
	     //hat
	     currentGUIpetItem = new ItemStack(Material.IRON_HELMET, 1);
	     ItemMeta meta48 = currentGUIpetItem.getItemMeta();
	     meta48.setDisplayName("§bHat votre Pet");
	     lores.add("§fPorter votre pet sur votre tête");
	     meta48.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta48);
	     GUIpet.setItem(48,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	    
	     
	     //Appelez
	     currentGUIpetItem = new ItemStack(Material.BONE, 1);
	     ItemMeta meta50 = currentGUIpetItem.getItemMeta();
	     meta50.setDisplayName("§bAppeler votre Pet");
	     lores.add("§fAu pieds!");
	     meta50.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta50);
	     GUIpet.setItem(49,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	     
	     
	     //cacher
	     currentGUIpetItem = new ItemStack(Material.ENDER_PEARL, 1);
	     ItemMeta meta50x = currentGUIpetItem.getItemMeta();
	     meta50x.setDisplayName("§bCacher son pet");
	     lores.add("§fC'est l'heure de faire dodo");
	     meta50x.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta50x);
	     GUIpet.setItem(50,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	     
	     
	   //apparaitre
	     currentGUIpetItem = new ItemStack(Material.EYE_OF_ENDER, 1);
	     ItemMeta meta50xx = currentGUIpetItem.getItemMeta();
	     meta50xx.setDisplayName("§bFaire apparaitre son pet");
	     lores.add("§fRéveille toi!");
	     meta50xx.setLore(lores);
	     currentGUIpetItem.setItemMeta(meta50xx);
	     GUIpet.setItem(51,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
	     
	     
	     
	     //supprimer
	     currentGUIpetItem = new ItemStack(Material.STONE_SWORD, 1);
	     ItemMeta meta51 = currentGUIpetItem.getItemMeta();
	     meta51.setDisplayName("§bSupprimer son pet");
	     currentGUIpetItem.setItemMeta(meta51);
	     GUIpet.setItem(52,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();

		
	     //wood door
	    currentGUIpetItem = new ItemStack(Material.WOOD_DOOR, 1);
	     ItemMeta meta53 = currentGUIpetItem.getItemMeta();
	     meta53.setDisplayName("§c§l\u27A1 Retour");
	     currentGUIpetItem.setItemMeta(meta53);
	     GUIpet.setItem(53,utils.removeAttributes(currentGUIpetItem));
	     lores.clear();
		
		return GUIpet;
		
	 }
	
	
	
	
	
	
	 @EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		 

	   invetaryname = event.getInventory().getName();
	   p = ((Player)event.getWhoClicked());
	   if (!invetaryname.contains("§5\u2663 Pet \u2663")) return;
	   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
	   event.setCancelled(true); 
	   
	   
	   //poulet
	   if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 93))
	     {
		   if(p.hasPermission("pet.apprenti")) {
		   crea.permission.playerAdd(p, "echopet.pet.*"); 
	       p.performCommand("pet chicken:baby;&6Pet.de." + p.getName());
	       crea.permission.playerRemove(p, "echopet.pet.*"); 
		   } else { p.sendMessage("§cVous devez avoir le grade Apprenti ou +"); }
	       p.closeInventory();
	     }
	   
	   
	   
	 //vache
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 92))
	     {
	    	 if(p.hasPermission("pet.macon")) {
	       crea.permission.playerAdd(p, "echopet.pet.*"); 
	       p.performCommand("pet cow:baby;&6Pet.de." + p.getName());
	       crea.permission.playerRemove(p, "echopet.pet.*"); 
	       } else { p.sendMessage("§cVous devez avoir le grade Maçon ou +"); }
	       p.closeInventory();
	     }
	   
	   
	   //pig
	   if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 90))
	     {
		   if(p.hasPermission("pet.macon")) {
		   crea.permission.playerAdd(p, "echopet.pet.*"); 
	       p.performCommand("pet pig:baby;&6Pet.de." + p.getName());
	       crea.permission.playerRemove(p, "echopet.pet.*");
	      } else { p.sendMessage("§cVous devez avoir le grade Maçon ou +"); }
	       p.closeInventory();
	     }
	   
	   
	 //mouton
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 91))
	     {
	    	 if(p.hasPermission("pet.macon")) {
	       crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet sheep:baby;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Maçon ou +"); }
	       p.closeInventory();
	     }
	     
	     
	     
	   //ocelot
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 98))
	     {
	    	 if(p.hasPermission("pet.decorateur")) {
	       crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet ocelot:baby;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Décorateur ou +"); }
	       p.closeInventory();
	     }
	     
	   
	   //clamar
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 94))
	     {
	    	 if(p.hasPermission("pet.decorateur")) {
	    	crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet squid;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Décorateur ou +"); }
	       p.closeInventory();
	     }
	     
	     
	   //loup
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 95))
	     {
	    	 if(p.hasPermission("pet.decorateur")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet wolf:baby;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Décorateur ou +"); }
	       p.closeInventory();
	     }
	     
	     
	   //villageois
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 120))
	     {
	    	 if(p.hasPermission("pet.electricien")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet villager:baby;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Electricien ou +"); }
	       p.closeInventory();
	     }
	     
	     
	     
	   //chauve-souris
		   if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 65))
	     {
			   if(p.hasPermission("pet.electricien")) {
			   crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet bat;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
			   } else { p.sendMessage("§cVous devez avoir le grade Electricien ou +"); }
	       p.closeInventory();
	     }
	     
		   
	   //zobmbie
	   if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 54))
	     {  
		   if(p.hasPermission("pet.electricien")) {
		   crea.permission.playerAdd(p, "echopet.pet.*"); 
	       p.performCommand("pet zombie:baby;&6Pet.de." + p.getName());
	       crea.permission.playerRemove(p, "echopet.pet.*"); 
		   } else { p.sendMessage("§cVous devez avoir le grade Electricien ou +"); }
	       p.closeInventory();
	     }	 

	   
	 //Creeper
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 50))
	     {
	    	 if(p.hasPermission("pet.ingenieur")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet creeper;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Ingenieur ou +"); }
	       p.closeInventory();
	     }
	         
	     
	   //skeleton
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 51))
	     {
	    	 if(p.hasPermission("pet.ingenieur")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet skeleton;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*");
	    	 } else { p.sendMessage("§cVous devez avoir le grade Ingenieur ou +"); }
	       p.closeInventory();
	     }    
	     
	     
	   //spider
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 52))
	     {
	    	 if(p.hasPermission("pet.ingenieur")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet spider;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Ingenieur ou +"); }
	       p.closeInventory();
	     }
	     
	     
	   //cavespider
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 59))
	     {
	    	 if(p.hasPermission("pet.geometre")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet cavespider;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*");
	    	 } else { p.sendMessage("§cVous devez avoir le grade Géomètre ou +"); }
	       p.closeInventory();
	     }
	     
	     
	   //cheveaux
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 100))
	     {
	    	 if(p.hasPermission("pet.geometre")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet horse:baby;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Géomètre ou +"); }
	       p.closeInventory();
	     }
	     
	   
	   //blaze
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 61))
	     {
	    	 if(p.hasPermission("pet.geometre")) {
	    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
		   p.performCommand("pet blaze;&6Pet.de." + p.getName());
		   crea.permission.playerRemove(p, "echopet.pet.*"); 
	    	 } else { p.sendMessage("§cVous devez avoir le grade Géomètre ou +"); }
	       p.closeInventory();
	     }
	     
	     
	     
	     
	   //enderman
		   if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 58))
		     {
			   if(p.hasPermission("pet.architecte")) {
			   crea.permission.playerAdd(p, "echopet.pet.*"); 
			   p.performCommand("pet enderman;&6Pet.de." + p.getName());
			   crea.permission.playerRemove(p, "echopet.pet.*"); 
			   } else { p.sendMessage("§cVous devez avoir le grade Architecte ou +"); }
		       p.closeInventory();
		     }
	     
		   
		 //magmacube
		     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 62))
		     {
		    	 if(p.hasPermission("pet.architecte")) {
		    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
			   p.performCommand("pet magmacube:medium;&6Pet.de." + p.getName());
			   crea.permission.playerRemove(p, "echopet.pet.*"); 
		    	 } else { p.sendMessage("§cVous devez avoir le grade Architecte ou +"); }
		       p.closeInventory();
		     }
	     
		     
		   //silverfish
		     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 60))
		     {
		    	 if(p.hasPermission("pet.architecte")) {
		    	 crea.permission.playerAdd(p, "echopet.pet.*"); 
			   p.performCommand("pet silverfish;&6Pet.de." + p.getName());
			   crea.permission.playerRemove(p, "echopet.pet.*"); 
		    	 } else { p.sendMessage("§cVous devez avoir le grade Architecte ou +"); }
		       p.closeInventory();
		     }
		     
		     
		     
	  /*   
	     //vache chapi
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 96))
	     {
		   p.performCommand("pet mushroomcow:baby;&6Pet.de." + p.getName());
	       p.closeInventory();
	     }
	     

	   //pigzombie
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 57))
	     {
		   p.performCommand("pet pigzombie:baby;&6Pet.de." + p.getName());
	       p.closeInventory();
	     }
	     
	   //slime
	     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 55))
	     {
		   p.performCommand("pet slime:medium;&6Pet.de." + p.getName());
	       p.closeInventory();
	     }
	     

		 //POWER Creeper
		     if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 50) && (event.getSlot() == 28))
		     {
			   p.performCommand("pet creeper:power;&6Pet.de." + p.getName());
		       p.closeInventory();
		     }
		   
		     

		 //wither
		     if (event.getCurrentItem().getType() == Material.NETHER_STAR)
		     {
			   p.performCommand("pet wither;&6Pet.de." + p.getName());
		       p.closeInventory();
		     }
		     
	//irongolem
    if (event.getCurrentItem().getType() == Material.PUMPKIN)
    {
	  p.performCommand("pet irongolem;&6Pet.de." + p.getName());
      p.closeInventory();
    }
    
     //witch
    if ((event.getCurrentItem().getType() == Material.MONSTER_EGG) && (event.getCurrentItem().getDurability() == 66))
    {
	  p.performCommand("pet witch;&6Pet.de." + p.getName());
      p.closeInventory();
    }
    */
    
    
	   
	   
	 //petmenu
	   if (event.getCurrentItem().getType() == Material.BOOKSHELF)
	     {
		   p.closeInventory();
	       p.performCommand("pet menu");
	       
	     }
	   
	   
		 //petname
	   if (event.getCurrentItem().getType() == Material.NAME_TAG)
	     {
		   p.closeInventory();
	       p.sendMessage("Tapper la commande /pet name nom que vous voulez , §4Attention: Il est interdit de renommer son Pet avec le nom d`un membre du staff ou ne respectant pas le règlement.");
	       
	     }
	   
	   
	   //ride
	   if (event.getCurrentItem().getType() == Material.SADDLE)
	     {
		   p.closeInventory();
	       p.performCommand("pet ride");
	     }
	   
	 //hat
	   if (event.getCurrentItem().getType() == Material.IRON_HELMET)
	     {
		   p.closeInventory();
	       p.performCommand("pet hat");
	     }
	   
	   
	   
	 //appelez
	   if (event.getCurrentItem().getType() == Material.BONE)
	     {
		   p.closeInventory();   
	       p.performCommand("pet call");
	     }
	   
	   
	   
		 //hide
	   if (event.getCurrentItem().getType() == Material.ENDER_PEARL)
	     {
		   p.closeInventory();  
	       p.performCommand("pet hide");
	     }
	   
	   
	 //show
	   if (event.getCurrentItem().getType() == Material.EYE_OF_ENDER)
	     {
		   p.closeInventory();  
	       p.performCommand("pet show");
	     }
    
	   
	 //show
	   if (event.getCurrentItem().getType() == Material.STONE_SWORD)
	     {
		   p.closeInventory();  
	       p.performCommand("pet remove");
	     }

	   
	   
	   
	    if (event.getCurrentItem().getType() == Material.WOOD_DOOR) {
	        event.setCancelled(true);
	        p.playSound(p.getLocation(), Sound.DOOR_OPEN, 2.0F, 13.0F);
	        p.closeInventory();
	        p.openInventory(menu.displayGUImenu());
	      }
	   
	   
	   
	 }
	
	
	
	

}

