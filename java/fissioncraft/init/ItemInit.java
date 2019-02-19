package fissioncraft.init;

import java.util.ArrayList;
import java.util.List;

import fissioncraft.Main;
import fissioncraft.objects.items.ItemBase;
import fissioncraft.objects.items.armor.ArmorBase;
import fissioncraft.objects.items.armor.ArmorModel;
import fissioncraft.objects.items.armor.ArmorPower;
import fissioncraft.objects.items.food.FoodBase;
import fissioncraft.objects.items.tools.ToolAxe;
import fissioncraft.objects.items.tools.ToolHoe;
import fissioncraft.objects.items.tools.ToolPickaxe;
import fissioncraft.objects.items.tools.ToolSpade;
import fissioncraft.objects.items.tools.ToolSword;
import fissioncraft.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{	public static final List<Item> ITEMS = new ArrayList<Item>();
	//MATERIALS
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial("material_steel", 2, 750, 7.0F, 3.0F, 14);
	public static final ArmorMaterial ARMOR_MATERIAL_STEEL = EnumHelper.addArmorMaterial("armor_material_steel", Reference.MODID + ":steel", 13, new int[] {2, 7, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CARBON = EnumHelper.addArmorMaterial("armor_material_carbon", Reference.MODID + ":carbon", 20, new int[] {5, 13, 8, 5}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_POWER = EnumHelper.addArmorMaterial("armor_material_power", Reference.MODID + ":power", 20, new int[] {5, 13, 8, 5}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	//ITEMS
	public static final Item STEEL_INGOT = new ItemBase("ingot_steel", Main.FISSIONCRAFT);
	public static final Item STEEL_DUST = new ItemBase("dust_steel", Main.FISSIONCRAFT);
	public static final Item STEEL_NUGGET = new ItemBase("nugget_steel", Main.FISSIONCRAFT);
	public static final Item COAL_DUST = new ItemBase("dust_coal", Main.FISSIONCRAFT);
	public static final Item COAL_SHEET = new ItemBase("coal_sheet", Main.FISSIONCRAFT);
	public static final Item COAL_PRESS = new ItemBase("coal_press", Main.FISSIONCRAFT);
	//TOOLS
	public static final ItemSword STEEL_SWORD = new ToolSword("steel_sword", MATERIAL_STEEL);
	public static final ItemSpade STEEL_SHOVEL = new ToolSpade("steel_shovel", MATERIAL_STEEL);
	public static final ItemPickaxe STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", MATERIAL_STEEL);
	public static final ItemHoe STEEL_HOE = new ToolHoe("steel_hoe", MATERIAL_STEEL);
	public static final ItemAxe STEEL_AXE = new ToolAxe("steel_axe", MATERIAL_STEEL);
	//ARMORS
	public static final Item STEEL_HELMET = new ArmorBase("steel_helmet", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmorBase("steel_chestplate", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmorBase("steel_leggings", ARMOR_MATERIAL_STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmorBase("steel_boots", ARMOR_MATERIAL_STEEL, 1, EntityEquipmentSlot.FEET);
	public static final Item CARBON_CHESTPLATE = new ArmorModel("carbon_chestplate", ARMOR_MATERIAL_CARBON, 1, EntityEquipmentSlot.CHEST);
	public static final Item POWER_CHESTPLATE = new ArmorPower("power_chestplate", ARMOR_MATERIAL_POWER, 1, EntityEquipmentSlot.CHEST);
	public static final Item POWER_HELMET = new ArmorPower("power_helmet", ARMOR_MATERIAL_POWER, 1, EntityEquipmentSlot.HEAD);
	public static final Item POWER_LEGGINGS = new ArmorPower("power_leggings", ARMOR_MATERIAL_POWER, 1, EntityEquipmentSlot.LEGS);
	//CONSUMABLES
	public static final Item CALORY_MINE = new FoodBase("calory_mine", 10, 14f, false);
}
