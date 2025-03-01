
package net.mcreator.betterneon.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.betterneon.init.BetterNeonModFluids;

public class NoSpNeonLT1Block extends LiquidBlock {
	public NoSpNeonLT1Block() {
		super(() -> (FlowingFluid) BetterNeonModFluids.NO_SP_NEON_LT_1.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
