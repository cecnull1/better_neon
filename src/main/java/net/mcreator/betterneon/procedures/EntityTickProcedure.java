package net.mcreator.betterneon.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class EntityTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity Entity_1 = null;
		ItemStack ItenStack_1 = ItemStack.EMPTY;
		if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.WFSCZDQC)) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entity == entityiterator || !entityiterator.getPersistentData().getBoolean("WFXC")) {
						continue;
					}
					Entity_1 = entityiterator;
					break;
				}
			}
		}
		if (!(Entity_1 == null)) {
			if (Entity_1 instanceof Horse) {
				if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.HORSEWFSC_2)) {
					if ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(0, Entity_1)).getItem() == Blocks.AIR.asItem()) {
						ItenStack_1 = new ItemStack(Items.SADDLE);
						{
							final int _slotid = 0;
							final ItemStack _setstack = ItenStack_1;
							_setstack.setCount(1);
							Entity_1.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable _modHandler)
									_modHandler.setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.HORSEWFSC_1)) {
					if ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(1, Entity_1)).getItem() == Blocks.AIR.asItem()) {
						ItenStack_1 = new ItemStack(Items.DIAMOND_HORSE_ARMOR);
						{
							final int _slotid = 1;
							final ItemStack _setstack = ItenStack_1;
							_setstack.setCount(1);
							Entity_1.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable _modHandler)
									_modHandler.setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			Entity_1.stopRiding();
			entity.startRiding(Entity_1);
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.WD_1)) {
				if (Entity_1.isAlive()) {
					if (Entity_1 instanceof LivingEntity _entity)
						_entity.setHealth((float) Double.POSITIVE_INFINITY);
				}
			}
			LegBuKongQIProcedure.execute(entity);
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.QI_SHANG_SHOU_HUA)) {
				if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.RUO_XING_SHOU_HUA_1)) {
					SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
				} else {
					SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
				}
			} else {
				AZProcedure.execute(entity);
			}
			FMZidongyidongProcedure.execute(world, entity);
		}
		if (entity.getPersistentData().getBoolean("NaiWuRan")) {
			if (entity.isPassenger()) {
				(entity.getVehicle()).getPersistentData().putBoolean("WFXC", true);
			}
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.WD_2)) {
				if (entity.isAlive()) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth((float) Double.POSITIVE_INFINITY);
				}
			}
			if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.NWRSH)) {
				SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
			}
		}
		entity.getPersistentData().putBoolean("BetterNeon_NaiWuRan", (entity.getPersistentData().getBoolean("NaiWuRan")));
		if (entity.getPersistentData().getBoolean("ZSGNeonLT1")) {
			NeonLT1syringeWanJiaWanChengShiYongWuPinShiProcedure.execute(world, x, y, z, entity);
		}
	}
}
