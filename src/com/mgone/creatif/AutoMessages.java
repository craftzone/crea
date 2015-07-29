package com.mgone.creatif;

import me.mgone.bossbarapi.BossbarAPI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class AutoMessages {
	
	  public int Interval = 0;
	  public int MessageID = 0;
	  public int number = 0;
	  public int total = 0;
    
	  
	  public int IntervalBossbar = 0;
	  public int BossbarID = 0;
	  public int numberBossbar = 0;
	  public int totalBossbar = 0;
	  
	  
	  public int IntervalTitle = 0;
	  public int TitleID = 0;
	  public int numberTitle = 0;
	  public int totalTitle = 0;
		
		
	
	  
	@SuppressWarnings("deprecation")
	public AutoMessages(final Plugin plugin) {
		
		
		total = plugin.getConfig().getConfigurationSection("messages").getKeys(false).size();
		Interval = plugin.getConfig().getInt("Interval");
          
          Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin,
					new Runnable() {
						public void run() {
							
							if(!plugin.getConfig().getBoolean("EnableAutoMessages")) return;
					        getMessageID();
					        String message = plugin.getConfig().getString("messages." + MessageID + ".message");
					        
					        for (Player p : Bukkit.getOnlinePlayers())
					        {   	
					        	message = message.replace("%player%", p.getName());
					        	message = utils.msgreplace(message);
	      	
					        	if(message != null) p.sendMessage(message);

					        }
							

   
				}
						
          }, 100, Interval * 20);
          
          
          
          
          
        totalBossbar = plugin.getConfig().getConfigurationSection("bossbars").getKeys(false).size();
        IntervalBossbar = plugin.getConfig().getInt("IntervalBossbar");
          
          
          Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin,
					new Runnable() {
						public void run() {
							
							if(!plugin.getConfig().getBoolean("EnableBossbars")) return;
							
							getBossbarID();
					        
					        String bossbar = plugin.getConfig().getString("bossbars." + BossbarID + ".bossbar");
					        
					        
					        for (Player p : Bukkit.getOnlinePlayers())
					        {   	
					        	bossbar = bossbar.replace("%player%", p.getName());
					        	bossbar = utils.msgreplace(bossbar);
					        	int duration = plugin.getConfig().getInt("bossbars." + BossbarID + ".duration");
				        	
					        	if(bossbar != null) BossbarAPI.setBarTimer(p, bossbar , duration);
					        		//BossbarAPI.setMessage(p, bossbar, duration);

					        }
							

 
				}
						
        }, 200, IntervalBossbar * 20);
          
          
          
          
        totalTitle = plugin.getConfig().getConfigurationSection("titles").getKeys(false).size();
  		IntervalTitle = plugin.getConfig().getInt("IntervalTitle");
          
          Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin,
					new Runnable() {
						public void run() {
							
							if(!plugin.getConfig().getBoolean("EnableTitles")) return;
							
							getTitleID();
					        
					        String title = plugin.getConfig().getString("titles." + TitleID + ".title");
					        String subtitle = plugin.getConfig().getString("titles." + TitleID + ".subtitle");
					        int duration = plugin.getConfig().getInt("titles." + TitleID + ".duration");
					        
					        
					        for (Player p : Bukkit.getOnlinePlayers())
					        {   	

					        	title = title.replace("%player%", p.getName());
					        	subtitle = subtitle.replace("%player%", p.getName());
					        	title = utils.msgreplace(title);
					        	subtitle = utils.msgreplace(subtitle);
					        	
					        	
					        	utils.Title(p, title, subtitle, duration);

					        }
							


				}
						
      }, 300, IntervalTitle * 20);
          
          
          
          
          
 
  }
	


	  public void getMessageID()
	  {
	    if (number < total)
	    {
	      if (crea.plugin.getConfig().getString("messages." + number + ".message") != null)
	      {
	    	MessageID = number;
	        number += 1;
	      }
	      else
	      {
	        number += 1;
	        total += 1;
	        getMessageID();
	      }
	    }
	    else
	    {
	      number = 0;
	      total = crea.plugin.getConfig().getConfigurationSection("messages").getKeys(false).size();
	      getMessageID();
	    }
	  }
	  
	  
	  public void getBossbarID()
	  {
	    if (numberBossbar < totalBossbar)
	    {
	      if (crea.plugin.getConfig().getString("bossbars." + numberBossbar + ".bossbar") != null)
	      {
	    	BossbarID = numberBossbar;
	        numberBossbar += 1;
	      }
	      else
	      {
	        numberBossbar += 1;
	        totalBossbar += 1;
	        getBossbarID();
	      }
	    }
	    else
	    {
	      numberBossbar = 0;
	      totalBossbar = crea.plugin.getConfig().getConfigurationSection("bossbars").getKeys(false).size();
	      getBossbarID();
	    }
	  }
	
	  
	  
	  public void getTitleID()
	  {
	    if (numberTitle < totalTitle)
	    {
	      if (crea.plugin.getConfig().getString("titles." + numberTitle + ".title") != null)
	      {
	    	TitleID = numberTitle;
	        numberTitle += 1;
	      }
	      else
	      {
	        numberTitle += 1;
	        totalTitle += 1;
	        getTitleID();
	      }
	    }
	    else
	    {
	      numberTitle = 0;
	      totalTitle = crea.plugin.getConfig().getConfigurationSection("titles").getKeys(false).size();
	      getTitleID();
	    }
	  }
	

}
