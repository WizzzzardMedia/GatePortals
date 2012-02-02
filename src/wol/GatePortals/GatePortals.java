package wol.GatePortals;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class GatePortals extends JavaPlugin{
	private Logger log;
	
	@Override
	public void onEnable() {
		log = Logger.getLogger("Minecraft");
		log.info("GatePortals is starting...");
	}
	
	@Override
	public void onDisable() {
		log.info("GatePortals is stopping...");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("gp")){
			if(args.length == 2 && args[0].equalsIgnoreCase("create")){
				//Create a new Portal:
				
			}
			return true;
		}
		
		return false;
	}
}
