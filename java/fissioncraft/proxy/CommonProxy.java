package fissioncraft.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class CommonProxy 
{
	public void registerModel(Item item, int metadata) 
	{
		
		ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
