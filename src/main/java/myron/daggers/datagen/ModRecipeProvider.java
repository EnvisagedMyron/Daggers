package myron.daggers.datagen;

import myron.daggers.item.DaggerItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DaggerItems.WOODEN_DAGGER,1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('W',Items.OAK_PLANKS)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.OAK_PLANKS))
                .criterion(hasItem(Items.OAK_PLANKS),conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(DaggerItems.WOODEN_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DaggerItems.STONE_DAGGER,1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('W',Items.COBBLESTONE)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.COBBLESTONE))
                .criterion(hasItem(Items.COBBLESTONE),conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(DaggerItems.STONE_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DaggerItems.GOLD_DAGGER,1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('W',Items.GOLD_INGOT)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT),conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(DaggerItems.GOLD_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DaggerItems.IRON_DAGGER,1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('W',Items.IRON_INGOT)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(DaggerItems.IRON_DAGGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DaggerItems.DIAMOND_DAGGER,1)
                .pattern("   ")
                .pattern(" W ")
                .pattern(" S ")
                .input('S',Items.STICK)
                .input('W',Items.DIAMOND)
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.STICK))
                .offerTo(exporter,new Identifier(getRecipeName(DaggerItems.DIAMOND_DAGGER)));

    }
}
