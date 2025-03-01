
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BetterNeonMod.MODID);
	public static final RegistryObject<ParticleType<?>> NEON_LT_2 = REGISTRY.register("neon_lt_2", () -> new SimpleParticleType(false));
}
