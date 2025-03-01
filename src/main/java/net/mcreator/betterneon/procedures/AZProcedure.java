package net.mcreator.betterneon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

public class AZProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Entity None = null;
		None = entity;
		Enchantment enchantment_1 = ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation("enigmaticlegacy:eternal_binding_curse"));
		if (entity instanceof Player _player) {
			for (ItemStack ItemStack_2 : _player.getInventory().armor) {
				if (ItemStack_2.isEmpty()) {
					continue;
				}
				if (enchantment_1 != null) {
					if (!(EnchantmentHelper.getItemEnchantmentLevel(enchantment_1, ItemStack_2) != 0)) {
						(ItemStack_2).enchant(enchantment_1, 1);
					}
				} else {
					if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, ItemStack_2) != 0)) {
						(ItemStack_2).enchant(Enchantments.BINDING_CURSE, 1);
					}
				}
				(ItemStack_2).getOrCreateTag().putBoolean("Unbreakable", true);
			}
		}
	}
}
