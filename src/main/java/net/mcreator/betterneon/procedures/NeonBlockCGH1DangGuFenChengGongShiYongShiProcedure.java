package net.mcreator.betterneon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import java.util.Comparator;

public class NeonBlockCGH1DangGuFenChengGongShiYongShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Entity Entity_2 = null;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new Horse(EntityType.HORSE, _level);
			entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		Entity_2 = (Entity) world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, (y + 1), z), 1, 1, 1), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, (y + 1), z)).findFirst().orElse(null);
		if (!(Entity_2 == null)) {
			Entity_2.getPersistentData().putBoolean("WFXC", true);
		}
	}
}
