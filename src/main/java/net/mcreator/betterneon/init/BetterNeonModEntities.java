
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.betterneon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.entity.ZuZhouHorseEntity;
import net.mcreator.betterneon.entity.ZuZhouBoatEntity;
import net.mcreator.betterneon.entity.ZhanWeiWolfyEntity;
import net.mcreator.betterneon.entity.ZhanWeiDarkYufengEntity;
import net.mcreator.betterneon.BetterNeonMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BetterNeonModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, BetterNeonMod.MODID);
	public static final RegistryObject<EntityType<ZhanWeiWolfyEntity>> ZHAN_WEI_WOLFY = register("zhan_wei_wolfy",
			EntityType.Builder.<ZhanWeiWolfyEntity>of(ZhanWeiWolfyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZhanWeiWolfyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZhanWeiDarkYufengEntity>> ZHAN_WEI_DARK_YUFENG = register("zhan_wei_dark_yufeng",
			EntityType.Builder.<ZhanWeiDarkYufengEntity>of(ZhanWeiDarkYufengEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZhanWeiDarkYufengEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZuZhouBoatEntity>> ZU_ZHOU_BOAT = register("zu_zhou_boat",
			EntityType.Builder.<ZuZhouBoatEntity>of(ZuZhouBoatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZuZhouBoatEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ZuZhouHorseEntity>> ZU_ZHOU_HORSE = register("zu_zhou_horse",
			EntityType.Builder.<ZuZhouHorseEntity>of(ZuZhouHorseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZuZhouHorseEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ZhanWeiWolfyEntity.init();
			ZhanWeiDarkYufengEntity.init();
			ZuZhouBoatEntity.init();
			ZuZhouHorseEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZHAN_WEI_WOLFY.get(), ZhanWeiWolfyEntity.createAttributes().build());
		event.put(ZHAN_WEI_DARK_YUFENG.get(), ZhanWeiDarkYufengEntity.createAttributes().build());
		event.put(ZU_ZHOU_BOAT.get(), ZuZhouBoatEntity.createAttributes().build());
		event.put(ZU_ZHOU_HORSE.get(), ZuZhouHorseEntity.createAttributes().build());
	}
}
