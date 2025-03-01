
package net.mcreator.betterneon.world.features;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.Set;
import java.util.List;

public class NeonWorld2Feature extends GeodeFeature {
	public static NeonWorld2Feature FEATURE = null;
	public static Holder<ConfiguredFeature<GeodeConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new NeonWorld2Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("better_neon:neon_world_2", FEATURE,
				new GeodeConfiguration(
						new GeodeBlockSettings(BlockStateProvider.simple(BetterNeonModBlocks.NEON_LT_3.get().defaultBlockState()), BlockStateProvider.simple(BetterNeonModBlocks.NEON_LT_3.get().defaultBlockState()),
								BlockStateProvider.simple(BetterNeonModBlocks.NEON_BLOCK.get().defaultBlockState()), BlockStateProvider.simple(BetterNeonModBlocks.NEON_BLOCK.get().defaultBlockState()),
								BlockStateProvider.simple(BetterNeonModBlocks.NEON_BLOCK.get().defaultBlockState()), List.of(BetterNeonModBlocks.NEON_LT_3.get().defaultBlockState()), BlockTags.create(new ResourceLocation("features_cannot_replace")),
								BlockTags.create(new ResourceLocation("geode_invalid_blocks"))),
						new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2), new GeodeCrackSettings(1, 2.0, 2), 0.35, 0.083, true, UniformInt.of(4, 5), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));
		PLACED_FEATURE = PlacementUtils.register("better_neon:neon_world_2", CONFIGURED_FEATURE, List.of(CountOnEveryLayerPlacement.of(ConstantInt.of(6)), RarityFilter.onAverageOnceEvery(10)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world_a_1")));

	public NeonWorld2Feature() {
		super(GeodeConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<GeodeConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
