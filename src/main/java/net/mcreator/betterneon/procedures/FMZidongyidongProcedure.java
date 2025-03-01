package net.mcreator.betterneon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

public class FMZidongyidongProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemStack_1 = ItemStack.EMPTY;
		if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.QI_DONG_ZI_DONG_YI_DONG)) {
			ItemStack_1 = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY);
			Enchantment enchantment = ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation("noride2:zidongyidong"));
			if (!(EnchantmentHelper.getItemEnchantmentLevel(enchantment, ItemStack_1) != 0)) {
				ItemStack_1.enchant(enchantment, 1);
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
}
