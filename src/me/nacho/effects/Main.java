package me.nacho.effects;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.nacho.effects.colors.Colors;
import me.nacho.effects.commands.FireResCommand;
import me.nacho.effects.commands.InvisCommand;
import me.nacho.effects.commands.SpeedCommand;

public class Main extends JavaPlugin {
	
	public static Main main;
	
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&aPlugin activado"));
		getCommand("speed").setExecutor(new SpeedCommand());
		getCommand("fireres").setExecutor(new FireResCommand());
		getCommand("invis").setExecutor(new InvisCommand());
	}

	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(Colors.translate("&cPlugin desactivado"));
	}
	
	public static Main getMain() {
		return main;
	} 
	
}
