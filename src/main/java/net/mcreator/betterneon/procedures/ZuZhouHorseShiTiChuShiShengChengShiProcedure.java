package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ZuZhouHorseShiTiChuShiShengChengShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		NeonBlockCGH1DangGuFenChengGongShiYongShiProcedure.execute(world, x, y, z);
	}
}
