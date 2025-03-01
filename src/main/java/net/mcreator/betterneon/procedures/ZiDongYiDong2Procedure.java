package net.mcreator.betterneon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ZiDongYiDong2Procedure {
	public static void execute(double x, double y, Entity entity) {
		if (entity == null)
			return;
		Entity None = null;
		double nb = 0;
		double nb2 = 0;
		None = entity;
		nb = x;
		nb2 = y;
		double speed = nb / 4.0;
		Vec3 motionVector = entity.getDeltaMovement();
		Vec3 rotationVector = entity.getLookAngle();
		Vec3 newMotion = new Vec3(motionVector.x + speed * Math.sin(rotationVector.x), nb2, motionVector.z + speed * Math.sin(rotationVector.z));
		entity.setDeltaMovement(newMotion);
	}
}
