
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, BetterNeonMod.MODID);
	public static final RegistryObject<Potion> SMYS_2 = REGISTRY.register("smys_2", () -> new Potion(new MobEffectInstance(BetterNeonModMobEffects.SMYS_1.get(), 1, 0, false, false)));
	public static final RegistryObject<Potion> SMYS_3_POTION = REGISTRY.register("smys_3_potion", () -> new Potion(new MobEffectInstance(BetterNeonModMobEffects.SMYS_3.get(), 3600, 0, false, true)));
}
