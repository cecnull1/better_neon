
package net.mcreator.betterneon.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.init.BetterNeonModParticleTypes;
import net.mcreator.betterneon.init.BetterNeonModItems;
import net.mcreator.betterneon.init.BetterNeonModFluids;
import net.mcreator.betterneon.init.BetterNeonModBlocks;

public abstract class NoSpNeonLT1Fluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BetterNeonModFluids.NO_SP_NEON_LT_1, BetterNeonModFluids.FLOWING_NO_SP_NEON_LT_1,
			FluidAttributes.builder(new ResourceLocation("better_neon:blocks/neon_lt1"), new ResourceLocation("better_neon:blocks/neon_lt1"))

					.density(0).viscosity(-10)

	).explosionResistance(100f).canMultiply()

			.bucket(BetterNeonModItems.NO_SP_NEON_LT_1_BUCKET).block(() -> (LiquidBlock) BetterNeonModBlocks.NO_SP_NEON_LT_1.get());

	private NoSpNeonLT1Fluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (BetterNeonModParticleTypes.NEON_LT_2.get());
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0);
	}

	public static class Source extends NoSpNeonLT1Fluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NoSpNeonLT1Fluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
