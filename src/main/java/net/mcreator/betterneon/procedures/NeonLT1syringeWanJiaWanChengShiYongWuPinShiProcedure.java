package net.mcreator.betterneon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class NeonLT1syringeWanJiaWanChengShiYongWuPinShiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		NeonLT1DangShengWuWanJiaPengZhuangZheGeFangKuaiShiProcedure.execute(world, x, y, z, entity);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, (int) Double.POSITIVE_INFINITY, 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, (int) Double.POSITIVE_INFINITY, 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, (int) Double.POSITIVE_INFINITY, 14, false, false));
	}
}
