package com.technothinker.survivalgames;

import java.util.logging.Logger;

import org.bukkit.GameMode;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Class1 extends JavaPlugin {
	public static SurvivalGames plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}	
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Enabled!");
	}
	

}
