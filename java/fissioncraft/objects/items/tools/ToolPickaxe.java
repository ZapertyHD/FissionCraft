package fissioncraft.objects.items.tools;

import fissioncraft.Main;
import fissioncraft.init.ItemInit;
import fissioncraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FISSIONCRAFT);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerModel(this, 0);
	}
	
	
}
