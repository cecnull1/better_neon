
package net.mcreator.betterneon.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.betterneon.init.BetterNeonModFluids;

public class NeonLT3Item extends BucketItem {
	public NeonLT3Item() {
		super(BetterNeonModFluids.NEON_LT_3, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MATERIALS));
	}
}
