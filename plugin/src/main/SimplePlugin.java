package main;

import org.bukkit.plugin.java.JavaPlugin;

public final class SimplePlugin extends JavaPlugin{
	
	/**
	 * Entry point of plugin.
	 */
	@Override
	public void onEnable() {
		
		// set the executor class for the "warp" command
		// note any commands must be registered in "plugin.yml"
		this.getCommand("warp").setExecutor(new WarpCommandExecutor());
	}
}
