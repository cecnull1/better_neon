
package net.mcreator.betterneon.world.features;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.Set;
import java.util.List;

public class NeonWorld21Feature extends LakeFeature {
	public static NeonWorld21Feature FEATURE = null;
	public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new NeonWorld21Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("better_neon:neon_world_21", FEATURE,
				new LakeFeature.Configuration(BlockStateProvider.simple(BetterNeonModBlocks.NEON_LT_3.get().defaultBlockState()), BlockStateProvider.simple(BetterNeonModBlocks.NEON_ICE.get().defaultBlockState())));
		PLACED_FEATURE = PlacementUtils.register("better_neon:neon_world_21", CONFIGURED_FEATURE, List.of(CountPlacement.of(ConstantInt.of(2)), CountOnEveryLayerPlacement.of(ConstantInt.of(6)), RarityFilter.onAverageOnceEvery(30)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world")), Level.OVERWORLD,
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world_a_1")));

	public NeonWorld21Feature() {
		super(LakeFeature.Configuration.CODEC);
	}

	public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
