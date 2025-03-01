package net.mcreator.betterneon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class SMYS3DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemStack_1 = ItemStack.EMPTY;
		ItemStack ItemStack_2 = ItemStack.EMPTY;
		// 1
		ItemStack_1 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY);
		ItemStack_2 = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("changed_addon:dark_latex_coat_cap")));
		(ItemStack_2).enchant(Enchantments.BINDING_CURSE, 1);
		if (!(ItemStack_1.getItem() == Blocks.AIR.asItem() || ItemStack_1.getItem() == ItemStack_2.getItem())) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, ItemStack_1);
				entityToSpawn.setPickUpDelay(0);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(3, ItemStack_2);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.HEAD, ItemStack_2);
			}
		} // 2
		ItemStack_1 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY);
		ItemStack_2 = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("changed_addon:dark_latex_coat")));
		(ItemStack_2).enchant(Enchantments.BINDING_CURSE, 1);
		if (!(ItemStack_1.getItem() == Blocks.AIR.asItem() || ItemStack_1.getItem() == ItemStack_2.getItem())) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, ItemStack_1);
				entityToSpawn.setPickUpDelay(0);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
		{
			Entity _entity = entity;
			if (_entity instanceof Player _player) {
				_player.getInventory().armor.set(2, ItemStack_2);
				_player.getInventory().setChanged();
			} else if (_entity instanceof LivingEntity _living) {
				_living.setItemSlot(EquipmentSlot.CHEST, ItemStack_2);
			}
		}
	}
}
