package test;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveListener implements Listener
{
	public MoveListener(Test plugin)
	{
		
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent event)
	{
		event.getFrom().subtract(0.0, 1.0, 0.0).getBlock().setType(Material.REDSTONE_BLOCK);
	}
}
