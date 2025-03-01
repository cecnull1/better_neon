
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BetterNeonModTabs {
	public static CreativeModeTab TAB_BETTER_NEON;

	public static void load() {
		TAB_BETTER_NEON = new CreativeModeTab("tabbetter_neon") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BetterNeonModBlocks.NEON_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
