package net.mcreator.betterneon.procedures;

import net.minecraft.world.entity.Entity;

public class NaIWuRanChuFaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("NaiWuRan", true);
	}
}
