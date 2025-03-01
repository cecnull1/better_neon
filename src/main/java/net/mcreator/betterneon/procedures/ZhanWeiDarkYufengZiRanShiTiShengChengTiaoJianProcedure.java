package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.init.BetterNeonModBlocks;

public class ZhanWeiDarkYufengZiRanShiTiShengChengTiaoJianProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		BlockState local_bs = Blocks.AIR.defaultBlockState();
		local_bs = (world.getBlockState(new BlockPos(x, y - 1, z)));
		return local_bs.getBlock() == BetterNeonModBlocks.NEON_BLOCK.get() || local_bs.getBlock() == BetterNeonModBlocks.NEON_BLOCK_CGH_1.get() || local_bs.getBlock() == BetterNeonModBlocks.NEON_LEAVES.get()
				|| local_bs.getBlock() == BetterNeonModBlocks.NEON_ICE.get() || local_bs.getBlock() == BetterNeonModBlocks.NEON_LT_1.get() || local_bs.getBlock() == BetterNeonModBlocks.NEON_LT_3.get();
	}
}
