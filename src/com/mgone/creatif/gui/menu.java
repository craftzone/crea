package com.mgone.creatif.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
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

public class menu  implements Listener {
	
	public static Inventory GUImenu = null;
	static ItemStack currentGUImenuItem = null;
	static List<String> lores = new ArrayList<String>();
	static int shopp = 1;

	
	
	 public static void invtask(){
		  
		  Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.plugin,
					new Runnable() {
						public void run() {

	

							switch(shopp){
							case 1: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §7§lShop §r§a§l\u2605")); shopp++; break;
							case 2: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§l§7§lShop §r§a§l\u2605")); shopp++; break;
							case 3: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§7§lop §r§a§l\u2605")); shopp++; break;
							case 4: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§b§lo§7§lp §r§a§l\u2605")); shopp++; break;
							case 5: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§b§lo§c§lp §r§a§l\u2605")); shopp++; break;
							case 6: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §7§lShop §r§a§l\u2605")); shopp++; break;
							case 7: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§b§lo§c§lp §r§a§l\u2605")); shopp++; break;
							case 8: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §7§lShop §r§a§l\u2605")); shopp++; break;
							case 9: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§b§lo§c§lp §r§a§l\u2605")); shopp++; break;
							case 10: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §7§lShop §r§a§l\u2605")); shopp++; break;
							case 11: GUImenu.setItem(38, makeshop(Material.EMERALD, 1, (short) 0, "§a§l\u2605§r §d§lS§e§lh§b§lo§c§lp §r§a§l\u2605")); shopp = 1; break;
						} 
	
	
	
						}
						
          }, 0, 1 * 10);
	 }
	
	
	 public static ItemStack makeshop(Material material, int amount,
				int shrt, String displayname) {
			ItemStack item = new ItemStack(material, amount, (short) shrt);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(displayname);
			meta.addEnchant(Enchantment.ARROW_FIRE, 10, true);
			item.setItemMeta(meta);
			return utils.removeAttributes(item);
		} 	 
	 
	 
	 
	 
		public static Inventory displayGUImenu()
		 {
			
			 //commandes plotme
			 currentGUImenuItem = new ItemStack(Material.ICE, 1);
		     ItemMeta meta1 = currentGUImenuItem.getItemMeta();
		     meta1.setDisplayName("§5§l\u2726 Commandes Plotme \u2726");
		     currentGUImenuItem.setItemMeta(meta1);
		     GUImenu.setItem(20,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     
		     
			 //commandes generales
			 currentGUImenuItem = new ItemStack(Material.COMMAND, 1);
		     ItemMeta meta2 = currentGUImenuItem.getItemMeta();
		     meta2.setDisplayName("§b§l\u2726 Commande Générales \u2726");
		     currentGUImenuItem.setItemMeta(meta2);
		     GUImenu.setItem(21,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     
		     //Miniblock
			 currentGUImenuItem = new ItemStack(Material.NETHER_BRICK_ITEM, 1);
		     ItemMeta meta22 = currentGUImenuItem.getItemMeta();
		     meta22.setDisplayName("§a§l\u2726 Miniblock \u2726");
		     lores.add("§fUtiliser les MiniBlock");
		     lores.add("§3Décorateur et +");
		     meta22.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta22);
		     GUImenu.setItem(22,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     

		     
		     //pet
		     currentGUImenuItem= new ItemStack(Material.BONE, 1);
		     ItemMeta meta23 = currentGUImenuItem.getItemMeta();
		     meta23.setDisplayName("§5§l\u2663 Pet \u2663");
		     lores.add("§7Modifier, monter votre");
		     lores.add("§7animal de compagnie");
		     lores.add("§8Apprenti et +");
		     meta23.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta23);
		     GUImenu.setItem(23,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     
		     //Déguisement
		   /*  currentGUImenuItem = new ItemStack(Material.PUMPKIN, 1);
		     ItemMeta meta24 = currentGUImenuItem.getItemMeta();
		     meta24.setDisplayName("§d§l\u2663 Déguisement \u2663");
		     lores.add("§7Se déguiser en mob,");
		     lores.add("§7block et joueur:D");
		     lores.add("§9Maçon et +");
		     meta24.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta24);
		     GUImenu.setItem(24,utils.removeAttributes(currentGUImenuItem));
		     lores.clear(); */
		     
		     
		     //worldesit
		     currentGUImenuItem = new ItemStack(Material.WOOD_AXE, 1);
		     ItemMeta meta25 = currentGUImenuItem.getItemMeta();
		     meta25.setDisplayName("§3§l\u2663 WorldEdit \u2663");
		     lores.add("§6Architecte");
		     meta25.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta25);
		     GUImenu.setItem(24,utils.removeAttributes(currentGUImenuItem));
		     lores.clear(); 
		     
		     
		   //block1.8
		    /* currentGUImenuItem = new ItemStack(Material.EMERALD_BLOCK, 1);
		     ItemMeta meta258 = currentGUImenuItem.getItemMeta();
		     meta258.setDisplayName("§d§l\u2663 Block 1.8 \u2663");
		     lores.add("§fVous devez être connecté");
		     lores.add("§fdepuis la version 1.8");
		     meta258.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta258);
		     GUImenu.setItem(31,utils.removeAttributes(currentGUImenuItem));
		     lores.clear(); */
			
			
			//lien
		     currentGUImenuItem = new ItemStack(Material.PAPER, 1);
		     ItemMeta meta36 = currentGUImenuItem.getItemMeta();
		     meta36.setDisplayName("§b§l\u25C6 Informations \u25C6");
		     lores.add("§7Version serveur: §b1.7 - 1.8");
		     lores.add("§7Site web: §bCraftZone.fr");
		     lores.add("§7TeamSpeak: §bts.CraftZone.fr");
		     lores.add("§7Shop en ligne: §bshop.CraftZone.fr");
		     lores.add("§7\u27A1Tous les liens utiles");
		     meta36.setLore(lores);
		     currentGUImenuItem.setItemMeta(meta36);
		     GUImenu.setItem(36,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     
		     
		     //shop
			 currentGUImenuItem = new ItemStack(Material.EMERALD, 1);
		     ItemMeta meta38 = currentGUImenuItem.getItemMeta();
		     meta38.setDisplayName("§a§l\u2605§r §d§lS§e§lh§b§lo§c§lp §r§a§l\u2605");
		     meta38.addEnchant(Enchantment.ARROW_FIRE, 10, true);
		     currentGUImenuItem.setItemMeta(meta38);
		     GUImenu.setItem(38,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     
		     
		     //grades
			 currentGUImenuItem = new ItemStack(Material.DIAMOND, 1);
		     ItemMeta meta42 = currentGUImenuItem.getItemMeta();
		     meta42.setDisplayName("§b§l\u2663 Stats§d§l&§b§lGrades \u2663");
		     meta42.addEnchant(Enchantment.ARROW_FIRE, 10, true);
		     currentGUImenuItem.setItemMeta(meta42);
		     GUImenu.setItem(42,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
			
		     //iron door
			 currentGUImenuItem = new ItemStack(Material.IRON_DOOR, 1);
		     ItemMeta meta44 = currentGUImenuItem.getItemMeta();
		     meta44.setDisplayName("§4§l\u2716 Fermer");
		     currentGUImenuItem.setItemMeta(meta44);
		     GUImenu.setItem(44,utils.removeAttributes(currentGUImenuItem));
		     lores.clear();
		     
		     return GUImenu;
			
			
		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 Player p = null;
		String invetaryname = null;
		
		
		 @EventHandler(priority=EventPriority.MONITOR)
		  public void guiClick(InventoryClickEvent event) {
			 

		   invetaryname = event.getInventory().getName();
		   p = ((Player)event.getWhoClicked());
		   
		   
		   if (!invetaryname.contains("§6\u2739 §d§lCraft§e§lZone §6\u2739")) return;
		   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
		   event.setCancelled(true); 
		      
			 
			 
			 if (event.getCurrentItem().getType() == Material.ICE)
	         {
	           p.closeInventory();
	           p.openInventory(plotcommandes.displayGUIplot());
	         }
			 
			 
			 if (event.getCurrentItem().getType() == Material.COMMAND)
	         {
	           p.closeInventory();
	           p.openInventory(cmdgeneral.displayGUIcmdg());
	         }
			 
			 
			 if (event.getCurrentItem().getType() == Material.NETHER_BRICK_ITEM)
	         {
	           p.closeInventory();
	           p.performCommand("mb");
	         }
			 
			 
			 
			 if (event.getCurrentItem().getType() == Material.BONE)
	         {
	           p.closeInventory();
	           p.openInventory(pet.displaypetmenu());
	         }
			 
			 
			 
			 
			 if (event.getCurrentItem().getType() == Material.EMERALD_BLOCK)
	         {
	           p.closeInventory();
	           if (utils.McVersion(p)) p.openInventory(block_18.display18menu()); else p.sendMessage("§cVous devez être connecté depuis la version 1.8");
	         }
			 
			 
			 
			 
			 if (event.getCurrentItem().getType() == Material.EMERALD)
	         {
	           p.closeInventory();
	           p.openInventory(shop.displayshopmenu());
	         }
			 
			 
			 if (event.getCurrentItem().getType() == Material.DIAMOND)
	         {
	           p.closeInventory();
	           p.openInventory(gradegui.displaygrademenu(p));
	         }
			 
			 
			 
			 if (event.getCurrentItem().getType() == Material.PAPER)
	         {
	           p.closeInventory();
	           p.sendMessage("§4[Règlement] §b==>http://goo.gl/M4RPQk");
	           p.sendMessage("§6[Tutorial] §b==>http://goo.gl/Ahd0Di");
	         }	 
			 
			 
			 if (event.getCurrentItem().getType() == Material.IRON_DOOR)
	         {
	           p.closeInventory();
	           p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 30.0F, 10.0F);	
	         }
			 
			 
		 }
	 
	

}
