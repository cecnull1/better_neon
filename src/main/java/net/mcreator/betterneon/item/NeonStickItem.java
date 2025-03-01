
package net.mcreator.betterneon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.betterneon.init.BetterNeonModTabs;

public class NeonStickItem extends Item {
	public NeonStickItem() {
		super(new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON).stacksTo(64).rarity(Rarity.COMMON));
	}
}
