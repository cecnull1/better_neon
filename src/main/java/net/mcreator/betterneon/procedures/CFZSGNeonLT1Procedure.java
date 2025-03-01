package net.mcreator.betterneon.procedures;

import net.minecraft.world.entity.Entity;

public class CFZSGNeonLT1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("ZSGNeonLT1", true);
	}
}
