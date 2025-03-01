package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class NeonIngotDangYouJianDianJiKongQiShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		NaIWuRanChuFaProcedure.execute(entity);
		SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(world, entity);
		NeonF1DangZhiWuBeiYouJianDianJiShiProcedure.execute(entity);
	}
}
