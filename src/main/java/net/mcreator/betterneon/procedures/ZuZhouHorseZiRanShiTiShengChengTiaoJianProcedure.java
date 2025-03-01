package net.mcreator.betterneon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.core.BlockPos;

public class ZuZhouHorseZiRanShiTiShengChengTiaoJianProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !(!world.getEntitiesOfClass(Horse.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) && !world.isEmptyBlock(new BlockPos(x, y - 1, z));
	}
}
