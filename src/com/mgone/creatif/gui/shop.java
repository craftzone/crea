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

public class shop implements Listener {
	
	public static Inventory GUIshop = null;
	static ItemStack currentGUIshopItem = null;
	static List<String> lores = new ArrayList<String>();
	Player p = null;
	String invetaryname = null;

	public static Inventory displayshopmenu()
	 {
		
		//Maçon
		currentGUIshopItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)3);
	    ItemMeta meta0 = currentGUIshopItem.getItemMeta();
	    meta0.setDisplayName("§9\u2605 §lMaçon §9\u2605");
	    lores.add("§f-Vous aurez §d3 plots au total");
	    lores.add("§e/p home: §f1 / 2 / 3");
	    lores.add("§e/p add joueur: §fAjouter joueur à votre plot.");
	    lores.add("§e/p remove joueur: §fSupprimer joueur.");
	    lores.add("§e/tpa joueur: §fTp vers un joueur");
	    lores.add("§e/tpahere joueur: §fTp un joueur vers vous");
	    lores.add("§e/p claim: §fclaim la parcelle");
	    lores.add("§flibre sur laquelle tu te trouve");
	    lores.add("§e/ptime: §fMettre le jour et la nuit");
	    lores.add("§f-Accès à la map 2 en tant que spectateur");
	    lores.add("§dPet: §fPoulet/Vache/Cochon/Mouton");
	    lores.add("§5Vous ajoute +30 heures dans vos stats");
	    meta0.setLore(lores);
	    currentGUIshopItem.setItemMeta(meta0);
	    GUIshop.setItem(20,utils.removeAttributes(currentGUIshopItem));
	    lores.clear();
		
	    
	        //Maçon
	  		currentGUIshopItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)9);
	  	    ItemMeta meta1 = currentGUIshopItem.getItemMeta();
	  	    meta1.setDisplayName("§3\u2605 §lDécorateur §3\u2605");
	  	    lores.add("§f-Vous aurez §d6 plots au total");
	  	    lores.add("§c+ Toutes les commandes du Maçon");
	  	    lores.add("§e/p home: §f1 / 2 / 3 / 4 / 5 / 6");
	  	    lores.add("§e/p biome: §faffiche le biome du plot");
	  	    lores.add("§e/p biomelist: §faffiche la liste des biomes dispo.");
	  	    lores.add("§e/p biome 'nom biome': §fchange le biome du plot.");
	  	    lores.add("§f-Vous pouvez activer les baliseset  le Jukebox.");
	  	    lores.add("§f-Vous disposez des mini-blocks.");
	  	    lores.add("§f-Speed vitesse 2 en fly");
	  	    lores.add("§f-Vous pouvez écrire en couleur sur les panneaux.");
	  	    lores.add("§f-Accès à la map 2 et 3 en tant que spectateur.");
	  	    lores.add("§dPet: §fOcelot/Calamar/Loup.");
	  	    lores.add("§5Vous ajoute +80heures et +100000 blocks");
	  	    lores.add("§5posés et cassés.");
	  	    meta1.setLore(lores);
	  	    currentGUIshopItem.setItemMeta(meta1);
	  	    GUIshop.setItem(21,utils.removeAttributes(currentGUIshopItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	   //Electricien
	  		currentGUIshopItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)11);
	  	    ItemMeta meta2 = currentGUIshopItem.getItemMeta();
	  	    meta2.setDisplayName("§1\u2605 §lElectricien §1\u2605");
	  	    lores.add("§f-Vous aurez §d6 plots au total");
	  	    lores.add("§f-Vous aurez §d1 plot de 90x90 sur la map 2");
	  	    lores.add("§c+ Toutes les commandes du Décorateur");
	  	    lores.add("§e/p deny 'pseudo': §finterdir à un joueur d'entrer");
	  	    lores.add("§fdans votre parcelle.");
	  	    lores.add("§e/p undeny 'pseudo': §flever l'interdiction");
	  	    lores.add("§f-Vous avez accès à la §dredstone");
	  	    lores.add("§f-Ouvrir le four, coffres, entonnoir, alambic..."); 
	  	    lores.add("§dPet: §fVillageois/Chauve-souris/Zombie.");
	  	    lores.add("§f-Vous pouvez renommer votre pet");
	  	    lores.add("§5Vous ajoute +80heures et +100000 blocks");
	  	    lores.add("§5posés et cassés et +1.000.000 de déplacement");;
	  	    meta2.setLore(lores);
	  	    currentGUIshopItem.setItemMeta(meta2);
	  	    GUIshop.setItem(22,utils.removeAttributes(currentGUIshopItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	   //Ingnieur
	  		currentGUIshopItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)10);
	  	    ItemMeta meta3 = currentGUIshopItem.getItemMeta();
	  	    meta3.setDisplayName("§b\u2605 §lIngénieur §b\u2605");
	  	    lores.add("§f-Vous aurez §d6 plots au total");
	  	    lores.add("§f-Vous aurez §d2 plot de 90x90 sur la map 2");
	  	    lores.add("§c+ Toutes les commandes de l'Electricien");
	  	    lores.add("§e/p done: §faffiche votre parcelle comme étant finie");
	  	    lores.add("§felle ne peut pas être reset par le plugin.");
	  	    lores.add("§e/back: §fVous téléporter à votre dernière");
	  	    lores.add("§fposition plus rapidement.");
	  	    lores.add("§e/firework: §fVous avez accès aux feux d'artifices."); 
	  	    lores.add("§dPet: §fCreeper/Archer-squelette/Arraignée noire.");
	  	    lores.add("§5Vous ajoute +80heures et +100000 blocks");
	  	    lores.add("§5posés et cassés et +1.000.000 de déplacement");
	  	    meta3.setLore(lores);
	  	    currentGUIshopItem.setItemMeta(meta3);
	  	    GUIshop.setItem(23,utils.removeAttributes(currentGUIshopItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	//Geometre
	  		currentGUIshopItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)4);
	  	    ItemMeta meta4 = currentGUIshopItem.getItemMeta();
	  	    meta4.setDisplayName("§e\u2605 §lGéomètre §e\u2605");
	  	    lores.add("§f-Vous aurez §d6 plots au total");
	  	    lores.add("§f-Vous aurez §d2 plot de 90x90 sur la map 2");
	  	    lores.add("§f-Vous aurez §d1 plot de 150x150 sur la map 3");
	  	    lores.add("§c+ Toutes les commandes de l'Ingenieur");
	  	    lores.add("§f-Bousole: vous avez accès à la boussole de votre");
	  	    lores.add("§finventaire pour vous téléporter en 1 clic.");
	  	    lores.add("§dPet: §fCheval/Arraignée bleue/Blaze.");
	  	    lores.add("§f-Vous pouvez renommer votre pet");
	  	    lores.add("§5Vous ajoute +80heures et +100000 blocks");
	  	    lores.add("§5posés et cassés et +1.000.000 de déplacement");
	  	    meta4.setLore(lores);
	  	    currentGUIshopItem.setItemMeta(meta4);
	  	    GUIshop.setItem(24,utils.removeAttributes(currentGUIshopItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	//plot
	  		currentGUIshopItem = new ItemStack(Material.EXP_BOTTLE);
	  	    ItemMeta meta31 = currentGUIshopItem.getItemMeta();
	  	    meta31.setDisplayName("§a\u2605 §1Plots §3\u2605");
	  	    lores.add("§fAcheter des parcelles supplémentaires");
	  	    meta31.setLore(lores);
	  	    currentGUIshopItem.setItemMeta(meta31);
	  	    GUIshop.setItem(31,utils.removeAttributes(currentGUIshopItem));
	  	    lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	  currentGUIshopItem = new ItemStack(Material.PAPER, 1);
		     ItemMeta meta36 = currentGUIshopItem.getItemMeta();
		     meta36.setDisplayName("§a\u25C6 CGU \u25C6");
		     lores.add("§c\u27A1Un paiement par paypal non vérifié ou/et");
		     lores.add("§csans l'accord des parents sera automatiquement");
		     lores.add("§crembourser et votre achat sera annulé.");
		     lores.add("§6\u27A1Nous nous reservons le droit de vous");
		     lores.add("§6demander le numéro de téléphone du propriétaire");
		     lores.add("§6du compte paypal sans raison et a tout moment.");
		     lores.add("§5\u27A1Si vous avez un soucis, ou vous avez fait une");
		     lores.add("§5erreur pendant l'achat merci de contacter");
		     lores.add("§5un admin ou poster une réclamation sur le forum.");
		     lores.add("§3\u27A1Clic ici pour lire le CGU complet.");
		     meta36.setLore(lores);
		     currentGUIshopItem.setItemMeta(meta36);
		     GUIshop.setItem(36,utils.removeAttributes(currentGUIshopItem));
		     lores.clear();
	  	    
	  	    
	  	    
	  	    
	  	     //wood door
			currentGUIshopItem = new ItemStack(Material.WOOD_DOOR, 1);
		     ItemMeta meta53 = currentGUIshopItem.getItemMeta();
		     meta53.setDisplayName("§c§l\u27A1 Retour");
		     currentGUIshopItem.setItemMeta(meta53);
		     GUIshop.setItem(44,utils.removeAttributes(currentGUIshopItem));
		     lores.clear();
	
	
	    return GUIshop;
	 }
	
	
	
	 @EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		 

	   invetaryname = event.getInventory().getName();
	   p = ((Player)event.getWhoClicked());
	   
	   
	   if (!invetaryname.contains("§d§lS§e§lh§b§lo§c§lp")) return;
	   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
	   event.setCancelled(true); 
	   


		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) && (event.getCurrentItem().getDurability() == 3))
        { 
		  p.sendMessage("§b============================\n" +
		  "§e==>http://shop.craftzone.fr/\n" + 
		  "§b============================");
          p.closeInventory();
        }	 
		 
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) && (event.getCurrentItem().getDurability() == 9))
	        { 
			  p.sendMessage("§b============================\n" +
			  "§e==>http://shop.craftzone.fr/\n" + 
			  "§b============================");
	          p.closeInventory();
	        }	
		 
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) && (event.getCurrentItem().getDurability() == 11))
	        { 
			  p.sendMessage("§b============================\n" +
			  "§e==>http://shop.craftzone.fr/\n" + 
			  "§b============================");
	          p.closeInventory();
	        }
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) && (event.getCurrentItem().getDurability() == 10))
	        { 
			  p.sendMessage("§b============================\n" +
			  "§e==>http://shop.craftzone.fr/\n" + 
			  "§b============================");
	          p.closeInventory();
	        }
		 
		 
		 if ((event.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) && (event.getCurrentItem().getDurability() == 4))
	        { 
			  p.sendMessage("§b============================\n" +
			  "§e==>http://shop.craftzone.fr/\n" + 
			  "§b============================");
	          p.closeInventory();
	        }
		 
		 
		 
		 if (event.getCurrentItem().getType() == Material.EXP_BOTTLE)
        { 
			 p.sendMessage("§b============================\n" +
					  "§e==>http://shop.craftzone.fr/\n" + 
					  "§b============================");
			          p.closeInventory();
        }	 
	   
		 
		 if (event.getCurrentItem().getType() == Material.PAPER)
        { 
		  p.sendMessage("§b============================\n" +
		   "§e==>http://craftzone.fr/cgu/\n" + 
		   "§b============================");
          p.closeInventory();
        }	 
	   
	   
	   
	      
		 
		 if (event.getCurrentItem().getType() == Material.WOOD_DOOR) {
		        p.playSound(p.getLocation(), Sound.DOOR_OPEN, 2.0F, 13.0F);
		        p.closeInventory();
		        p.openInventory(menu.displayGUImenu());
		      }
		 
	 }
	
	
	

}
