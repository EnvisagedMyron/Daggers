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
             new SwordItem(ToolMaterials.WOOD,1,-2.1f,new FabricItemSettings().maxDamage(30)));
    public static final Item STONE_DAGGER = registerDagger("stone_dagger",
            new SwordItem(ToolMaterials.STONE,1,-2.1f,new FabricItemSettings().maxDamage(65)));
    public static final Item GOLD_DAGGER = registerDagger("gold_dagger",
            new SwordItem(ToolMaterials.GOLD,1,-2f,new FabricItemSettings().maxDamage(15)));
    public static final Item IRON_DAGGER = registerDagger("iron_dagger",
            new SwordItem(ToolMaterials.IRON,1,-2.1f,new FabricItemSettings().maxDamage(125)));
    public static final Item DIAMOND_DAGGER = registerDagger("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND,1,-2.1f,new FabricItemSettings().maxDamage(780)));
    public static final Item NETHERITE_DAGGER = registerDagger("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE,1,-2.1f,new FabricItemSettings().maxDamage(1015)));









    // registry stuff

    private static Item registerDagger(String daggerName, Item item){
        return Registry.register(Registries.ITEM,new Identifier(Daggers.MOD_ID,daggerName),item);
    }
    public static void registerModItems(){
        Daggers.LOGGER.info("Registering Mod Items for" + Daggers.MOD_ID);

    }
}
