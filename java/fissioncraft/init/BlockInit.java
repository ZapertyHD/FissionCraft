package fissioncraft.init;

import java.util.ArrayList;
import java.util.List;

import fissioncraft.objects.blocks.SteelBlock;
import fissioncraft.objects.blocks.machines.AlloyFabricator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//STANDART
	public static final Block BLOCK_STEEL = new SteelBlock("block_steel", Material.IRON);
	//USEABLE
	public static final Block ALLOY_FABRICATOR = new AlloyFabricator("alloy_fabricator");
}
