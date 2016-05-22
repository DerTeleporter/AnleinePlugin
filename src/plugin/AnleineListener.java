package plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class AnleineListener implements Listener {


	@EventHandler
	public void onPlayerRechtsKlick(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		
		System.out.println("Reagiert auf player click (" + player.getDisplayName() + ")");
		
	}

}
