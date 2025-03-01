
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.betterneon.item.NoSpNeonLT1Item;
import net.mcreator.betterneon.item.NeonWorldItem;
import net.mcreator.betterneon.item.NeonWorldA1Item;
import net.mcreator.betterneon.item.NeonSwordItem;
import net.mcreator.betterneon.item.NeonStickItem;
import net.mcreator.betterneon.item.NeonShovelItem;
import net.mcreator.betterneon.item.NeonPickaxeItem;
import net.mcreator.betterneon.item.NeonLT3Item;
import net.mcreator.betterneon.item.NeonLT1syringeItem;
import net.mcreator.betterneon.item.NeonLT1Item;
import net.mcreator.betterneon.item.NeonIngotItem;
import net.mcreator.betterneon.item.NeonHoeItem;
import net.mcreator.betterneon.item.NeonAxeItem;
import net.mcreator.betterneon.item.NeonArmorItem;
import net.mcreator.betterneon.item.JieNeonWuRanItem;
import net.mcreator.betterneon.item.Air1Item;
import net.mcreator.betterneon.BetterNeonMod;

public class BetterNeonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterNeonMod.MODID);
	public static final RegistryObject<Item> NEON_F_1 = doubleBlock(BetterNeonModBlocks.NEON_F_1, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_ICE = block(BetterNeonModBlocks.NEON_ICE, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_BLOCK_CGH_1 = block(BetterNeonModBlocks.NEON_BLOCK_CGH_1, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_BLOCK = block(BetterNeonModBlocks.NEON_BLOCK, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_ORE = block(BetterNeonModBlocks.NEON_ORE, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_WOOD = block(BetterNeonModBlocks.NEON_WOOD, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_LOG = block(BetterNeonModBlocks.NEON_LOG, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_PLANKS = block(BetterNeonModBlocks.NEON_PLANKS, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_LEAVES = block(BetterNeonModBlocks.NEON_LEAVES, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_STAIRS = block(BetterNeonModBlocks.NEON_STAIRS, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_SLAB = block(BetterNeonModBlocks.NEON_SLAB, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_FENCE = block(BetterNeonModBlocks.NEON_FENCE, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_FENCE_GATE = block(BetterNeonModBlocks.NEON_FENCE_GATE, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_PRESSURE_PLATE = block(BetterNeonModBlocks.NEON_PRESSURE_PLATE, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_BUTTON = block(BetterNeonModBlocks.NEON_BUTTON, BetterNeonModTabs.TAB_BETTER_NEON);
	public static final RegistryObject<Item> NEON_AXE = REGISTRY.register("neon_axe", () -> new NeonAxeItem());
	public static final RegistryObject<Item> NEON_PICKAXE = REGISTRY.register("neon_pickaxe", () -> new NeonPickaxeItem());
	public static final RegistryObject<Item> NEON_SWORD = REGISTRY.register("neon_sword", () -> new NeonSwordItem());
	public static final RegistryObject<Item> NEON_SHOVEL = REGISTRY.register("neon_shovel", () -> new NeonShovelItem());
	public static final RegistryObject<Item> NEON_HOE = REGISTRY.register("neon_hoe", () -> new NeonHoeItem());
	public static final RegistryObject<Item> NEON_INGOT = REGISTRY.register("neon_ingot", () -> new NeonIngotItem());
	public static final RegistryObject<Item> NEON_ARMOR_HELMET = REGISTRY.register("neon_armor_helmet", () -> new NeonArmorItem.Helmet());
	public static final RegistryObject<Item> NEON_ARMOR_CHESTPLATE = REGISTRY.register("neon_armor_chestplate", () -> new NeonArmorItem.Chestplate());
	public static final RegistryObject<Item> NEON_ARMOR_LEGGINGS = REGISTRY.register("neon_armor_leggings", () -> new NeonArmorItem.Leggings());
	public static final RegistryObject<Item> NEON_ARMOR_BOOTS = REGISTRY.register("neon_armor_boots", () -> new NeonArmorItem.Boots());
	public static final RegistryObject<Item> NEON_WORLD = REGISTRY.register("neon_world", () -> new NeonWorldItem());
	public static final RegistryObject<Item> NEON_WORLD_A_1 = REGISTRY.register("neon_world_a_1", () -> new NeonWorldA1Item());
	public static final RegistryObject<Item> AIR_1_HELMET = REGISTRY.register("air_1_helmet", () -> new Air1Item.Helmet());
	public static final RegistryObject<Item> AIR_1_CHESTPLATE = REGISTRY.register("air_1_chestplate", () -> new Air1Item.Chestplate());
	public static final RegistryObject<Item> AIR_1_LEGGINGS = REGISTRY.register("air_1_leggings", () -> new Air1Item.Leggings());
	public static final RegistryObject<Item> AIR_1_BOOTS = REGISTRY.register("air_1_boots", () -> new Air1Item.Boots());
	public static final RegistryObject<Item> NEON_LT_1_BUCKET = REGISTRY.register("neon_lt_1_bucket", () -> new NeonLT1Item());
	public static final RegistryObject<Item> NEON_LT_3_BUCKET = REGISTRY.register("neon_lt_3_bucket", () -> new NeonLT3Item());
	public static final RegistryObject<Item> NO_SP_NEON_LT_1_BUCKET = REGISTRY.register("no_sp_neon_lt_1_bucket", () -> new NoSpNeonLT1Item());
	public static final RegistryObject<Item> ZU_ZHOU_BOAT_SPAWN_EGG = REGISTRY.register("zu_zhou_boat_spawn_egg", () -> new ForgeSpawnEggItem(BetterNeonModEntities.ZU_ZHOU_BOAT, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ZU_ZHOU_HORSE_SPAWN_EGG = REGISTRY.register("zu_zhou_horse_spawn_egg", () -> new ForgeSpawnEggItem(BetterNeonModEntities.ZU_ZHOU_HORSE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> JIE_NEON_WU_RAN = REGISTRY.register("jie_neon_wu_ran", () -> new JieNeonWuRanItem());
	public static final RegistryObject<Item> NEON_STICK = REGISTRY.register("neon_stick", () -> new NeonStickItem());
	public static final RegistryObject<Item> NEON_LT_1SYRINGE = REGISTRY.register("neon_lt_1syringe", () -> new NeonLT1syringeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
