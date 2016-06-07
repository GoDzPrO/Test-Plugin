package test;

import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info("Welcome " + getDescription().getVersion() + " Plugin Enabled.");
		PathMaker();
	}
	@Override
	public void onDisable()
	{
		getLogger().info("Goodbye.");
	}
	public void PathMaker()
	{
		getServer().getPluginManager().registerEvents(new MoveListener(this), this);
	}
	
}
