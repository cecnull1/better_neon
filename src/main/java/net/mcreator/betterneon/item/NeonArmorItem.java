
package net.mcreator.betterneon.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.betterneon.procedures.NeonArmorTouKuiShiJianProcedure;
import net.mcreator.betterneon.init.BetterNeonModTabs;
import net.mcreator.betterneon.init.BetterNeonModItems;

public abstract class NeonArmorItem extends ArmorItem {
	public NeonArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 18, 15, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BetterNeonModItems.NEON_INGOT.get()));
			}

			@Override
			public String getName() {
				return "neon_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends NeonArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "better_neon:textures/models/armor/neon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NeonArmorTouKuiShiJianProcedure.execute(

			);
		}
	}

	public static class Chestplate extends NeonArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "better_neon:textures/models/armor/neon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NeonArmorTouKuiShiJianProcedure.execute(

			);
		}
	}

	public static class Leggings extends NeonArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "better_neon:textures/models/armor/neon_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NeonArmorTouKuiShiJianProcedure.execute(

			);
		}
	}

	public static class Boots extends NeonArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(BetterNeonModTabs.TAB_BETTER_NEON));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "better_neon:textures/models/armor/neon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NeonArmorTouKuiShiJianProcedure.execute(

			);
		}
	}
}
