package net.mcreator.betterneon.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class NeonLT1DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemStack_1 = ItemStack.EMPTY;
		boolean ev_eq_e = false;
		entity.setAirSupply(300);
		SMYS1DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		Enchantment enchantment_wfxc = ForgeRegistries.ENCHANTMENTS.getValue(new ResourceLocation("noride2:wufaxiacheng"));
		if (entity instanceof Player) {
			NaIWuRanChuFaProcedure.execute(entity);
		}
		if (world.getLevelData().getGameRules().getBoolean(BetterNeonModGameRules.NEON_LT_1_GAMERULE_1)) {
			if (!(entity instanceof Player) && !entity.isVehicle()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entity == entityiterator || !(entityiterator instanceof Player)) {
							continue;
						}
						entityiterator.startRiding(entity);
					}
				}
			}
		}
		if (!(entity instanceof Boat)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.001), (entity.getDeltaMovement().z())));
		}
		if (entity.isVehicle()) {
			for (Entity entityiterator : new ArrayList<>(entity.getPassengers())) {
				LegBuKongQIProcedure.execute(entityiterator);
				AZProcedure.execute(entityiterator);
			}
		}
	}
}
