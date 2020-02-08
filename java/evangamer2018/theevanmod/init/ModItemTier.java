package evangamer2018.theevanmod.init;

// Imports
import java.util.function.Supplier;

import evangamer2018.theevanmod.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

// Setup Material
public enum ModItemTier implements IItemTier 
{
    infinity(3, 3000, 14.0F, 1.5F, 30, () -> {
    	return Ingredient.fromItems(ItemInit.infinity_ingot);
    });
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    
	
	// Setup Vars 1
    private ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) 
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

	// Setup Vars 2
    @Override
    public int getMaxUses() 
    {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() 
    {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() 
    {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() 
    {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() 
    {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() 
    {
        return this.repairMaterial.getValue();
    }
}