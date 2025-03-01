package net.mcreator.betterneon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class Zidongyidong1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		Entity None = null;
		None = entity;
		double speed = 0.125 / 4;
		boolean adjustY = false;
		Vec3 motionVector = entity.getDeltaMovement();
		Vec3 rotationVector = entity.getLookAngle();
		Vec3 newMotion = new Vec3(motionVector.x + speed * Math.sin(rotationVector.x), adjustY ? (motionVector.y + speed * Math.sin(rotationVector.y)) : motionVector.y, motionVector.z + speed * Math.sin(rotationVector.z));
		entity.setDeltaMovement(newMotion);
	}
}
