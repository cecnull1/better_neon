
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.betterneon.fluid.NoSpNeonLT1Fluid;
import net.mcreator.betterneon.fluid.NeonLT3Fluid;
import net.mcreator.betterneon.fluid.NeonLT1Fluid;
import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BetterNeonMod.MODID);
	public static final RegistryObject<Fluid> NEON_LT_1 = REGISTRY.register("neon_lt_1", () -> new NeonLT1Fluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NEON_LT_1 = REGISTRY.register("flowing_neon_lt_1", () -> new NeonLT1Fluid.Flowing());
	public static final RegistryObject<Fluid> NEON_LT_3 = REGISTRY.register("neon_lt_3", () -> new NeonLT3Fluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NEON_LT_3 = REGISTRY.register("flowing_neon_lt_3", () -> new NeonLT3Fluid.Flowing());
	public static final RegistryObject<Fluid> NO_SP_NEON_LT_1 = REGISTRY.register("no_sp_neon_lt_1", () -> new NoSpNeonLT1Fluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NO_SP_NEON_LT_1 = REGISTRY.register("flowing_no_sp_neon_lt_1", () -> new NoSpNeonLT1Fluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NEON_LT_1.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NEON_LT_1.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NEON_LT_3.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NEON_LT_3.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NO_SP_NEON_LT_1.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NO_SP_NEON_LT_1.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
