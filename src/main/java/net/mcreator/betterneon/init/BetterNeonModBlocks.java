
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.betterneon.block.NoSpNeonLT1Block;
import net.mcreator.betterneon.block.NeonWorldPortalBlock;
import net.mcreator.betterneon.block.NeonWorldA1PortalBlock;
import net.mcreator.betterneon.block.NeonWoodBlock;
import net.mcreator.betterneon.block.NeonStairsBlock;
import net.mcreator.betterneon.block.NeonSlabBlock;
import net.mcreator.betterneon.block.NeonPressurePlateBlock;
import net.mcreator.betterneon.block.NeonPlanksBlock;
import net.mcreator.betterneon.block.NeonOreBlock;
import net.mcreator.betterneon.block.NeonLogBlock;
import net.mcreator.betterneon.block.NeonLeavesBlock;
import net.mcreator.betterneon.block.NeonLT3Block;
import net.mcreator.betterneon.block.NeonLT1Block;
import net.mcreator.betterneon.block.NeonIceBlock;
import net.mcreator.betterneon.block.NeonFenceGateBlock;
import net.mcreator.betterneon.block.NeonFenceBlock;
import net.mcreator.betterneon.block.NeonF1Block;
import net.mcreator.betterneon.block.NeonButtonBlock;
import net.mcreator.betterneon.block.NeonBlockCGH1Block;
import net.mcreator.betterneon.block.NeonBlockBlock;
import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterNeonMod.MODID);
	public static final RegistryObject<Block> NEON_F_1 = REGISTRY.register("neon_f_1", () -> new NeonF1Block());
	public static final RegistryObject<Block> NEON_ICE = REGISTRY.register("neon_ice", () -> new NeonIceBlock());
	public static final RegistryObject<Block> NEON_BLOCK_CGH_1 = REGISTRY.register("neon_block_cgh_1", () -> new NeonBlockCGH1Block());
	public static final RegistryObject<Block> NEON_BLOCK = REGISTRY.register("neon_block", () -> new NeonBlockBlock());
	public static final RegistryObject<Block> NEON_ORE = REGISTRY.register("neon_ore", () -> new NeonOreBlock());
	public static final RegistryObject<Block> NEON_WOOD = REGISTRY.register("neon_wood", () -> new NeonWoodBlock());
	public static final RegistryObject<Block> NEON_LOG = REGISTRY.register("neon_log", () -> new NeonLogBlock());
	public static final RegistryObject<Block> NEON_PLANKS = REGISTRY.register("neon_planks", () -> new NeonPlanksBlock());
	public static final RegistryObject<Block> NEON_LEAVES = REGISTRY.register("neon_leaves", () -> new NeonLeavesBlock());
	public static final RegistryObject<Block> NEON_STAIRS = REGISTRY.register("neon_stairs", () -> new NeonStairsBlock());
	public static final RegistryObject<Block> NEON_SLAB = REGISTRY.register("neon_slab", () -> new NeonSlabBlock());
	public static final RegistryObject<Block> NEON_FENCE = REGISTRY.register("neon_fence", () -> new NeonFenceBlock());
	public static final RegistryObject<Block> NEON_FENCE_GATE = REGISTRY.register("neon_fence_gate", () -> new NeonFenceGateBlock());
	public static final RegistryObject<Block> NEON_PRESSURE_PLATE = REGISTRY.register("neon_pressure_plate", () -> new NeonPressurePlateBlock());
	public static final RegistryObject<Block> NEON_BUTTON = REGISTRY.register("neon_button", () -> new NeonButtonBlock());
	public static final RegistryObject<Block> NEON_WORLD_PORTAL = REGISTRY.register("neon_world_portal", () -> new NeonWorldPortalBlock());
	public static final RegistryObject<Block> NEON_WORLD_A_1_PORTAL = REGISTRY.register("neon_world_a_1_portal", () -> new NeonWorldA1PortalBlock());
	public static final RegistryObject<Block> NEON_LT_1 = REGISTRY.register("neon_lt_1", () -> new NeonLT1Block());
	public static final RegistryObject<Block> NEON_LT_3 = REGISTRY.register("neon_lt_3", () -> new NeonLT3Block());
	public static final RegistryObject<Block> NO_SP_NEON_LT_1 = REGISTRY.register("no_sp_neon_lt_1", () -> new NoSpNeonLT1Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NeonF1Block.registerRenderLayer();
			NeonWorldPortalBlock.registerRenderLayer();
			NeonWorldA1PortalBlock.registerRenderLayer();
		}
	}
}
