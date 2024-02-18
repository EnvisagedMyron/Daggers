package myron.daggers.item;

import myron.daggers.Daggers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DaggerItems {
     public static final Item WOODEN_DAGGER = registerDagger("wooden_dagger",
             new SwordItem(ToolMaterials.WOOD,2,2,new FabricItemSettings()));
    public static final Item STONE_DAGGER = registerDagger("stone_dagger",
            new SwordItem(ToolMaterials.STONE,3,2,new FabricItemSettings()));
    public static final Item GOLD_DAGGER = registerDagger("gold_dagger",
            new SwordItem(ToolMaterials.STONE,3,2,new FabricItemSettings()));
    public static final Item IRON_DAGGER = registerDagger("iron_dagger",
            new SwordItem(ToolMaterials.IRON,4,2,new FabricItemSettings()));
    public static final Item DIAMOND_DAGGER = registerDagger("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND,5,2,new FabricItemSettings()));
    public static final Item NETHERITE_DAGGER = registerDagger("netherite_dagger",
            new SwordItem(ToolMaterials.WOOD,6,2,new FabricItemSettings()));









    // registry stuff

    private static Item registerDagger(String daggerName, Item item){
        return Registry.register(Registries.ITEM,new Identifier(Daggers.MOD_ID),item);
    }
    public static void registerModItems(){
        Daggers.LOGGER.info("Registering Mod Items for" + Daggers.MOD_ID);

    }
}
