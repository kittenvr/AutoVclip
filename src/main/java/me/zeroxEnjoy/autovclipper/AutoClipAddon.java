package me.zeroxEnjoy.autovclipper;

import me.zeroxEnjoy.autovclipper.commands.AVClipCommand;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.commands.Commands;
import org.slf4j.Logger;

public class AutoClipAddon extends MeteorAddon {
	public static final Logger LOGGER = LogUtils.getLogger();

	@Override
	public void onInitialize() {
		Log("Beginning initialization.");

		Commands.get().add(new AVClipCommand());

		Log("Initialized successfully!");
	}

	@Override
	public String getPackage() {
		return "me.zeroxEnjoy.autovclipper";
	}

	public static void Log(String text) {
		LOGGER.info(text);
	}
}