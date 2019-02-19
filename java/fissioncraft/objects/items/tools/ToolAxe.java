package fissioncraft.objects.items.tools;

import fissioncraft.Main;
import fissioncraft.init.ItemInit;
import fissioncraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 6.0F, -3.2F);
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
