package com.mgone.creatif;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.persistence.PersistenceException;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.scheduler.BukkitScheduler;

import com.mgone.creatif.blockg.Blockg;
import com.mgone.creatif.chat.ChatListener;
import com.mgone.creatif.database.Ipcheck;
import com.mgone.creatif.database.Penligne;
import com.mgone.creatif.database.Pstat;
import com.mgone.creatif.gui.Plotexpired;
import com.mgone.creatif.gui.block_18;
import com.mgone.creatif.gui.cmdgeneral;
import com.mgone.creatif.gui.gradegui;
import com.mgone.creatif.gui.menu;
import com.mgone.creatif.gui.pet;
import com.mgone.creatif.gui.plotcommandes;
import com.mgone.creatif.gui.shop;
import com.mgone.creatif.joinp.join;
import com.mgone.creatif.joinp.joindb;
import com.mgone.creatif.protects.antitab;
import com.mgone.creatif.protects.border;
import com.mgone.creatif.protects.protect;


public class crea extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
{
	public static Permission permission = null;
	BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
	long timeStartup;
	boolean usePermissions = false;
	public static Plugin plugin;
	public static Chat chat = null;
	public static HashMap<String, Location> cheateur = new HashMap<String, Location>();
	public static HashMap<String, String> pubeur = new HashMap<String, String>();
	public static HashMap<String, String> qcm = new HashMap<String, String>();
	public static HashMap<String, String> grief = new HashMap<String, String>();
	
	
	
	

	
	  int x1 = getConfig().getInt("splotworld2.x");
	  int y1 = getConfig().getInt("splotworld2.y");
	  int z1 = getConfig().getInt("splotworld2.z");
	  int p1 = getConfig().getInt("splotworld2.p");
	  
	  int x2 = getConfig().getInt("splotworld3.x");
	  int y2 = getConfig().getInt("splotworld3.y");
	  int z2 = getConfig().getInt("splotworld3.z");
	  int p2 = getConfig().getInt("splotworld3.p");
	  
	  int x3 = getConfig().getInt("slobby.x");
	  int y3 = getConfig().getInt("slobby.y");
	  int z3 = getConfig().getInt("slobby.z");
	  int p3 = getConfig().getInt("slobby.p");
	  
	  
	  int x4 = getConfig().getInt("spixelart.x");
	  int y4 = getConfig().getInt("spixelart.y");
	  int z4 = getConfig().getInt("spixelart.z");
	  int p4 = getConfig().getInt("spixelart.p");
	  
	  
	  
	  int x1a = getConfig().getInt("s2plotworld.x");
	  int y1a = getConfig().getInt("s2plotworld.y");
	  int z1a = getConfig().getInt("s2plotworld.z");
	  int p1a = getConfig().getInt("s2plotworld.p");
	  
	  int x2a = getConfig().getInt("s3plotworld.x");
	  int y2a = getConfig().getInt("s3plotworld.y");
	  int z2a = getConfig().getInt("s3plotworld.z");
	  int p2a = getConfig().getInt("s3plotworld.p");
	  
	  int x3a = getConfig().getInt("pixelartplotworld.x");
	  int y3a = getConfig().getInt("pixelartplotworld.y");
	  int z3a = getConfig().getInt("pixelartplotworld.z");
	  int p3a = getConfig().getInt("pixelartplotworld.p");
	  
	  
	  String wplotworld2 = getConfig().getString("wplotworld2");
	  String wplotworld3 = getConfig().getString("wplotworld3");
	  String wpixelart = getConfig().getString("wpixelart");
	  String lobby = getConfig().getString("lobby");
	  String plotworld2 = getConfig().getString("plotworld2");
	  String plotworld3 = getConfig().getString("plotworld3");
	  String pixelart = getConfig().getString("pixelart"); 
	
  public void onEnable()
  {
	getLogger().info("Status: Crea by Mgone ENABLED");
	plugin = this;
	setupDatabase();
	getServer().getPluginManager().registerEvents(this, this);
	getServer().getPluginManager().registerEvents(new protect(), this);
	getServer().getPluginManager().registerEvents(new signs(), this);
	getServer().getPluginManager().registerEvents(new utils(), this);
	getServer().getPluginManager().registerEvents(new join(), this);
	getServer().getPluginManager().registerEvents(new ChatListener(), this);
	getServer().getPluginManager().registerEvents(new border(), this);
	getServer().getPluginManager().registerEvents(new stats(), this);
	getServer().getPluginManager().registerEvents(new grades(), this);
	getServer().getPluginManager().registerEvents(new joindb(), this);
	getServer().getPluginManager().registerEvents(new menu(), this);
	getServer().getPluginManager().registerEvents(new plotcommandes(), this);
	getServer().getPluginManager().registerEvents(new cmdgeneral(), this);
	getServer().getPluginManager().registerEvents(new pet(), this);
	getServer().getPluginManager().registerEvents(new shop(), this);
	getServer().getPluginManager().registerEvents(new gradegui(), this);
	getServer().getPluginManager().registerEvents(new Blockg(), this);
	getServer().getPluginManager().registerEvents(new block_18(), this);
	getServer().getPluginManager().registerEvents(new Plotexpired(), this);
	getCommand("stats").setExecutor(new Commandos());
	getCommand("statsh").setExecutor(new Commandos());
	getCommand("statsadd").setExecutor(new Commandos());
	menu.GUImenu = Bukkit.createInventory(null, 45, "§6\u2739 §d§lCraft§e§lZone §6\u2739");
	plotcommandes.GUIplot = Bukkit.createInventory(null, 45, "§6\u2739 §d§lCommandes Plotme §6\u2739");
	cmdgeneral.GUIcmdg = Bukkit.createInventory(null, 45, "§6\u2739 §d§lCommande Générales §6\u2739");
	pet.GUIpet = Bukkit.createInventory(null, 54, "§5\u2663 Pet \u2663");
	shop.GUIshop = Bukkit.createInventory(null, 45, "§d§lS§e§lh§b§lo§c§lp");
	block_18.GUI18 = Bukkit.createInventory(null, 45, "§5\u2663 Block 1.8 \u2663");
    setupPermissions();
    setupChat();
    getConfig().options().copyDefaults(true);
    saveDefaultConfig();
    reloadConfig();
    //ourTask();
    new AutoMessages(this);
    ourTasknoob();
    stats();
    menu.invtask();
    antitab.initPacketListener();
    
	  MySQL.openConnection();

	    if (MySQL.con == null) {
	        System.out.println("MySQL-Error: Willobby is gonna shutdown because it can't connect to the database.");
	        return;
	      }
    
    MySQL.createStatement("CREATE TABLE IF NOT EXISTS votegive (id INTEGER(11) not null AUTO_INCREMENT, name VARCHAR(16), PRIMARY KEY (id))");
    
    
	Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
		public void run(){
			GiveVote();
		}
	}, 5 * 20, 5 * 20);


  }
  
  
  public static void GiveVote(){
		
	   ResultSet rs = MySQL.querySQL("SELECT * FROM votegive;");	

	   try {
				while(rs.next()) {
					String name =  rs.getString("name");
					Bukkit.dispatchCommand(crea.plugin.getServer().getConsoleSender(), "statsadd "+ name +" pblockp 500");
					Bukkit.dispatchCommand(crea.plugin.getServer().getConsoleSender(), "statsadd "+ name +" pblockb 500");
					MySQL.createStatement("DELETE FROM votegive WHERE name = '" + name + "';");
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
  
  
  @SuppressWarnings("deprecation")
public void onDisable()
  {
	  
	  for (Player pe : Bukkit.getOnlinePlayers()) {
		  stats.statslogout(pe); 
	  }
	  
	  for (Player pe : Bukkit.getOnlinePlayers()) {
		  joindb.srbootpurge(pe);	  
	  }
    getLogger().info("Status: Crea by Mgone DISABLED");
  }
  
	private boolean setupPermissions() {
        RegisteredServiceProvider<Permission> rsp = getServer().getServicesManager().getRegistration(Permission.class);
        permission = rsp.getProvider();
        return permission != null;
    }
	
	
	private boolean setupChat() {
        RegisteredServiceProvider<Chat> chatProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.chat.Chat.class);
        if (chatProvider != null) {
            chat = chatProvider.getProvider();
        }

        return (chat != null);
    }
	
	
	public void stats()
	  {
		stats.timeptask();
	    stats.savestattask();
	    stats.taskdatabasecheck();
	    grades.taskgrade();
	    joindb.taskenligne();
	    joindb.taskremoveeligne(); 
	 }
	

	  public void reloadConfig()
	  {
	    super.reloadConfig();
	    usePermissions = getConfig().getBoolean("use-permissions", false);
	    

	    x1 = getConfig().getInt("splotworld2.x");
	    y1 = getConfig().getInt("splotworld2.y");
	    z1 = getConfig().getInt("splotworld2.z");
	    p1 = getConfig().getInt("splotworld2.p");
	    
	    x2 = getConfig().getInt("splotworld3.x");
	    y2 = getConfig().getInt("splotworld3.y");
	    z2 = getConfig().getInt("splotworld3.z");
	    p2 = getConfig().getInt("splotworld3.p");
	    
	    x3 = getConfig().getInt("slobby.x");
	    y3 = getConfig().getInt("slobby.y");
	    z3 = getConfig().getInt("slobby.z");
	    p3 = getConfig().getInt("slobby.p");
	    
	    
		x4 = getConfig().getInt("spixelart.x");
		y4 = getConfig().getInt("spixelart.y");
		z4 = getConfig().getInt("spixelart.z");
		p4 = getConfig().getInt("spixelart.p");
	    
	    
	    
	    x1a = getConfig().getInt("s2plotworld.x");
	    y1a = getConfig().getInt("s2plotworld.y");
	    z1a = getConfig().getInt("s2plotworld.z");
	    p1a = getConfig().getInt("s2plotworld.p");
	    
	    x2a = getConfig().getInt("s3plotworld.x");
	    y2a = getConfig().getInt("s3plotworld.y");
	    z2a = getConfig().getInt("s3plotworld.z");
	    p2a = getConfig().getInt("s3plotworld.p");
	    
	    
		x3a = getConfig().getInt("pixelartplotworld.x");
		y3a = getConfig().getInt("pixelartplotworld.y");
		z3a = getConfig().getInt("pixelartplotworld.z");
		p3a = getConfig().getInt("pixelartplotworld.p");
	    
	    
	    wplotworld2 = getConfig().getString("wplotworld2");
	    wplotworld3 = getConfig().getString("wplotworld3");
	    lobby = getConfig().getString("lobby");
	    wpixelart = getConfig().getString("wpixelart");
	    plotworld2 = getConfig().getString("plotworld2");
	    plotworld3 = getConfig().getString("plotworld3");
		pixelart = getConfig().getString("pixelart"); 

	  }

	  
	  
	  
	  public static Plugin getPluginInstance(){
		    return plugin;
		}
	  
	  
	  
	  
	  private void setupDatabase() {
		    try {
		      getDatabase().find(Pstat.class).findRowCount();
		      getDatabase().find(Penligne.class).findRowCount();
		      getDatabase().find(Ipcheck.class).findRowCount();
		    }
		    catch (PersistenceException ex) {
		      getLogger().info("Installing database for " + getDescription().getName() + " due to first time usage");
		      installDDL();
		    }
		  }
	  
	  
	  
	  @Override
	    public List<Class<?>> getDatabaseClasses() {
	        List<Class<?>> list = new ArrayList<Class<?>>();
	        list.add(Pstat.class);
	        list.add(Penligne.class);
	        list.add(Ipcheck.class);
	        return list;
	    }
	  
	  
	  
	
	  public void ourTask(){


			Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
				@SuppressWarnings("deprecation")
				public void run(){		
					
		for (Player pe : Bukkit.getOnlinePlayers()) {
	    pe.sendMessage(ChatColor.GOLD + "=====================================================\n" +
		ChatColor.YELLOW + "✪ " + ChatColor.DARK_PURPLE + "Grades, pet, déguisement... disponible sur CraftZone.fr" + ChatColor.YELLOW + " ✪\n" +
		ChatColor.RESET + "    Pour plus d'informations Tapez /aide\n" +
		ChatColor.GOLD + "=====================================================");	}
					
				}
			}, 600 * 20, 1200 * 20); // 20 ticks = 1 second. So 5 * 20 = 100 which is 5 seconds
			
			
			
			
			Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
				@SuppressWarnings("deprecation")
				public void run(){

		for (Player pe : Bukkit.getOnlinePlayers()) {
		pe.sendMessage(ChatColor.GOLD + "=====================================================\n" +
		ChatColor.RESET + "Nous sommes constament a la recherche de staff\n" +
		ChatColor.RESET + "Site: " + ChatColor.AQUA + "CraftZone.fr" + ChatColor.RESET + " TeamSpeak: " + ChatColor.AQUA + "ts.CraftZone.fr\n" +
		ChatColor.GOLD + "=====================================================");	}
					
				}
			}, 1200 * 20, 1200 * 20); // 20 ticks = 1 second. So 5 * 20 = 100 which is 5 seconds
		
			
		}

  
	   public void ourTasknoob(){


			Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
				@SuppressWarnings("deprecation")
				public void run(){
					
				    for (Player pe : Bukkit.getOnlinePlayers()) {
				    	if(!pe.isOp() && pe.hasPermission("use.qcm")) {
				    		
				    	pe.sendMessage(ChatColor.RED + "=================[Bienvenue " + ChatColor.GOLD + pe.getName() + ChatColor.RED + "]===============\n" +
				    	ChatColor.AQUA + "Pour avoir le grade Apprenti et pouvoir jouer Tapez " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "/qcm\n" +
				    	ChatColor.RED + "=====================================================");
				    	
				    	if(utils.McVersion(pe))  utils.Title(pe, "§5/qcm", "§bPour avoir le grade Apprenti et pouvoir jouer", 5); 
				    	}
				    	
				    	
				    	if(!utils.McVersion(pe)) pe.sendMessage("§4§lChanger en version 1.8 vous pouvez crash a tout moment a cause des block non reconnu");
				    	
				    	
				    	}
					
				}
			}, 30 * 20, 45 * 20); // 20 ticks = 1 second. So 5 * 20 = 100 which is 5 seconds
			
		}

  

  

 
  
  
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
   
    
    if ((sender instanceof Player))
    {  Player player = (Player)sender;
    
    
    if (cmd.getName().equalsIgnoreCase("quitqcm"))
    {
    	if(player.hasPermission("use.qcm")) {
    		
    		getServer().dispatchCommand(getServer().getConsoleSender(), "spawn " + player.getName());
    		qcm.remove(player.getName());
    	} else { player.sendMessage("euh vous avez déja réussis le QCM!!");    }
    	
    	return false;
      }
    
    
    if (cmd.getName().equalsIgnoreCase("help") || cmd.getName().equalsIgnoreCase("aide"))
    {

        player.sendMessage(ChatColor.GOLD + "======================================= \n" + 
          ChatColor.GREEN + "- Utliser le guide (l'étoile du nether) pour l'aide\n" + 
          ChatColor.RED + "- Retourner au lobby(spawn principal) utiliser /lobby ou /hub\n" +
          ChatColor.GREEN + "- Pour afficher la liste de nos serveurs: /server\n" +
          ChatColor.RED + "- Pour en savoir plus sur les grades Cliquez sur le guide\n" +
          ChatColor.GREEN + "- pour contacter un membre du staff utiliser /helpop\n" +
          ChatColor.RED + "- /icon pour afficher la liste des icons disponible\n" +
          ChatColor.GREEN + "- /spawn pour aller au spawn\n" +
          ChatColor.RED + "- /list pour afficher la liste des joueurs connectés\n" +
          ChatColor.LIGHT_PURPLE + "Plugin By " + ChatColor.AQUA + "mgone2010 \n" + 
          ChatColor.GOLD + "=======================================");
      }
    
    if (cmd.getName().equalsIgnoreCase("icon"))
    {

        
        player.sendMessage(ChatColor.GOLD + "======================================= \n" + 
          ChatColor.RED + "- liste des icons diponible :\n" + 
          ChatColor.GREEN + "- :) ☺ , :-) ☺ , :( ☹ , :-( ☹ , ;) ツ , ;-) ツ , avion* ✈\n" +
          ChatColor.GREEN + ":love: ❤ , ok* ✔ , <3 ❤ , carreau* ♦ , trefle* ♣ , pique* ♠\n" +
          ChatColor.GREEN + "coeur* ♥ , femme* ♀ , homme* ♂ , music* ♪♫♫♪ , no* ✖ , tel* ☎\n" +
          ChatColor.GREEN + "soleil* ☼ , lune* ☾ , fleur* ✿ , nuage* ☁\n" +
          ChatColor.GOLD + "=======================================");
      }


    
    if (cmd.getName().equalsIgnoreCase("plugin"))
    {
      player.sendMessage("Plugins (1):" + ChatColor.GREEN + " CraftZone");
    }
    
    
    if (cmd.getName().equalsIgnoreCase("plugins"))
    {
      player.sendMessage("Plugins (1):" + ChatColor.GREEN + " CraftZone");
    }
    

    if (cmd.getName().equalsIgnoreCase("pl"))
    {
      player.sendMessage("Plugins (1):" + ChatColor.GREEN + " CraftZone");
    }
    
    
    if (cmd.getName().equalsIgnoreCase("creareload")) {
    	
    	if(player.hasPermission("creatif.reload")) {
    	reloadConfig();
        player.sendMessage(ChatColor.GOLD + "[Creatif] " + ChatColor.GRAY + "You have reloaded config."); }
    	else  player.sendMessage(ChatColor.GOLD + "[Creatif] " + ChatColor.GRAY + "Vous n'avez pas la permission ;).");
    	
      }
    
    if (cmd.getName().equalsIgnoreCase("dvote"))
    {
    	if(player.hasPermission("use.dvote"))
        Bukkit.getServer().broadcastMessage("§5§k=====================================================\n"
        + ChatColor.LIGHT_PURPLE + "[" + player.getName() + "]" + ChatColor.AQUA + ChatColor.BOLD + " n'oubliez pas de voter pour le serveur chaque 24 heures\n"
    	+ ChatColor.GREEN + ChatColor.BOLD + "==>http://craftzone.fr/vote/\n"
    	+"§5§k=====================================================\n");
        else player.sendMessage( ChatColor.RED + "Vous n'avez pas la permission!");
    }
    
    
    
    if (cmd.getName().equalsIgnoreCase("qcm"))
    {
    	if(player.hasPermission("use.qcm")) {
    		
    		getServer().dispatchCommand(getServer().getConsoleSender(), "tppos " + player.getName() + " " + getConfig().getString("posqcm"));
    		qcm.put(player.getName(),player.getName());
    	} else { player.sendMessage("euh vous avez déja réussis le QCM");    }
    	
      }
    
    
    
    
    if (cmd.getName().equalsIgnoreCase("pub"))
    { 
    	if(player.hasPermission("warn.pub")) {

    	if (args.length == 0) {	
    		
        	player.sendMessage("§6joueurs averti et mute pour pub §f(" + pubeur.size() + "):");
        	
        	for( Iterator<String> i = pubeur.keySet().iterator(); i.hasNext();){
        		String key = (String)i.next();
        		String  pub = pubeur.get(key); 
        		player.sendMessage("§a- " + key + ": §f" + pub );
        		
            } player.sendMessage("§f==>/pub help : pour la liste des commandes");
    	
    	} else if (args.length == 2) {
    		
    		
    		
     if (args[0].equalsIgnoreCase("remove")) {

    	 if(player.hasPermission("remove.pub")) {
    		 
	OfflinePlayer player2 = Bukkit.getOfflinePlayer(args[1]);
    
    if(args[1].equals("all")) { pubeur.clear(); player.sendMessage("§eliste supprimée"); return false; }
    
  if (pubeur.containsKey(player2.getName())) { pubeur.remove(player2.getName()); player.sendMessage("§ajoueur supprimé!");} else player.sendMessage("§cjoueur invalide!");
    	 } else player.sendMessage("§4Vous n'avez pas la permission!"); //fin perm remove
    	 
     }  else player.sendMessage("Usage: /pub, /pub remove <joueur>, /pub remove all");	//fin remove
	
    		
    	} else player.sendMessage("Usage: /pub, /pub remove <joueur>, /pub remove all");	//fin lenght = 1 else =2
    	
    	
    	
    	} else player.sendMessage("§4Vous n'avez pas la permission!");
    }
    
    
    
    
    
    if (cmd.getName().equalsIgnoreCase("grief"))
    { 
    	if(player.hasPermission("warn.grief")) {

    	if (args.length == 0) {
    		
        	player.sendMessage("§6joueurs grief suspect §f(" + grief.size() + "):");
        	
        	for( Iterator<String> i = grief.keySet().iterator(); i.hasNext();){
        		String key = (String)i.next();
        		String  pub = grief.get(key); 
        		player.sendMessage("§a- " + key + ": §f" + pub );
        		
            }
    	}
    	} else player.sendMessage("§4Vous n'avez pas la permission!");
    }
    
    
    
    
    
    
    if (cmd.getName().equalsIgnoreCase("listv"))
    { 
    	int v7 = 0;
    	int v8= 0;
    	String sv7 = "";
    	String sv8 = "";
    	for (Player pe : Bukkit.getOnlinePlayers()) {
    		if(utils.McVersion(pe)) { v8++; sv8 = sv8+pe.getName()+", "; }
    		
    		else { v7++; sv7 = sv7+pe.getName()+", "; }
    	}
    	
    	player.sendMessage("§cVersion 1.8 §6(" + v8 + ")§f: " + sv8);
    	player.sendMessage("§aVersion 1.7 §6(" + v7 + ")§f: " + sv7);
    	
    }

    
    if (cmd.getName().equalsIgnoreCase("vote"))
    {

    	player.sendMessage("§b§lSi vous tenez à §c§lC§e§lr§a§la§b§lf§1§lt§d§lZ§8§lo§6§ln§5§le §b§l Votez chaque 24 heures\n"
    	+ "§a§l==>http://craftzone.fr/vote/\n"+
    		"§fLes votes et les achats aides le serveur à survivre");

    }

    

    
    return false;
  } //fin comande
    
    
    
    
    if (!(sender instanceof Player)) {
    	
    	
    	
    	
  	  if (cmd.getName().equalsIgnoreCase("pubadd"))
	    { 

	 if (args.length > 1) {
	    		

	OfflinePlayer player2 = Bukkit.getOfflinePlayer(args[0]);
	
	if (pubeur.containsKey(player2.getName())) {
		
		getServer().dispatchCommand(getServer().getConsoleSender(), "kick " + player2.getName() + " Possibilité de PUB * 2");
		pubeur.remove(player2.getName());
		
	} else {
		
		String msg = "";
		for(int i = 1; i<args.length; i++) msg += args[i] + " " ;
		
	  pubeur.put(player2.getName(), msg);
	  getServer().dispatchCommand(getServer().getConsoleSender(), "tempmute " + player2.getName() + " 7200 Possibilité de PUB");
	  player2.getPlayer().sendMessage("§bLa prochaine fois si vous tentez de faire de la pub vous serez banni automatiquement, §6Si "
	  		+ "vous pensez que c'est une erreur merci de contacter le staff sur le forum de craftzone.fr ou sur ts3"); }
	
	for(Player pe : Bukkit.getServer().getOnlinePlayers()){
		if(pe.hasPermission("warn.pub"))
			pe.playSound(pe.getLocation(), Sound.ENDERDRAGON_GROWL, 30.0F, 10.0F);
		}
	
	
	    	 
	     }  else sender.sendMessage("Usage: /pubadd <joueur> <msg>");
		
	    	
	    return false;	
	    }
    	
    	
    	
    	
    	
        if (cmd.getName().equalsIgnoreCase("hhh"))
        {
        	
        	String message = "";
    		for (String part : args) {
    		    if (message != "") message += " ";
    		    message += part;
    		}
    		
    		Bukkit.getServer().broadcastMessage( ChatColor.LIGHT_PURPLE + message);
        }
       
        
        
        if (cmd.getName().equalsIgnoreCase("hvote"))
        {
        	
        	String message = "";
    		for (String part : args) {
    		    if (message != "") message += " ";
    		    message += part;
    		}
    		
    		for(Player p : Bukkit.getServer().getOnlinePlayers()){
    			if(p.hasPermission("vote.msg"))
    			p.sendMessage(ChatColor.LIGHT_PURPLE + message);
    			}
        }
        
        
     


       if (cmd.getName().equalsIgnoreCase("memt")) {
    	      sender.sendMessage("" + (Runtime.getRuntime().totalMemory() / 1024L ^ 0x5));
    	      
        } 



      if (cmd.getName().equalsIgnoreCase("memmax")) {
    	      sender.sendMessage("" + (Runtime.getRuntime().maxMemory() / 1024L ^ 0x5));

     } 



       if (cmd.getName().equalsIgnoreCase("memfree")) {
    	      sender.sendMessage("" + (Runtime.getRuntime().freeMemory() / 1024L ^ 0x5));
     } 


        if (cmd.getName().equalsIgnoreCase("uptimes")) {
    	   long timeCurrent = System.currentTimeMillis();
    	   long timeElapsed = timeCurrent - timeStartup;
    	    
    	    long totalSeconds = timeElapsed / 1000L;
    	    long totalMinutes = totalSeconds / 60L;
    	    long totalHours = totalMinutes / 60L;
    	    long totalDays = totalHours / 24L;
    	    
    	    //long fmtSeconds = totalSeconds - totalMinutes * 60L;
    	    long fmtMinutes = totalMinutes - totalHours * 60L;
    	    long fmtHours = totalHours - totalDays * 24L;
    	    long fmtDays = totalDays;
    	    
    	    //String upSeconds = String.valueOf(fmtSeconds);
    	    String upMinutes = String.valueOf(fmtMinutes);
    	    String upHours = String.valueOf(fmtHours);
    	    String upDays = String.valueOf(fmtDays);
    	    
    	    sender.sendMessage( upDays + "j " + upHours + "h " + upMinutes + "m");
    	   
    } 
        return false;   
        
    }
    
    
	return false;
    
 
  }
  

  
  
  //consomme bcp de ressource
  @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
  public void onPlayerMove(PlayerMoveEvent event) {
  	Player player = event.getPlayer();
    String worldname = player.getWorld().getName();
    Material m = player.getLocation().getBlock().getType();
    
    if ((m != Material.STATIONARY_WATER) && (m != Material.WATER)) return;
    
    Block block = player.getWorld().getBlockAt(player.getLocation());
    String data = "," + String.valueOf(block.getX()) + "#" + String.valueOf(block.getY()) + "#" + String.valueOf(block.getZ()) + ",";
      
 
      if (worldname.equals("plotworld")) {
      if (wplotworld2.contains(data)) {
      	
      	if(player.hasPermission("use.plotworld2")) {
      	Location ar1 = new Location(Bukkit.getWorld("plotworld2"),x1,y1,z1,p1,0);
      	player.teleport(ar1);
      	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
      	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);
      	}
      	
      	else {
      		 getServer().dispatchCommand(getServer().getConsoleSender(), "spawn " + player.getName());
		            player.sendMessage("Map disponible à partir du grade Maçon.");
      		
      	}
      	
      }
      
      if (wplotworld3.contains(data)) {
      	
      	if(player.hasPermission("use.plotworld3")) {
      	Location ar2 = new Location(Bukkit.getWorld("plotworld3"),x2,y2,z2,p2,0);
      	player.teleport(ar2);
      	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
      	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);
      	}
      	
      	else {
      		 getServer().dispatchCommand(getServer().getConsoleSender(), "spawn " + player.getName());
      		       player.sendMessage("Map disponible à partir du grade Décorateur.");
      		
      	}
      	
      }
      
      
      
      if (wpixelart.contains(data)) {
        	
        	if(player.hasPermission("use.pixelart")) {
        	Location ar4 = new Location(Bukkit.getWorld("pixelart"),x4,y4,z4,p4,0);
        	player.teleport(ar4);
        	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
        	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);
        	}
        	
        	else {
        		 getServer().dispatchCommand(getServer().getConsoleSender(), "spawn " + player.getName());
        		       player.sendMessage("Map disponible à partir du grade Apprenti.");
        		
        	}
        	
        }
      
      
      
      if (lobby.contains(data)) {
      	
          Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
          ByteArrayOutputStream b = new ByteArrayOutputStream();
      	DataOutputStream out = new DataOutputStream(b);
      	
      	Location ar3 = new Location(Bukkit.getWorld("plotworld"),x3,y3,z3,p3,0);
      	player.teleport(ar3);
      	
      	

    	  try {
        	   out.writeUTF("Connect");
        	   out.writeUTF("lobby");
        	   } catch (IOException ex) { }
        	   player.sendPluginMessage(this, "BungeeCord", b.toByteArray());
      }
      
      
    }//fin if world
      
      
      if (worldname.equals("plotworld2")) {
      if (plotworld2.contains(data)) {
      	Location ar1 = new Location(Bukkit.getWorld("plotworld"),x1a,y1a,z1a,p1a,0);
      	player.teleport(ar1);
      	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
      	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);

      }  
   }
      
      
      if (worldname.equals("plotworld3")) {
      if (plotworld3.contains(data)) {
        	Location ar2= new Location(Bukkit.getWorld("plotworld"),x2a,y2a,z2a,p2a,0);
        	player.teleport(ar2);
          	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
          	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);
      }  
   }
      
      
      if (worldname.equals("pixelart")) {
      if (plotworld3.contains(data)) {
        	Location ar2= new Location(Bukkit.getWorld("plotworld"),x3a,y3a,z3a,p3a,0);
        	player.teleport(ar2);
          	player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.0F);
          	player.getWorld().playEffect(player.getLocation(), Effect.ENDER_SIGNAL, 30, 2);
      }  
   }
      
  } 
  
  

  


  
  
 
}

