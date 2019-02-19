package fissioncraft.objects.blocks;

import fissioncraft.Main;
import fissioncraft.init.BlockInit;
import fissioncraft.init.ItemInit;
import fissioncraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{	public BlockBase(String name, Material material)
	{			super(material);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.FISSIONCRAFT);

			BlockInit.BLOCKS.add(this);
			ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	@Override
	public void registerModels() 
	{	Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
		}
}
