package fissioncraft.objects.items.armor;

import fissioncraft.Main;
import fissioncraft.init.ItemInit;
import fissioncraft.objects.items.models.PowerArmorB34;
import fissioncraft.util.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorPower extends ArmorBase implements IHasModel{
 
	public ArmorPower(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, 1, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FISSIONCRAFT);
		setMaxStackSize(1);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerModel(this, 0);}
	
	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
	{
		if (itemStack != ItemStack.EMPTY);
		{
			if(itemStack.getItem() instanceof ItemArmor)
			{
				PowerArmorB34 model = new PowerArmorB34();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				model.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				model.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
				
				model.isChild = _default.isChild;
				model.isRiding = _default.isRiding;
				model.isSneak = _default.isSneak;
				model.rightArmPose = _default.rightArmPose;
				model.leftArmPose = _default.leftArmPose;
				
				return model;
				
			}
		}	
		return null; 
	}
}
