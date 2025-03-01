
package net.mcreator.betterneon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.betterneon.init.BetterNeonModFluids;

public class NoSpNeonLT1Item extends BucketItem {
	public NoSpNeonLT1Item() {
		super(BetterNeonModFluids.NO_SP_NEON_LT_1, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MATERIALS));
	}
}
