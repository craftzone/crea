package com.mgone.creatif.gui;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;














import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.mgone.creatif.MySQL;


public class Plotexpired implements Listener {
	
	
	public static Inventory GUIexp = null;
	static ItemStack cItem = null;
	static List<String> lores = new ArrayList<String>();
	
	
	Player p = null;
	String invetaryname = null;

	public static Inventory displayEXPmenu()
	 {
		GUIexp = Bukkit.createInventory(null, 45, "§5\u2663 Plot Expired \u2663");
		
		ResultSet rs = MySQL.querySQL("SELECT * FROM plotmePlots WHERE expireddate <=  NOW() AND protected = 0 AND world = 'plotworld' ORDER BY expireddate ASC limit 45;");
		cItem = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
		SkullMeta meta = (SkullMeta) cItem.getItemMeta();

 	   try {
				while(rs.next()) {
					Date expiration = rs.getDate("expireddate");
					int idx = rs.getInt("idX");
					int idz = rs.getInt("idZ");
					String owner = rs.getString("owner");
					
					meta.setDisplayName("§9\u2605 "+ owner +" §9\u2605");
					meta.setOwner(owner);
				    lores.add("§7Plot: §e" + idx + ";" + idz);
				    lores.add("§7Expiration: §f" + getDate(expiration));
				    meta.setLore(lores);
				    cItem.setItemMeta(meta);
				    GUIexp.addItem(new ItemStack[] { cItem });
				    lores.clear();
					

					
					
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return GUIexp;
	 }
	
	
	public static String getDate(java.sql.Date expireddate)
	{		
		return expireddate.toString();
	}
	
	
	
	@EventHandler(priority=EventPriority.MONITOR)
	  public void guiClick(InventoryClickEvent event) {
		
		
		
		
		   invetaryname = event.getInventory().getName();
		   p = ((Player)event.getWhoClicked());
		   
		   
		   if (!invetaryname.contains("§5\u2663 Plot Expired \u2663")) return;
		   if ((event.getSlot() < 0) || (event.getSlot() > 53)) return;
		   event.setCancelled(true); 
		   ArrayList<Integer> Aidx= new ArrayList<Integer>();
		   ArrayList<Integer> Aidz= new ArrayList<Integer>();
		   ArrayList<String> Aowner= new ArrayList<String>();
		   int i = 0;
		
		   //ResultSet rs = MySQL.querySQL("SELECT * FROM plotmePlots WHERE expireddate <=  NOW() AND protected == 0 AND world == plotworld ORDER BY expireddate DESC limit 50;");	
		   ResultSet rs = MySQL.querySQL("SELECT * FROM plotmePlots WHERE expireddate <=  NOW() AND protected = 0 AND world = 'plotworld' ORDER BY expireddate ASC limit 45;");

	 	   try {
					while(rs.next()) {
						int idx = rs.getInt("idX");
						int idz = rs.getInt("idZ");
						String owner = rs.getString("owner");
						Aidx.add(idx);
						Aidz.add(idz);
						Aowner.add(owner);
						
					 }
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
		for(i=0; i<Aidx.size(); i++)
   		if (event.getSlot() == i) {
   			if(event.getClick().isLeftClick()) p.performCommand("p tp " + Aidx.get(i) +";"+ Aidz.get(i));
   			if(event.getClick().isRightClick()) p.performCommand("seen " + Aowner.get(i));
		}
		
		p.closeInventory();
		
	}
		 


		

}
