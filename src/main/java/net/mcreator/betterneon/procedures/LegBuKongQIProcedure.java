package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.init.BetterNeonModItems;

public class LegBuKongQIProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemStack_1 = ItemStack.EMPTY;
		ItemStack_1 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
		if (ItemStack_1.getItem() == Blocks.AIR.asItem()) {
			ItemStack_1 = new ItemStack(BetterNeonModItems.AIR_1_LEGGINGS.get());
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, ItemStack_1);
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, ItemStack_1);
				}
			}
		}
	}
}
