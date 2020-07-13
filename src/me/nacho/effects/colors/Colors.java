package me.nacho.effects.colors;

import net.md_5.bungee.api.ChatColor;

public class Colors {

	public static String translate(final String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
}
