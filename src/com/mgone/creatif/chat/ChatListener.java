package com.mgone.creatif.chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.mgone.creatif.crea;

public class ChatListener implements org.bukkit.event.Listener  {
	

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        if (event.isCancelled()) {
            return;
        }

        Player player = event.getPlayer();

        String message = crea.plugin.getConfig().getString("message-format");
        String chatMessage = event.getMessage();
        
        
        if (crea.qcm.containsKey(player.getName())) { player.sendMessage("§4Vous ne pouvez pas ecrire dans le QCM, §aPour quittez le QCM tapez §6/quitqcm"); event.setCancelled(true);  }



        message = replacePlayerPlaceholders(player, message);
        message = colorize(message);
        
        if(!player.hasPermission("chat.k")) {
            message.replaceAll("&k", "");
        }

        if (player.hasPermission("chat.color")) {
            chatMessage = colorize(chatMessage);
        }

        message = message.replace("%message", "%2$s");

        event.setFormat(message);

        event.setMessage(chatMessage);
        
        helper(chatMessage, player);

    }
	
	
    public String colorize(String string) {
        if (string == null) {
            return "";
        }
        
        return string.replaceAll("&([a-z0-9])", "\u00A7$1");
    }
	
    
    public String replacePlayerPlaceholders(Player player, String format) {

        return format.replaceAll("%prefix", crea.chat.getPlayerPrefix(player))
                .replaceAll("%suffix", crea.chat.getPlayerSuffix(player))
                .replaceAll("%uuid", player.getUniqueId().toString()) // for people who really want UUIDs in chat
                .replaceAll("%player", player.getName())
                .replaceAll("%displayname", player.getDisplayName())
                .replaceAll("%group", crea.chat.getPrimaryGroup(player));
    }

    
    
    
    public void helper(String chatMessage, Player p) {
    	
    	
 
    	if(chatMessage.contains("comment") && chatMessage.contains("macon")) { helpermsg(p); return; }
    	if(chatMessage.contains("comment") && chatMessage.contains("maçon")) { helpermsg(p); return; }
    	
    	if(chatMessage.contains("comment") && chatMessage.contains("decorateur")) { helpermsg(p); return; }
    	
    	if(chatMessage.contains("comment") && chatMessage.contains("electricien")) { helpermsg(p); return; }
    	if(chatMessage.contains("comment") && chatMessage.contains("électricien")) { helpermsg(p); return; }
    	
    	
    	if(chatMessage.contains("comment") && chatMessage.contains("ingenieur")) { helpermsg(p); return; }
    	if(chatMessage.contains("comment") && chatMessage.contains("ingénieur")) { helpermsg(p); return; }
    	
    	
    	if(chatMessage.contains("comment") && chatMessage.contains("geometre")) { helpermsg(p); return; }
    	
    	
    	if(chatMessage.contains("comment") && chatMessage.contains("grade")) { helpermsg(p); return; }
    	
    	
    }
    
    
    public void helpermsg(final Player player) {
    	
         final String grade = crea.permission.getPrimaryGroup(player);
    	
    	
    	
    	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(crea.plugin, new Runnable()
        {
          public void run()
          {
        	  if(grade.contains("apprenti")){
    Bukkit.getServer().broadcastMessage("§6@Console: §d@" + player.getName() + " §6Tout est expliqué dans le Guide§f(étoile du nether)"); }
        	  else if(grade.contains("visiteur")){  Bukkit.getServer().broadcastMessage("§6@Console: §d@" + player.getName() + " §6Tout est expliqué dans le Guide§f(étoile du nether) §cEt surtout fait le QCM tout d'abord §b/qcm"); }
        	  
        	  
          }
        }, 20L);
    	
    }
	

}
