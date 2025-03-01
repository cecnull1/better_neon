
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.betterneon.client.renderer.ZuZhouHorseRenderer;
import net.mcreator.betterneon.client.renderer.ZuZhouBoatRenderer;
import net.mcreator.betterneon.client.renderer.ZhanWeiWolfyRenderer;
import net.mcreator.betterneon.client.renderer.ZhanWeiDarkYufengRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterNeonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BetterNeonModEntities.ZHAN_WEI_WOLFY.get(), ZhanWeiWolfyRenderer::new);
		event.registerEntityRenderer(BetterNeonModEntities.ZHAN_WEI_DARK_YUFENG.get(), ZhanWeiDarkYufengRenderer::new);
		event.registerEntityRenderer(BetterNeonModEntities.ZU_ZHOU_BOAT.get(), ZuZhouBoatRenderer::new);
		event.registerEntityRenderer(BetterNeonModEntities.ZU_ZHOU_HORSE.get(), ZuZhouHorseRenderer::new);
	}
}
