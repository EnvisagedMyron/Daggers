package myron.daggers.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum DaggerMaterial implements ToolMaterial {
    ;

    private final int itemDurability;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    DaggerMaterial(int itemDurability,float attackDamage,int enchantability,Supplier<Ingredient> repairIngredient){
        this.attackDamage = attackDamage;
        this.itemDurability = itemDurability;
        this.repairIngredient = repairIngredient;
        this.enchantability = enchantability;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
