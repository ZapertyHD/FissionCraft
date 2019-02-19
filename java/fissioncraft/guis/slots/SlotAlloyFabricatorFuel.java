package fissioncraft.guis.slots;

import fissioncraft.objects.blocks.machines.TileEntityAlloyFabricator;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotAlloyFabricatorFuel extends Slot
{
	
	public SlotAlloyFabricatorFuel(IInventory inventory, int index, int x, int y) 
	{
		
		super(inventory, index, x, y);
		
	}
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntityAlloyFabricator.isItemFuel(stack);	
	}	
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}
}
