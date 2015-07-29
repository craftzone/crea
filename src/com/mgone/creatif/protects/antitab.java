package com.mgone.creatif.protects;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.mgone.creatif.crea;

public class antitab {
	
	
	public static void initPacketListener(){
		ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(crea.plugin, PacketType.Play.Client.TAB_COMPLETE){
			@Override
			public void onPacketReceiving(PacketEvent e){
				if (e.getPacketType() == PacketType.Play.Client.TAB_COMPLETE) {
				
					if (e.getPlayer().hasPermission("protect.tab")) return;
					
					
					PacketContainer packet = e.getPacket();
		            String message = ((String)packet.getSpecificModifier(String.class).read(0)).toLowerCase();
		            
		            if ((message.startsWith("/")) && (!message.contains(" ")))
		            {

		            	e.getPlayer().sendMessage("§f/aide, /p help, /stats, /spawn, /list, /helpop, /icon, /lobby, /gta, /skyblock, "
		            			+ "/pvpmagie, /faction, /pvpbox, /creatif, /skywars, /quakecraft, /mariokart, /wigames");

		              e.setCancelled(true); }
					
				}
			}

		});
	}

}
