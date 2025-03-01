package net.mcreator.betterneon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class FMWuFaXiaChengProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemStack_1 = ItemStack.EMPTY;
		ItemStack_1 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
		Enchantment enchantment_wfxc = ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation("noride2:wufaxiacheng"));
		if (!(EnchantmentHelper.getItemEnchantmentLevel(enchantment_wfxc, ItemStack_1) != 0)) {
			ItemStack_1.enchant(enchantment_wfxc, 1);
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
