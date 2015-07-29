package com.mgone.creatif;

import java.text.DateFormat;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.mgone.creatif.database.Pstat;

public class Commandos implements org.bukkit.command.CommandExecutor  {
	
	
	
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
	
		 if ((sender instanceof Player))
		   {  Player player = (Player)sender;
		   
		   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		    
	    
	if (cmd.getName().equalsIgnoreCase("stats"))
	    { 
		
		if (args.length == 0) {	
    	String pname  = player.getName();
		player.sendMessage("§f================================\n"
				+ "          §fStats de §d" + player.getName() + "\n"
				+ "§bTemps de jeux: §6" + utils.calculateTime(stats.timep.get(pname)) + "\n"
				+ "§bBloc cassés: §6" + Math.round(stats.blockbreak.get(pname)) + "\n"
				+ "§bBloc posés: §6" + Math.round(stats.blockplace.get(pname)) + "\n"
				+ "§bDéplacement: §6" + Math.round(stats.movep.get(pname)) + "\n"
				+ "§f================================");
		
		String grade = crea.permission.getPrimaryGroup(player);
		if(grade.contains("visiteur")) return false;
		if(grade.contains("apprenti")) return false;
		if(grade.contains("macon")) return false;
		if(grade.contains("decorateur")) return false;
		
		player.sendMessage("          §fStats de la §d2eme MAP\n"
				+ "§5Temps de jeux: §a" + utils.calculateTime(stats.timepm2.get(pname)) + "\n"
				+ "§5Bloc cassés: §a" + Math.round(stats.blockbreakm2.get(pname)) + "\n"
				+ "§5Bloc posés: §a" + Math.round(stats.blockplacem2.get(pname)) + "\n"
				+ "§5Déplacement: §a" + Math.round(stats.movepm2.get(pname)) + "\n"
				+ "§f================================");
		
		
    	return false;
    	
		} else if (args.length == 1) {
			
		if(!player.hasPermission("stats.other")) {   player.sendMessage("§4Vous n'avez pas la permission!"); return false; }
		
		@SuppressWarnings("deprecation")
		OfflinePlayer player2 = Bukkit.getOfflinePlayer(args[0]);

		if(!player2.isOnline()) {
			 player.sendMessage("§cjoueur invalide ou hors ligne!");
			 player.sendMessage("§6Pour voir les stats d'un joueur hors ligne tapez §a/statsh!");
			 return false;
		}
		
		if(player2.getUniqueId() == null)  { player.sendMessage("§cLa Résolution de l'UUID a échoué, réessayez plus tard!"); return false; }

		Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid",  player2.getUniqueId().toString()).findUnique();
		if(spstat == null){
			 player.sendMessage("§cjoueur invalide ou hors ligne!");
			 player.sendMessage("§6Pour voir les stats d'un joueur hors ligne tapez §a/statsh!");
			 return false;
		}
		String pname2 = player2.getName();
		int nbjoin = spstat.getJoinp();
		double firstjoin = spstat.getFirsjoin();
		double lastjoin = spstat.getLastjoin();
		double lastleave = spstat.getLastleave();
		
		player.sendMessage("§f================================\n"
				+ "          §fStats de §d" + player2.getName() + "\n"
				+ "§bTemps de jeux: §6" + utils.calculateTime(stats.timep.get(pname2)) + "\n"
				+ "§bBloc cassés: §6" + Math.round(stats.blockbreak.get(pname2)) + "\n"
				+ "§bBloc posés: §6" + Math.round(stats.blockplace.get(pname2)) + "\n"
				+ "§bDéplacement: §6" + Math.round(stats.movep.get(pname2)) + "\n"
				+ "§f================================\n"
				+ "§3Première connection: §e" + shortDateFormat.format(firstjoin) + "\n"
				+ "§3Nombre de connections: §e" + nbjoin + "\n"
				+ "§3Dérnière connection: §e" + shortDateFormat.format(lastjoin) + "\n"
				+ "§3Dérnière déconnection: §e" + shortDateFormat.format(lastleave) + "\n"
				+ "§f================================\n");
		
		String grade = crea.permission.getPrimaryGroup((Player) player2);
		if(grade.contains("visiteur")) return false;
		if(grade.contains("apprenti")) return false;
		if(grade.contains("macon")) return false;
		if(grade.contains("decorateur")) return false;
		
		player.sendMessage("          §fStats de la §d2eme MAP\n"
				+ "§5Temps de jeux: §a" + utils.calculateTime(stats.timepm2.get(pname2)) + "\n"
				+ "§5Bloc cassés: §a" + Math.round(stats.blockbreakm2.get(pname2)) + "\n"
				+ "§5Bloc posés: §a" + Math.round(stats.blockplacem2.get(pname2)) + "\n"
				+ "§5Déplacement: §a" + Math.round(stats.movepm2.get(pname2)) + "\n"
				+ "§f================================");
		
		return false;
			
		} else { 
			player.sendMessage("Usage: /stats, /stats <joueur>");
			return false;	
		}
		
	    } //fin stats
	
	
	if (cmd.getName().equalsIgnoreCase("statsh"))
    { 
		
	if (args.length == 1) {		
	if(!player.hasPermission("stats.other")) {   player.sendMessage("§4Vous n'avez pas la permission!"); return false; }	
		

	@SuppressWarnings("deprecation")
	OfflinePlayer player2 = Bukkit.getOfflinePlayer(args[0]);
	
	if(player2.isOnline()) { player.sendMessage("§cLe joueur est en ligne! utilisez §a/stats <joueur>!"); return false; }
	
	if(player2.getUniqueId() == null)  { player.sendMessage("§cLa Résolution de l'UUID a échoué, réessayez plus tard!"); return false; }
	
	Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid",  player2.getUniqueId().toString()).findUnique();
	if(spstat == null) { player.sendMessage("§cjoueur invalide!"); return false; }
	
	String ptime = utils.calculateTime(spstat.getTimep());
	String blocc = String.valueOf(Math.round(spstat.getBlockbreak()));
	String blocp = String.valueOf(Math.round(spstat.getBlockplace()));
	String movep = String.valueOf(Math.round(spstat.getMovep()));
	int nbjoin = spstat.getJoinp();
	double firstjoin = spstat.getFirsjoin();
	double lastjoin = spstat.getLastjoin();
	double lastleave = spstat.getLastleave();
		
	
	player.sendMessage("§f================================\n"
			+ "          §fStats de §d" + spstat.getPlayerName() + "\n"
			+ "§bTemps de jeux: §6" + ptime + "\n"
			+ "§bBloc cassés: §6" + blocc + "\n"
			+ "§bBloc posés: §6" + blocp + "\n"
			+ "§bDéplacement: §6" + movep + "\n"
			+ "§f================================\n"
			+ "§3Première connection: §e" + shortDateFormat.format(firstjoin) + "\n"
			+ "§3Nombre de connections: §e" + nbjoin + "\n"
			+ "§3Dérnière connection: §e" + shortDateFormat.format(lastjoin) + "\n"
			+ "§3Dérnière déconnection: §e" + shortDateFormat.format(lastleave) + "\n"
			+ "§f================================\n");
	
	/*String grade = crea.permission.getPrimaryGroup((Player) player2);
	if(grade.contains("visiteur")) return false;
	if(grade.contains("apprenti")) return false;
	if(grade.contains("macon")) return false;
	if(grade.contains("decorateur")) return false; */
	

	String ptimem2 = utils.calculateTime(spstat.getTimepm2());
	String bloccm2 = String.valueOf(Math.round(spstat.getBlockbreakm2()));
	String blocpm2 = String.valueOf(Math.round(spstat.getBlockplacem2()));
	String movepm2 = String.valueOf(Math.round(spstat.getMovepm2()));
	
	player.sendMessage("          §fStats de la §d2eme MAP\n"
			+ "§5Temps de jeux: §a" + ptimem2 + "\n"
			+ "§5Bloc cassés: §a" + bloccm2 + "\n"
			+ "§5Bloc posés: §a" + blocpm2 + "\n"
			+ "§5Déplacement: §a" + movepm2 + "\n"
			+ "§f================================");
	
	return false;
		
		
	} else { player.sendMessage("Usage:/statsh <joueur>"); return false; }
	
		
    }//fin statsh
	
	 return false;
	
		   }//fin player sender
	
		 if (!(sender instanceof Player)) {
		    	
		if (cmd.getName().equalsIgnoreCase("statsadd"))
		  { 
			
		if (args.length < 3 || args.length > 3) {	sender.sendMessage("arg = 0"); return false; }
			
		if (args.length == 3) {
		@SuppressWarnings("deprecation")
		OfflinePlayer player = Bukkit.getOfflinePlayer(args[0]);
		
		if(player.isOnline()) { 
			
			
			 if (args[1].equalsIgnoreCase("ptime")) {
				 
				 stats.timep.put(args[0], stats.timep.get(args[0])+Double.valueOf(args[2]));
				 ((Player) player).sendMessage(utils.calculateTime(Double.valueOf(args[2])) + " §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pblockp")) { 
				 
				 stats.blockplace.put(args[0], stats.blockplace.get(args[0])+Double.valueOf(args[2]));
				 ((Player) player).sendMessage(Double.valueOf(args[2]) + " Bloc posés §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pblockb")) { 
				 
				 stats.blockbreak.put(args[0], stats.blockbreak.get(args[0])+Double.valueOf(args[2])); 
				 ((Player) player).sendMessage(Double.valueOf(args[2]) + " Bloc cassés §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pmove")) { 
				 
				 stats.movep.put(args[0], stats.movep.get(args[0])+Double.valueOf(args[2])); 
				 ((Player) player).sendMessage(Double.valueOf(args[2]) + " Déplacement §6ajouté a vos stats");
			 }
			
			
			
		} else { 
			
			if(player.getUniqueId() == null)  { sender.sendMessage("§cjoueur invalide"); return false; }
			
			Pstat spstat = crea.plugin.getDatabase().find(Pstat.class).where().ieq("uuid", player.getUniqueId().toString()).findUnique();
			
			if (spstat == null) { sender.sendMessage("§cjoueur invalide"); return false; }
				
			 if (args[1].equalsIgnoreCase("ptime")) {
				 
				 spstat.setTimep(spstat.getTimep()+Double.valueOf(args[2]));
				 crea.plugin.getDatabase().save(spstat);
				 sender.sendMessage(utils.calculateTime(Double.valueOf(args[2])) + " §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pblockp")) { 
				 
				 spstat.setMovep(spstat.getMovep()+Double.valueOf(args[2]));
				 crea.plugin.getDatabase().save(spstat);
				 sender.sendMessage(Math.round(Double.valueOf(args[2])) + " Bloc posés §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pblockb")) { 
				 
				 spstat.setBlockplace(spstat.getBlockplace()+Double.valueOf(args[2]));
				 crea.plugin.getDatabase().save(spstat);
				 sender.sendMessage(Math.round(Double.valueOf(args[2])) + " Bloc cassés §6ajouté a vos stats");
			 }
			 
			 if (args[1].equalsIgnoreCase("pmove")) { 
				 
				 spstat.setBlockbreak(spstat.getBlockbreak()+Double.valueOf(args[2]));
				 crea.plugin.getDatabase().save(spstat);
				 sender.sendMessage(Math.round(Double.valueOf(args[2])) + " Déplacement §6ajouté a vos stats");
			 }
			
			
			
			sender.sendMessage("§cjoueur invalide ou hors ligne"); } //player not online
		

			
		} //fin arg 2
		
	
		  } //fin statsadd
   	
		return false; 	
		    }//fin console sender
		    	

	  
	  
		 return false; 
	  }
	
	
	

}
