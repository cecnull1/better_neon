
package net.mcreator.betterneon.world.features;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.feature.configurations.ReplaceSphereConfiguration;
import net.minecraft.world.level.levelgen.feature.ReplaceBlobsFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.BiasedToBottomInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.Set;
import java.util.List;

public class NeonWorld22Feature extends ReplaceBlobsFeature {
	public static NeonWorld22Feature FEATURE = null;
	public static Holder<ConfiguredFeature<ReplaceSphereConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new NeonWorld22Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("better_neon:neon_world_22", FEATURE,
				new ReplaceSphereConfiguration(BetterNeonModBlocks.NEON_BLOCK.get().defaultBlockState(), BetterNeonModBlocks.NEON_ICE.get().defaultBlockState(), BiasedToBottomInt.of(2, 7)));
		PLACED_FEATURE = PlacementUtils.register("better_neon:neon_world_22", CONFIGURED_FEATURE, List.of(CountPlacement.of(ConstantInt.of(2)), CountOnEveryLayerPlacement.of(ConstantInt.of(6)), RarityFilter.onAverageOnceEvery(10)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world")),
			ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world_a_1")));

	public NeonWorld22Feature() {
		super(ReplaceSphereConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<ReplaceSphereConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
