
package net.mcreator.betterneon.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.procedures.NeonLT3DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModFluids;

public class NeonLT3Block extends LiquidBlock {
	public NeonLT3Block() {
		super(() -> (FlowingFluid) BetterNeonModFluids.NEON_LT_3.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		NeonLT3DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
	}
}
