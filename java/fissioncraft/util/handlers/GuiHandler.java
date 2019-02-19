package fissioncraft.util.handlers;

import fissioncraft.container.ContainerAlloyFabricator;
import fissioncraft.guis.GuiAlloyFabricator;
import fissioncraft.objects.blocks.machines.TileEntityAlloyFabricator;
import fissioncraft.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ALLOY_FABRICATOR) return new ContainerAlloyFabricator(player.inventory, (TileEntityAlloyFabricator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ALLOY_FABRICATOR) return new GuiAlloyFabricator(player.inventory, (TileEntityAlloyFabricator)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
