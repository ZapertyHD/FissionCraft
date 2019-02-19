package fissioncraft.util.handlers;

import fissioncraft.objects.blocks.machines.TileEntityAlloyFabricator;
import fissioncraft.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
//		GameRegistry.registerTileEntity(TileEntityCopperChest.class, new ResourceLocation(Reference.MODID + ":copper_chest"));
		GameRegistry.registerTileEntity(TileEntityAlloyFabricator.class, new ResourceLocation(Reference.MODID + ":alloy_fabricator"));
//		GameRegistry.registerTileEntity(TileEntityGlowstoneGenerator.class, new ResourceLocation(Reference.MODID + ":glowstone_generator"));
//		GameRegistry.registerTileEntity(TileEntityElectricSinteringFurnace.class, new ResourceLocation(Reference.MODID + ":electric_sintering_furnace"));
//		GameRegistry.registerTileEntity(TileEntityEnergyStorage.class, new ResourceLocation(Reference.MODID + ":energy_storage"));
	}
}
