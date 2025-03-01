
package net.mcreator.betterneon.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.betterneon.procedures.JieNeonWuRanDangShiTiHuiDongWuPinShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModTabs;

public class JieNeonWuRanItem extends Item {
	public JieNeonWuRanItem() {
		super(new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON).durability(1).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		JieNeonWuRanDangShiTiHuiDongWuPinShiProcedure.execute(entity, itemstack);
		return retval;
	}
}
