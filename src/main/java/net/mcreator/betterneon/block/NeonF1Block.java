
package net.mcreator.betterneon.block;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.betterneon.procedures.SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.procedures.NeonF1DangZhiWuBeiYouJianDianJiShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.List;
import java.util.Collections;

public class NeonF1Block extends DoublePlantBlock {
	public NeonF1Block() {
		super(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).instabreak().noCollission());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		if (state.getValue(HALF) != DoubleBlockHalf.LOWER)
			return Collections.emptyList();
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 4));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(BetterNeonModBlocks.NEON_BLOCK.get()) || groundState.is(BetterNeonModBlocks.NEON_BLOCK_CGH_1.get()) || groundState.is(BetterNeonModBlocks.NEON_ICE.get()) || groundState.is(BetterNeonModBlocks.NEON_LT_1.get())
				|| groundState.is(BetterNeonModBlocks.NEON_LT_3.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		if (blockstate.getValue(HALF) == DoubleBlockHalf.UPPER)
			return groundState.is(this) && groundState.getValue(HALF) == DoubleBlockHalf.LOWER;
		else
			return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.PLAINS;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		NeonF1DangZhiWuBeiYouJianDianJiShiProcedure.execute(entity);
		return InteractionResult.SUCCESS;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BetterNeonModBlocks.NEON_F_1.get(), renderType -> renderType == RenderType.cutout());
	}
}
