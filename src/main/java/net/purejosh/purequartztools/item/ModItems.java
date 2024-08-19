package net.purejosh.purequartztools.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.purejosh.purequartztools.PureQuartzTools;
import net.purejosh.purequartztools.component.type.ModFoodComponents;

public class ModItems {
    // Swords and tools
    public static final Item QUARTZ_SWORD = register("quartz_sword", new SwordItem(ModToolMaterials.QUARTZ, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.QUARTZ,3, -2.4f))));
    public static final Item QUARTZ_SHOVEL = register("quartz_shovel", new ShovelItem(ModToolMaterials.QUARTZ, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.QUARTZ,1.5f, -3.0f))));
    public static final Item QUARTZ_PICKAXE = register("quartz_pickaxe", new PickaxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ,1.0f, -2.8f))));
    public static final Item QUARTZ_AXE = register("quartz_axe", new AxeItem(ModToolMaterials.QUARTZ, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.QUARTZ,6.0f, -3.1f))));
    public static final Item QUARTZ_HOE = register("quartz_hoe", new HoeItem(ModToolMaterials.QUARTZ, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.QUARTZ,-2.0f, -1.0f))));
    // Armor
    public static final Item QUARTZ_HELMET = register("quartz_helmet", new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.HELMET,
            new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.QUARTZ_DURABILITY))));
    public static final Item QUARTZ_CHESTPLATE = register("quartz_chestplate", new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.CHESTPLATE,
            new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.QUARTZ_DURABILITY))));
    public static final Item QUARTZ_LEGGINGS = register("quartz_leggings", new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.LEGGINGS,
            new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.QUARTZ_DURABILITY))));
    public static final Item QUARTZ_BOOTS = register("quartz_boots", new ArmorItem(ModArmorMaterials.QUARTZ, ArmorItem.Type.BOOTS,
            new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.QUARTZ_DURABILITY))));
    // Horse Armor
    public static final Item QUARTZ_HORSE_ARMOR = register(
            "quartz_horse_armor", new AnimalArmorItem(ModArmorMaterials.QUARTZ, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));
    // Miscellaneous items
    public static final Item QUARTZ_APPLE = register("quartz_apple", new Item(new Item.Settings()
            .rarity(Rarity.RARE).food(ModFoodComponents.QUARTZ_APPLE)));
    public static final Item QUARTZ_CARROT = register("quartz_carrot", new Item(new Item.Settings()
            .food(ModFoodComponents.QUARTZ_CARROT)));
    public static final Item QUARTZ_DUST = register("quartz_dust", new Item(new Item.Settings()));
    public static final Item QUARTZ_UPGRADE_SMITHING_TEMPLATE = register("quartz_upgrade_smithing_template", new Item(new Item.Settings()));


    // Helper method for registering an item.
    public static Item register(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PureQuartzTools.MOD_ID, id), item);
    }

    // Class initializer called from the entrypoint.
    public static void init() {
    }
}
