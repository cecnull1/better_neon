
package net.mcreator.betterneon.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.procedures.SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.procedures.NeonBlockCGH1DangGuFenChengGongShiYongShiProcedure;

import java.util.Random;
import java.util.List;
import java.util.Collections;

public class NeonBlockCGH1Block extends Block implements BonemealableBlock {
	public NeonBlockCGH1Block() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 10f).requiresCorrectToolForDrops().friction(1f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 6;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		return retval;
	}

	@Override
	public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
		return true;
	}

	@Override
	public boolean isBonemealSuccess(Level world, Random random, BlockPos pos, BlockState blockstate) {
		return true;
	}

	@Override
	public void performBonemeal(ServerLevel world, Random random, BlockPos pos, BlockState blockstate) {
		NeonBlockCGH1DangGuFenChengGongShiYongShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
