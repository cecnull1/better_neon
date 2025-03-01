
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.betterneon.world.features.plants.NeonF1Feature;
import net.mcreator.betterneon.world.features.ores.NeonOreFeature;
import net.mcreator.betterneon.world.features.NeonWorld2Feature;
import net.mcreator.betterneon.world.features.NeonWorld22Feature;
import net.mcreator.betterneon.world.features.NeonWorld21Feature;
import net.mcreator.betterneon.world.features.EChestFeature;
import net.mcreator.betterneon.BetterNeonMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class BetterNeonModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, BetterNeonMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> NEON_F_1 = register("neon_f_1", NeonF1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, NeonF1Feature.GENERATE_BIOMES, NeonF1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NEON_ORE = register("neon_ore", NeonOreFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NeonOreFeature.GENERATE_BIOMES, NeonOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> E_CHEST = register("e_chest", EChestFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EChestFeature.GENERATE_BIOMES, EChestFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NEON_WORLD_2 = register("neon_world_2", NeonWorld2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, NeonWorld2Feature.GENERATE_BIOMES, NeonWorld2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NEON_WORLD_21 = register("neon_world_21", NeonWorld21Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, NeonWorld21Feature.GENERATE_BIOMES, NeonWorld21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NEON_WORLD_22 = register("neon_world_22", NeonWorld22Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, NeonWorld22Feature.GENERATE_BIOMES, NeonWorld22Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
