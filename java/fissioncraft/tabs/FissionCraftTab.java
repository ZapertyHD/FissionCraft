package fissioncraft.tabs;

import fissioncraft.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FissionCraftTab extends CreativeTabs 
{	public FissionCraftTab() 
	{	super ("fissioncraft");
	this.setBackgroundImageName("fission.png");
	this.hasSearchBar();
	}
	@Override
	public ItemStack getTabIconItem() 
	{	return new ItemStack(Item.getItemFromBlock(BlockInit.ALLOY_FABRICATOR));
	}
}
