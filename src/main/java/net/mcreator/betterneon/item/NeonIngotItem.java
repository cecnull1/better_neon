
package net.mcreator.betterneon.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.betterneon.procedures.NeonIngotDangYouJianDianJiKongQiShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModTabs;

public class NeonIngotItem extends Item {
	public NeonIngotItem() {
		super(new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(20).saturationMod(20f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 30;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NeonIngotDangYouJianDianJiKongQiShiProcedure.execute(world, entity);
		return retval;
	}
}
