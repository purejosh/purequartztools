package net.purejosh.purequartztools.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.purejosh.purequartztools.PureQuartzTools;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> QUARTZ = register("quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), (EnumMap <ArmorItem.Type, Integer> map) -> {
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 5);
                map.put(ArmorItem.Type.LEGGINGS, 4);
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.BODY, 5);
            }), 18, 0.0F, 0.0F,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.QUARTZ));

    public static final int QUARTZ_DURABILITY = 11;

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(PureQuartzTools.MOD_ID, id)));
        return register(id, defense, enchant, tough, knockback, equipSound, repairItem, list);
    }

    private static RegistryEntry<ArmorMaterial> register(
            String id,
            EnumMap<ArmorItem.Type, Integer> defense,
            int enchant,
            float tough,
            float knockback,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairItem,
            List<ArmorMaterial.Layer> layers
    ) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<>(ArmorItem.Type.class);

        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }

        return Registry.registerReference(
                Registries.ARMOR_MATERIAL, Identifier.of(PureQuartzTools.MOD_ID, id),
                new ArmorMaterial(enumMap, enchant, equipSound, repairItem, layers, tough, knockback)
        );
    }

    // Initialization called from the entrypoint, as this armor material needs to be added to the registry.
    public static void init() {
    }
}
