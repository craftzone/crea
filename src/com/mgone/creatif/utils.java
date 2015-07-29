package com.mgone.creatif;

import java.util.concurrent.TimeUnit;

import net.minecraft.server.v1_7_R4.ChatSerializer;
import net.minecraft.server.v1_7_R4.NBTTagCompound;
import net.minecraft.server.v1_7_R4.NBTTagList;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_7_R4.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.inventory.ItemStack;
import org.spigotmc.ProtocolInjector;

public class utils implements org.bukkit.event.Listener  {
	
	
	  public static String calculateTime(double secondss) {
		  
		  long seconds = Math.round(secondss);
		  //int day = (int)TimeUnit.SECONDS.toDays(seconds);        
		  long hours = TimeUnit.SECONDS.toHours(seconds);
		  long minute = TimeUnit.SECONDS.toMinutes(seconds) - (TimeUnit.SECONDS.toHours(seconds)* 60);
		  //long second = TimeUnit.SECONDS.toSeconds(seconds) - (TimeUnit.SECONDS.toMinutes(seconds) *60);

	      String restant = hours +  " heures " + minute + " minutes ";
	      
	      return restant;

	  }
	
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onBlockFromTo(final BlockFromToEvent event)
	{
		final Block block = event.getBlock();

		if (block.getType() == Material.WATER || block.getType() == Material.STATIONARY_WATER)
		{
			event.setCancelled(true);
			return;
		}

		if (block.getType() == Material.LAVA || block.getType() == Material.STATIONARY_LAVA)
		{
			event.setCancelled(true);
			return;
		}

		if (block.getType() == Material.AIR)
		{
			event.setCancelled(true);
		}
	} 
	
	
	
	public static ItemStack removeAttributes(ItemStack item) {
		
        if(item == null) {
            return item;
        }
        
        net.minecraft.server.v1_7_R4.ItemStack nmsStack = CraftItemStack.asNMSCopy(item);
        
        if (nmsStack == null) return item;
        
        NBTTagCompound tag;
        if (!nmsStack.hasTag()){
            tag = new NBTTagCompound();
            nmsStack.setTag(tag);
        }
        else {
            tag = nmsStack.getTag();
        }
        NBTTagList am = new NBTTagList();
        tag.set("AttributeModifiers", am);
        nmsStack.setTag(tag);
        return CraftItemStack.asCraftMirror(nmsStack);
        
    }
	
	public static boolean McVersion(Player p) {
		CraftPlayer p1 = (CraftPlayer) p;
		if (p1.getHandle().playerConnection.networkManager.getVersion() >= 47) return true;
		else return false;
	}
	
	public static void Title(Player p, String title, String subtitle, int duration) {
	  CraftPlayer p2 = (CraftPlayer) p;
	  if (McVersion(p2)){
	  p2.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.TIMES, 10, duration*20, 10));
	  if(title!=null)
      p2.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.TITLE, ChatSerializer.a(convert(title))));
	  if(subtitle!=null)
      p2.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.SUBTITLE, ChatSerializer.a(convert(subtitle))));
	  }
	  
	}
	
	
	public static String convert(String text) {
        if (text == null || text.length() == 0) {
            return "\"\"";
        }

        char c;
        int i;
        int len = text.length();
        StringBuilder sb = new StringBuilder(len + 4);
        String t;

        sb.append('"');
        for (i = 0; i < len; i += 1) {
            c = text.charAt(i);
            switch (c) {
                case '\\':
                case '"':
                    sb.append('\\');
                    sb.append(c);
                    break;
                case '/':
                    sb.append('\\');
                    sb.append(c);
                    break;
                case '\b':
                    sb.append("\\b");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                default:
                    if (c < ' ') {
                        t = "000" + Integer.toHexString(c);
                        sb.append("\\u" + t.substring(t.length() - 4));
                    } else {
                        sb.append(c);
                    }
            }
        }
        sb.append('"');
        return sb.toString();
    }
	
	
	public static String msgreplace(String msg){
		msg = msg.replace(":)", "☺").replace(":-)", "☺").replace(":(", "☹").replace(":-(", "☹").replace(";)", "ツ").replace(";-)", "ツ").replace("avion*", "✈") 
			      .replace(":love:", "❤").replace("ok*", "✔ˆ").replace("<3", "❤").replace("carreau*", "♦").replace("trefle*", "♣").replace("pique*", "♠").replace("coeur*", "♥").replace("femme*", "♀").replace("homme*", "♂").replace("music*", "♪♫♫♪").replace("=>", "ı").replace("<=", "Œ").replace("fh*", "ȇ").replace("no*", "✖").replace("tel*", "☎")
			      .replace("soleil*", "☼").replace("lune*", "☾").replace("fleur*", "✿").replace("nuage*", "☁").replace("[*]", "✪").replace("[*]", "✪").replace("&", "§").replace("#", "\n");           
		return msg;
	}
	  

}
