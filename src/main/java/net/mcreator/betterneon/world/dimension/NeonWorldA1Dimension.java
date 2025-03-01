
package net.mcreator.betterneon.world.dimension;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.betterneon.procedures.SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.procedures.SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import net.mcreator.betterneon.init.BetterNeonModBlocks;

import java.util.Set;
import java.util.HashSet;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class NeonWorldA1Dimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(BetterNeonModBlocks.NEON_ICE.get());
			replaceableBlocks.add(BetterNeonModBlocks.NEON_ICE.get());
			replaceableBlocks.add(BetterNeonModBlocks.NEON_ICE.get());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks).addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks).addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(128, true, DimensionSpecialEffects.SkyType.NORMAL, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color.multiply(sunHeight * 0.94 + 0.06, sunHeight * 0.94 + 0.06, sunHeight * 0.91 + 0.09);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return false;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("better_neon:neon_world_a_1"), customEffect));
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getFrom() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world_a_1"))) {

			SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		}
		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("better_neon:neon_world_a_1"))) {

			SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		}
	}
}
