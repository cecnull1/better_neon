package net.mcreator.betterneon.world.features.treedecorators;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.function.BiConsumer;
import java.util.Random;
import java.util.List;

public class NeonWorldF1FruitDecorator extends CocoaDecorator {
	public static final NeonWorldF1FruitDecorator INSTANCE = new NeonWorldF1FruitDecorator();
	public static com.mojang.serialization.Codec<NeonWorldF1FruitDecorator> codec;
	public static TreeDecoratorType<?> tdt;
	static {
		codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		tdt = new TreeDecoratorType<>(codec);
		tdt.setRegistryName("neon_world_f_1_tree_fruit_decorator");
		ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
	}

	public NeonWorldF1FruitDecorator() {
		super(0.2f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return tdt;
	}

	@Override
	public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> blocks, List<BlockPos> blocks2) {
		if (!(random.nextFloat() >= 0.2F)) {
			int i = blocks.get(0).getY();
			blocks.stream().filter((p_69980_) -> {
				return p_69980_.getY() - i <= 2;
			}).forEach((p_161728_) -> {
				for (Direction direction : Direction.Plane.HORIZONTAL) {
					if (random.nextFloat() <= 0.25F) {
						Direction direction1 = direction.getOpposite();
						BlockPos blockpos = p_161728_.offset(direction1.getStepX(), 0, direction1.getStepZ());
						if (Feature.isAir(level, blockpos)) {
							biConsumer.accept(blockpos, BetterNeonModBlocks.NEON_BLOCK.get().defaultBlockState());
						}
					}
				}
			});
		}
	}
}
