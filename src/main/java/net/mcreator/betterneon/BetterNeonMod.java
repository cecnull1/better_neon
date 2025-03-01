/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.betterneon;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.betterneon.init.BetterNeonModTabs;
import net.mcreator.betterneon.init.BetterNeonModPotions;
import net.mcreator.betterneon.init.BetterNeonModParticleTypes;
import net.mcreator.betterneon.init.BetterNeonModMobEffects;
import net.mcreator.betterneon.init.BetterNeonModItems;
import net.mcreator.betterneon.init.BetterNeonModFluids;
import net.mcreator.betterneon.init.BetterNeonModFeatures;
import net.mcreator.betterneon.init.BetterNeonModEntities;
import net.mcreator.betterneon.init.BetterNeonModBlocks;
import net.mcreator.betterneon.init.BetterNeonModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("better_neon")
public class BetterNeonMod {
	public static final Logger LOGGER = LogManager.getLogger(BetterNeonMod.class);
	public static final String MODID = "better_neon";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public BetterNeonMod() {
		BetterNeonModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BetterNeonModBlocks.REGISTRY.register(bus);
		BetterNeonModItems.REGISTRY.register(bus);
		BetterNeonModEntities.REGISTRY.register(bus);

		BetterNeonModFeatures.REGISTRY.register(bus);

		BetterNeonModMobEffects.REGISTRY.register(bus);
		BetterNeonModPotions.REGISTRY.register(bus);
		BetterNeonModBiomes.REGISTRY.register(bus);
		BetterNeonModParticleTypes.REGISTRY.register(bus);

		BetterNeonModFluids.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
