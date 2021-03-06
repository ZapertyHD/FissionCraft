package fissioncraft.objects.items.food;

import fissioncraft.Main;
import fissioncraft.init.ItemInit;
import fissioncraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{		super(amount, saturation, isAnimalFood);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.FISSIONCRAFT);
		
			ItemInit.ITEMS.add(this);
		
	}
	@Override
	public void registerModels()
		{	Main.proxy.registerModel(this, 0);
		}
}
