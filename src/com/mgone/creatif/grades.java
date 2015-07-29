package com.mgone.creatif;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


public class grades implements org.bukkit.event.Listener {
	
	
	public static void checkgrade(Player p) {
		
		String grade = crea.permission.getPrimaryGroup(p);
		String pname  = p.getName();
		
		if(!stats.timep.containsKey(pname)) return;
		if(grade.contains("visiteur")) return;
		if(grade.contains("architecte")) return;
		if(grade.contains("geometre")) return;
		if(grade.contains("admin")) return;
		if(grade.contains("co-admin")) return;
		if(grade.contains("modo-sup")) return;
		if(grade.contains("modo")) return;
		if(grade.contains("guide")) return;
		if(grade.contains("animateur")) return;
		Double ptime = stats.timep.get(pname);
		
		
		if(grade.contains("apprenti")) {		
			if (ptime >= 108000) { 
		crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup macon");	
		Bukkit.getServer().broadcastMessage("§dFélicitation §6" + p.getName() + " §dest maintenant Maçon!");
		Bukkit.getServer().broadcastMessage("§d@Console: §6Sortez les truelles!");
			}
			
			return;
		}
		
		
		if(!stats.blockplace.containsKey(pname)) return;
		if(!stats.blockbreak.containsKey(pname)) return;
		Double pblockbreak = stats.blockbreak.get(pname);
		Double pblockplace = stats.blockplace.get(pname);
		
		if(grade.contains("macon")) {	
			if ((ptime >= 288000) && (pblockbreak >= 100000) && (pblockplace >= 100000)) { 
		crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup decorateur");	
		Bukkit.getServer().broadcastMessage("§dFélicitation §6" + p.getName() + " §dest maintenant Décorateur!");
		Bukkit.getServer().broadcastMessage("§d@Console: §6La décoration... on y tiens beaucoup ! oui oui oui.");
			}
			
			return;
		}
		
		
		if(!stats.movep.containsKey(pname)) return;
		Double pmove = stats.movep.get(pname);
		
		if(grade.contains("decorateur")) {		
			if (pmove >= 1000000) { 
		crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup electricien");	
		Bukkit.getServer().broadcastMessage("§dFélicitation §6" + p.getName() + " §dest maintenant Electricien!");
		Bukkit.getServer().broadcastMessage("§d@Console: §6'Bziiit' aie ! 'bziiit' aie ! 'bziiit' aie !");
			}
			
			return;
		}
		
		
		
		if(!stats.timepm2.containsKey(pname)) return;
		if(!stats.blockplacem2.containsKey(pname)) return;
		if(!stats.blockbreakm2.containsKey(pname)) return;
		Double ptimem2 = stats.timepm2.get(pname);
		Double pblockbreakm2 = stats.blockbreakm2.get(pname);
		Double pblockplacem2 = stats.blockplacem2.get(pname);
		
		if(grade.contains("electricien")) {		
			if ((ptimem2 >= 90000) && (pblockbreakm2 >= 100000) && (pblockplacem2 >= 100000)) { 
		crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup ingenieur");	
		Bukkit.getServer().broadcastMessage("§dFélicitation §6" + p.getName() + " §dest maintenant Ingénieur!");
		Bukkit.getServer().broadcastMessage("§d@Console: §6Pour les zinzins du créatif 0.o");
			}
			
			return;
		}
		
		if(!stats.movepm2.containsKey(pname)) return;
		Double pmovem2 = stats.movepm2.get(pname);
		
		if(grade.contains("ingenieur")) {		
			if ((ptimem2 >= 180000) && (pmovem2 >= 2000000)) { 
		crea.plugin.getServer().dispatchCommand(crea.plugin.getServer().getConsoleSender(), "perm player " + p.getName() + " setgroup geometre");	
		Bukkit.getServer().broadcastMessage("§dFélicitation §6" + p.getName() + " §dest maintenant Géomètre!");
		Bukkit.getServer().broadcastMessage("§d@Console: §6Fini la truelle, vous portez la cravate =p");
			}
			
			return;
		}

		
		
	}
	
	
	
	
	 public static void taskgrade(){
		  
		 Bukkit.getScheduler().scheduleSyncRepeatingTask(crea.getPluginInstance(),
					new Runnable() {
						@SuppressWarnings("deprecation")
						public void run() {
							
							for (Player pe : Bukkit.getOnlinePlayers()) {
								checkgrade(pe);
							}						
						}
						
          }, 0, 300 * 20);
	 }
	

}
