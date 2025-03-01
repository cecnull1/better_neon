
package net.mcreator.betterneon.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.betterneon.init.BetterNeonModTabs;
import net.mcreator.betterneon.init.BetterNeonModItems;

public class NeonAxeItem extends AxeItem {
	public NeonAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 25f;
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
		}, 1, -3f, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
	}
}
