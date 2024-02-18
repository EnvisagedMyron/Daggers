package myron.daggers.datagen;

import myron.daggers.item.DaggerItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DaggerItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(DaggerItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(DaggerItems.GOLD_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(DaggerItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(DaggerItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(DaggerItems.NETHERITE_DAGGER, Models.HANDHELD);

    }
}
