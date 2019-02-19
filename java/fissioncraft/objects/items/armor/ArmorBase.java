package fissioncraft.objects.items.armor;

import fissioncraft.Main;
import fissioncraft.init.ItemInit;
import fissioncraft.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FISSIONCRAFT);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}
	public ArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(Main.FISSIONCRAFT);
		setMaxStackSize(1);
}
	@Override
	public void registerModels()
	{	Main.proxy.registerModel(this, 0);
	}
}
