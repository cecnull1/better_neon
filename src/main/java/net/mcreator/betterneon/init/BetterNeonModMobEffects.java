
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.betterneon.potion.Smyx4MobEffect;
import net.mcreator.betterneon.potion.SMYS3MobEffect;
import net.mcreator.betterneon.potion.SMYS1MobEffect;
import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BetterNeonMod.MODID);
	public static final RegistryObject<MobEffect> SMYS_1 = REGISTRY.register("smys_1", () -> new SMYS1MobEffect());
	public static final RegistryObject<MobEffect> SMYS_3 = REGISTRY.register("smys_3", () -> new SMYS3MobEffect());
	public static final RegistryObject<MobEffect> SMYX_4 = REGISTRY.register("smyx_4", () -> new Smyx4MobEffect());
}
