package myron.daggers.item;

import myron.daggers.Daggers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DaggerItemGroup {
    public static final ItemGroup DAGGER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Daggers.MOD_ID, "daggers"),
            FabricItemGroup.builder().displayName(Text.translatable("Daggers"))
                    .icon(() -> new ItemStack(DaggerItems.NETHERITE_DAGGER)).entries((displayContext, entries) -> {
                        entries.add(DaggerItems.WOODEN_DAGGER);
                        entries.add(DaggerItems.STONE_DAGGER);
                        entries.add(DaggerItems.IRON_DAGGER);
                        entries.add(DaggerItems.GOLD_DAGGER);
                        entries.add(DaggerItems.DIAMOND_DAGGER);
                        entries.add(DaggerItems.NETHERITE_DAGGER);


                    }).build());

    public static void registerDaggerItemGroup() {
        Daggers.LOGGER.info("Registering Item Groups for " + Daggers.MOD_ID);
    }
}

