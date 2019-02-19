package fissioncraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeInit 
{	public static void init() 
	{		GameRegistry.addSmelting(ItemInit.STEEL_DUST, new ItemStack(ItemInit.STEEL_INGOT, 1), 1f);
			GameRegistry.addSmelting(ItemInit.COAL_DUST, new ItemStack(Items.COAL, 1), 1f);
	}	
}
