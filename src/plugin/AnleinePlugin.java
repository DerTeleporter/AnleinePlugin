package plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class AnleinePlugin extends JavaPlugin {

	public void onEnable() {
		System.out.println("[Anleine]Das Plugin wurde gestartet");

		getServer().getPluginManager().registerEvents(new AnleineListener(),
				this);
	}

	public void onDisable() {
		System.out.println("[Anleine]Das Plugin wurde gestoppt");
	}

}
