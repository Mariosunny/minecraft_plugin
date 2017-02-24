package main;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class WarpCommandExecutor implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
		
		Player player;
		Location location;
		
		// check if command executor is a player, as opposed to the server
		if(sender instanceof Player){
			
			// cast sender to Player
			player = (Player) sender;
			
			// get current location of player ingame
			location=player.getLocation();
			
			// modify location to 15 blocks above
			location.setY(location.getY()+15);
			
			// set location of player to new location
			player.teleport(location);
			
			// return true since the command was successfully executed
			return true;
		}
		
		// server tried to execute command- print error message.
		sender.sendMessage("Only players can execute this command.");
		
		// return false since the command was not successfully executed
		return false;
	}

}
