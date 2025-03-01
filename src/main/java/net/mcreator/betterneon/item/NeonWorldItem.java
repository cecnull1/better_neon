
package net.mcreator.betterneon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.procedures.SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModTabs;
import net.mcreator.betterneon.block.NeonWorldPortalBlock;

public class NeonWorldItem extends Item {
	public NeonWorldItem() {
		super(new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON).durability(64));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Player entity = context.getPlayer();
		BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
		ItemStack itemstack = context.getItemInHand();
		Level world = context.getLevel();
		if (!entity.mayUseItemAt(pos, context.getClickedFace(), itemstack)) {
			return InteractionResult.FAIL;
		} else {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			boolean success = false;
			if (world.isEmptyBlock(pos) && true) {
				NeonWorldPortalBlock.portalSpawn(world, pos);
				itemstack.hurtAndBreak(1, entity, c -> c.broadcastBreakEvent(context.getHand()));
				success = true;
			}

			SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
			return InteractionResult.SUCCESS;
		}
	}
}
