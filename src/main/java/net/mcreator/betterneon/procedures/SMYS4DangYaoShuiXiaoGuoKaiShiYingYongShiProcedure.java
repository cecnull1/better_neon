package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.betterneon.init.BetterNeonModGameRules;

public class SMYS4DangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity None = null;
		String transfur = "";
		AZProcedure.execute(entity);
		entity.getPersistentData().putBoolean("Noride2_BN_C_JH_TF", true);
		entity.getPersistentData().putDouble("Noride2_BN_C_JH_TF_TYPE", (world.getLevelData().getGameRules().getInt(BetterNeonModGameRules.TRANSFUR_TYPE)));
	}
}
