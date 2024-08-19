package net.purejosh.purequartztools.world.biome;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.purejosh.purequartztools.PureQuartzTools;

public class ModBiomes {
    // As all init that I use, this is called from PureQuartzTools.onInitialize.
    public static void init() {
        // This adds the featureKey to the dimension/biome. Without this, the feature would never load.
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES,
                ModBiomes.OVERWORLD_QUARTZ_ORE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.VILLAGE_DESERT_HAS_STRUCTURE),
                GenerationStep.Feature.TOP_LAYER_MODIFICATION,
                ModBiomes.QUARTZ_SAND_DESERT_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_STRUCTURES,
                ModBiomes.QUARTZ_GEODE_KEY
        );
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION,
                ModBiomes.QUARTZ_BLOSSOM_KEY
        );
    }
    // This adds the key to the registry, so I can use it above.
    public static final RegistryKey<PlacedFeature> OVERWORLD_QUARTZ_ORE_KEY = registerOverworldQuartsOreKey();
    public static final RegistryKey<PlacedFeature> QUARTZ_SAND_DESERT_KEY = registerQuartzSandDesertKey();
    public static final RegistryKey<PlacedFeature> QUARTZ_GEODE_KEY = registerQuartzGeodeKey();
    public static final RegistryKey<PlacedFeature> QUARTZ_BLOSSOM_KEY = registerQuartzBlossomKey();

    // This creates the registerKey that's used above here.
    private static RegistryKey<PlacedFeature> registerOverworldQuartsOreKey() {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, PureQuartzTools.id("overworld_quartz_ore"));
    }

    private static RegistryKey<PlacedFeature> registerQuartzSandDesertKey() {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, PureQuartzTools.id("quartz_sand_desert"));
    }

    private static RegistryKey<PlacedFeature> registerQuartzGeodeKey() {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, PureQuartzTools.id("quartz_geode"));
    }

    private static RegistryKey<PlacedFeature> registerQuartzBlossomKey() {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, PureQuartzTools.id("quartz_blossom"));
    }
}
