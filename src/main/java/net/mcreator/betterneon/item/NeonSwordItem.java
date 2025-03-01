
package net.mcreator.betterneon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.procedures.SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModTabs;
import net.mcreator.betterneon.init.BetterNeonModItems;

public class NeonSwordItem extends SwordItem {
	public NeonSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetterNeonModItems.NEON_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
	}
}
