package net.purejosh.purequartztools.block;

// Notice I've imported AbstractBlock.Settings, instead of stopping at AbstractBlock, to help shorten future code.
// This makes it possible to use "Settings.create", vs "AbstractBlock.Settings.create". Pretty neat. Thanks fzzyhmstrs!

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.purejosh.purequartztools.PureQuartzTools;

public class ModBlocks {
    // Register new blocks, and set their properties all in one. This helps me reduce the amount of files in my code.
    // Ores
    public static final Block QUARTZ_ORE = register("quartz_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
            Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(3.0f, 3.0f).sounds(BlockSoundGroup.STONE)), true);
    public static final Block DEEPSLATE_QUARTZ_ORE = register("deepslate_quartz_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
            Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE)), true);

    // Unique blocks
    public static final Block RAW_QUARTZ_BLOCK = register("raw_quartz_block", new Block(
            Settings.copy(Blocks.QUARTZ_BLOCK)), true);
    public static final Block QUARTZ_CLUSTER = register("quartz_cluster", new AmethystClusterBlock(
            7.0F, 3.0F, Settings.create().mapColor(MapColor.OFF_WHITE).solid().nonOpaque().sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .strength(1.5F).luminance((state) -> 15).pistonBehavior(PistonBehavior.DESTROY)), true);
    public static final Block QUARTZ_SAND = register("quartz_sand", new ColoredFallingBlock(
            new ColorCode(15065046), Settings.copy(Blocks.SAND)), true);
    public static final Block QUARTZ_GLASS = register("quartz_glass", new TransparentBlock(
            Settings.copy(Blocks.GLASS).strength(1.6f, 12)), true);
    public static final Block QUARTZ_GLASS_PANE = register("quartz_glass_pane", new PaneBlock(
            Settings.create().instrument(NoteBlockInstrument.HAT).strength(1.6f, 12)
                    .sounds(BlockSoundGroup.GLASS).nonOpaque()), true);
    public static final Block QUARTZ_LAMP = register("quartz_lamp", new Block(
            Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.PLING).strength(0.3f)
                    .sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).solidBlock(Blocks::never)), true);
    public static final Block QUARTZ_LANTERN = register("quartz_lantern", new LanternBlock(
            Settings.copy(Blocks.LANTERN).mapColor(MapColor.OFF_WHITE)), true);
    public static final Block QUARTZ_SOUL_LANTERN = register("quartz_soul_lantern", new LanternBlock(
            Settings.copy(Blocks.SOUL_LANTERN).mapColor(MapColor.OFF_WHITE)), true);
    public static final Block QUARTZ_BLOSSOM = register("quartz_blossom", new QuartzBlossom(
            (Settings.create().mapColor(MapColor.OFF_WHITE).breakInstantly().noCollision().sounds(BlockSoundGroup.SPORE_BLOSSOM)
                    .pistonBehavior(PistonBehavior.DESTROY))), true);

    // Block variants
    public static final Block QUARTZ_WALL = register("quartz_wall", new WallBlock(
            Settings.copy(Blocks.QUARTZ_BLOCK)), true);
    public static final Block CHISELED_QUARTZ_STAIRS = register( "chiseled_quartz_stairs", new StairsBlock(
            Blocks.CHISELED_QUARTZ_BLOCK.getDefaultState(), Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK)), true);
    public static final Block CHISELED_QUARTZ_SLAB = register("chiseled_quartz_slab", new SlabBlock(
            Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(2.0f, 6.0f)), true);
    public static final Block CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall", new WallBlock(
            Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK)), true);
    public static final Block QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new StairsBlock(
            Blocks.QUARTZ_BRICKS.getDefaultState(), Settings.copy(Blocks.QUARTZ_BRICKS)), true);
    public static final Block QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new SlabBlock(
            Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(2.0f, 6.0f)), true);
    public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(
            Settings.copy(Blocks.QUARTZ_BRICKS)), true);
    public static final Block QUARTZ_PILLAR_STAIRS = register("quartz_pillar_stairs", new StairsBlock(
            Blocks.QUARTZ_PILLAR.getDefaultState(), Settings.copy(Blocks.QUARTZ_PILLAR)), true);
    public static final Block QUARTZ_PILLAR_SLAB = register("quartz_pillar_slab", new SlabBlock(
            Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool()
                    .strength(2.0f, 6.0f)), true);
    public static final Block QUARTZ_PILLAR_WALL = register("quartz_pillar_wall", new WallBlock(
            Settings.copy(Blocks.QUARTZ_PILLAR)), true);
    public static final Block QUARTZ_PILLAR_MEDIUM = register("quartz_pillar_medium", new QuartzPillarMedium(
            Settings.copy(Blocks.QUARTZ_PILLAR)), true);
    public static final Block QUARTZ_PILLAR_SMALL = register("quartz_pillar_small", new QuartzPillarSmall(
            Settings.copy(Blocks.QUARTZ_PILLAR)), true);
    public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new WallBlock(
            Settings.copy(Blocks.SMOOTH_QUARTZ)), true);

    // Helper methods
    // This is used to create an item version of a block. An item of a block is what you see in your inventory.
    public static Block register(String name, Block block, boolean shouldRegisterItem) {
        // This creates an id consisting of the mod id and the name of the block.
        Identifier id = Identifier.of(PureQuartzTools.MOD_ID, name);
        // Some blocks may not have an item version of them, such as air. Use this boolean to control that.
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }
        return Registry.register(Registries.BLOCK, id, block);
    }

    // Class initializer.
    public static void init() {
    }
}