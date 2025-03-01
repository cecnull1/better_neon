package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class NeonLT3DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState BlockState_ = Blocks.AIR.defaultBlockState();
		BlockState_ = (world.getBlockState(new BlockPos(x, y, z)));
		NeonLT1DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure.execute(world, x, y, z, entity);
		BlockState_ = BlockState_.getBlock().defaultBlockState();
		if (entity instanceof Player) {
			SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		}
		world.setBlock(new BlockPos(x, y, z), BlockState_, 3);
	}
}
