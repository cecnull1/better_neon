
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.betterneon.world.biome.NeonWorldFA1Biome;
import net.mcreator.betterneon.world.biome.NeonWorldF2Biome;
import net.mcreator.betterneon.world.biome.NeonWorldF1Biome;
import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BetterNeonMod.MODID);
	public static final RegistryObject<Biome> NEON_WORLD_F_1 = REGISTRY.register("neon_world_f_1", () -> NeonWorldF1Biome.createBiome());
	public static final RegistryObject<Biome> NEON_WORLD_F_2 = REGISTRY.register("neon_world_f_2", () -> NeonWorldF2Biome.createBiome());
	public static final RegistryObject<Biome> NEON_WORLD_FA_1 = REGISTRY.register("neon_world_fa_1", () -> NeonWorldFA1Biome.createBiome());
}
