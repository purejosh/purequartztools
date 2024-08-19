package net.purejosh.purequartztools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.purejosh.purequartztools.item.ModArmorMaterials;
import net.purejosh.purequartztools.item.ModItemGroups;
import net.purejosh.purequartztools.world.biome.ModBiomes;
import net.purejosh.purequartztools.block.ModBlocks;
import net.purejosh.purequartztools.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureQuartzTools implements ModInitializer {
	public static final String MOD_ID = "purequartztools";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {
		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info("Pure Quartz Tools by purejosh has been loaded!");
		// Now, I call the init methods in the registry classes.
		ModArmorMaterials.init();
		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();
		ModBiomes.init();
	}
	// This is used in the configured features and placed features registry. No idea why.
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
