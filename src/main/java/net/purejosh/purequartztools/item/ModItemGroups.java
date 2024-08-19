package net.purejosh.purequartztools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.purejosh.purequartztools.block.ModBlocks;

// This is used to arrange items in creative tabs.
public class ModItemGroups {
    public static void init() {
        // ModItems sorting
        // Tools
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                Items.STONE_HOE.getDefaultStack(), ModItems.QUARTZ_SHOVEL.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_SHOVEL.getDefaultStack(), ModItems.QUARTZ_PICKAXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_PICKAXE.getDefaultStack(), ModItems.QUARTZ_AXE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_AXE.getDefaultStack(), ModItems.QUARTZ_HOE.getDefaultStack()));

        // Combat
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.STONE_SWORD.getDefaultStack(), ModItems.QUARTZ_SWORD.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                Items.CHAINMAIL_BOOTS.getDefaultStack(), ModItems.QUARTZ_HELMET.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_HELMET.getDefaultStack(), ModItems.QUARTZ_CHESTPLATE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_CHESTPLATE.getDefaultStack(), ModItems.QUARTZ_LEGGINGS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addAfter(
                ModItems.QUARTZ_LEGGINGS.getDefaultStack(), ModItems.QUARTZ_BOOTS.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.addBefore(
                Items.IRON_HORSE_ARMOR.getDefaultStack(), ModItems.QUARTZ_HORSE_ARMOR.getDefaultStack()));

        // Food
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.APPLE.getDefaultStack(), ModItems.QUARTZ_APPLE.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.addAfter(
                Items.CARROT.getDefaultStack(), ModItems.QUARTZ_CARROT.getDefaultStack()));

        // Ingredients
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addAfter(
                Items.QUARTZ.getDefaultStack(), ModItems.QUARTZ_DUST.getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.addBefore(
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE.getDefaultStack(), ModItems.QUARTZ_UPGRADE_SMITHING_TEMPLATE.getDefaultStack()));

        // ModBlocks sorting
        // Building
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.QUARTZ_SLAB.getDefaultStack(), ModBlocks.QUARTZ_WALL.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.CHISELED_QUARTZ_BLOCK.asItem().getDefaultStack(), ModBlocks.CHISELED_QUARTZ_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.CHISELED_QUARTZ_STAIRS.asItem().getDefaultStack(), ModBlocks.CHISELED_QUARTZ_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.CHISELED_QUARTZ_SLAB.asItem().getDefaultStack(), ModBlocks.CHISELED_QUARTZ_WALL.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.QUARTZ_BRICKS.asItem().getDefaultStack(), ModBlocks.QUARTZ_BRICK_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_BRICK_STAIRS.asItem().getDefaultStack(), ModBlocks.QUARTZ_BRICK_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_BRICK_SLAB.asItem().getDefaultStack(), ModBlocks.QUARTZ_BRICK_WALL.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.QUARTZ_PILLAR.asItem().getDefaultStack(), ModBlocks.QUARTZ_PILLAR_STAIRS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_PILLAR_STAIRS.asItem().getDefaultStack(), ModBlocks.QUARTZ_PILLAR_SLAB.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_PILLAR_SLAB.asItem().getDefaultStack(), ModBlocks.QUARTZ_PILLAR_WALL.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_PILLAR_WALL.asItem().getDefaultStack(), ModBlocks.QUARTZ_PILLAR_MEDIUM.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_PILLAR_MEDIUM.asItem().getDefaultStack(), ModBlocks.QUARTZ_PILLAR_SMALL.asItem().getDefaultStack()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.SMOOTH_QUARTZ_SLAB.asItem().getDefaultStack(), ModBlocks.SMOOTH_QUARTZ_WALL.asItem().getDefaultStack()));

        // Colored
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.GLASS.getDefaultStack(), ModBlocks.QUARTZ_GLASS.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) -> itemGroup.addAfter(
                Items.GLASS_PANE.getDefaultStack(), ModBlocks.QUARTZ_GLASS_PANE.asItem().getDefaultStack()));

        // Natural
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(
                Items.DEEPSLATE_COAL_ORE.getDefaultStack(), ModBlocks.QUARTZ_ORE.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(
                ModBlocks.QUARTZ_ORE.asItem().getDefaultStack(), ModBlocks.DEEPSLATE_QUARTZ_ORE.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addBefore(
                Items.RAW_IRON_BLOCK.getDefaultStack(), ModBlocks.RAW_QUARTZ_BLOCK.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(
                Items.SAND.asItem().getDefaultStack(), ModBlocks.QUARTZ_SAND.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> itemGroup.addAfter(
                Items.SPORE_BLOSSOM.asItem().getDefaultStack(), ModBlocks.QUARTZ_BLOSSOM.asItem().getDefaultStack()));

        // Functional
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.LANTERN.getDefaultStack(), ModBlocks.QUARTZ_LANTERN.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.SOUL_LANTERN.asItem().getDefaultStack(), ModBlocks.QUARTZ_SOUL_LANTERN.asItem().getDefaultStack()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register((itemGroup) -> itemGroup.addAfter(
                Items.REDSTONE_LAMP.asItem().getDefaultStack(), ModBlocks.QUARTZ_LAMP.asItem().getDefaultStack()));
    }
}
